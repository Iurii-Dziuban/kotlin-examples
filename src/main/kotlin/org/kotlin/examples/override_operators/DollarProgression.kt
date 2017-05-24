package org.kotlin.examples.override_operators

/**
 * Created by iurii.dziuban on 21.09.2016.
 */
open class DollarProgression
    internal constructor
    (
        start: Dollar,
        endInclusive: Dollar,
        step: Int
    ) : Iterable<Dollar> {

    init {
        if (step == 0) throw IllegalArgumentException("Step must be non-zero")
    }

    val first: Dollar = start

    val last: Dollar = getProgressionLastElement(start.cents, endInclusive.cents, step)

    val step: Int = step

    override fun iterator(): Iterator<Dollar> = DollarProgressionIterator(first, last, step)

    open fun isEmpty(): Boolean = if (step > 0) first > last else first < last

    override fun equals(other: Any?): Boolean =
            other is DollarProgression && (isEmpty() && other.isEmpty() ||
                    first == other.first && last == other.last && step == other.step)

    override fun hashCode(): Int =
            if (isEmpty()) -1 else (31 * (31 * first.cents + last.cents) + step)

    override fun toString(): String = if (step > 0) "$first..$last step $step" else "$first downTo $last step ${-step}"


    infix fun step(step: Int): DollarProgression {
        if (step == 0) throw IllegalArgumentException("Step must be positive, was: $step")
        return Companion.fromClosedRange(first, last, if (step > 0) step else -step)
    }

    companion object {
        fun fromClosedRange(rangeStart: Dollar, rangeEnd: Dollar, step: Int): DollarProgression = DollarProgression(rangeStart, rangeEnd, step)
    }

    internal fun getProgressionLastElement(start: Int, end: Int, step: Int): Dollar {
        if (step >= 0) {
            return Dollar(end - differenceModulo(end, start, step))
        }
        else {
            return Dollar(end + differenceModulo(start, end, -step))
        }
    }

    // a mod b (in arithmetical sense)
    private fun mod(a: Int, b: Int): Int {
        val mod = a % b
        return if (mod >= 0) mod else mod + b
    }

    // (a - b) mod c
    private fun differenceModulo(a: Int, b: Int, c: Int): Int {
        return mod(mod(a, c) - mod(b, c), c)
    }

    internal class DollarProgressionIterator(first: Dollar, last: Dollar, val step: Int) : Iterator<Dollar> {
        private var next = first
        private val finalElement = last
        private var hasNext: Boolean = if (step > 0) first <= last else first >= last

        override fun hasNext(): Boolean = hasNext

        override fun next(): Dollar {
            val value = next
            if (value == finalElement) {
                hasNext = false
            }
            else {
                next += step
            }
            return value
        }
    }
}

