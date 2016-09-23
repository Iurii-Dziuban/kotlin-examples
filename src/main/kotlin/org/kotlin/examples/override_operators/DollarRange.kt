package org.kotlin.examples.override_operators

/**
 * Created by iurii.dziuban on 21.09.2016.
 */
class DollarRange constructor(start: Dollar, endInclusive: Dollar) : DollarProgression(start, endInclusive, 1), ClosedRange<Dollar> {
    override val endInclusive: Dollar
        get() = super<DollarProgression>.last
    override val start: Dollar
        get() = super<DollarProgression>.first

    override fun isEmpty(): Boolean = start > endInclusive
}