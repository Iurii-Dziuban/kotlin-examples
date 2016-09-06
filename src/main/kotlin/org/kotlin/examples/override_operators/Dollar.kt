package org.kotlin.examples.override_operators

import java.util.concurrent.locks.Lock

/**
 * Created by iurii.dziuban on 01.09.2016.
 *
 */
open class Dollar(var cents: Int = 0) {

    val oneDollar: Dollar by lazy {
        println(Dollar(100))
        Dollar(100)
    }

    operator fun plus(cts: Int): Dollar = Dollar(cents + cts)
    operator fun plus(money: Dollar): Dollar = Dollar(cents + money.cents)
    operator fun unaryMinus(): Dollar = Dollar(-cents)
    operator fun unaryPlus(): Dollar = Dollar(cents)
    operator fun not(): Dollar = Dollar(0)
    operator fun inc(): Dollar = Dollar(cents + 1)
    operator fun dec(): Dollar = Dollar(cents - 1)

    operator fun div(value: Int): Dollar? = try { Dollar(cents / value) } catch (e: Exception) {null}

    operator fun component1(): Int = cents

    fun copy(cents: Int = this.cents) = Dollar(cents)

    // overrides copy optional parameter
    fun copy() = Dollar(100)

    infix fun multiply (value: Int) = Dollar(cents * value)

    // closure
    fun add(a : Dollar) : (Dollar) -> Dollar{
        return { x -> a + x }
    }

    override fun toString() = "$" + (cents.toFloat() / 100.0)

    override fun equals(other: Any?): Boolean{
        if (this === other) return true
        if (other?.javaClass != javaClass) return false

        other as Dollar

        if (cents != other.cents) return false

        return true
    }

    override fun hashCode(): Int{
        return cents
    }

    // inline - one function will be used in runtime no High order functions
    //FIXME inline functions are not shown in the coverage
    /*inline*/ fun lock(lock: Lock, body: () -> Unit) {
        lock.lock()
        try {
            val dollar =  (body())
            println(dollar)
        }
        finally {
            lock.unlock()
        }
    }
}