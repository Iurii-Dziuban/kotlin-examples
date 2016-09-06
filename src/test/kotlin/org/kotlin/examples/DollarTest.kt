package org.kotlin.examples

import org.junit.Test
import org.kotlin.examples.override_operators.Dollar
import java.util.concurrent.locks.ReentrantLock
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

/**
 * Created by iurii.dziuban on 01.09.2016.
 *
 * Operator overloading
 * Equals and hashcode override_operators
 * Try/catch expression values
 * Copy value
 * Referential and structural equals
 * Destructuring object
 * Inlining by locking example
 * Infix function
 * Null check do
 * Closure
 */
class DollarTest {
    @Test
    fun plusAndEqualsHashcodeOverrideTest() {
        //Operator overloading
        assertEquals(Dollar(25), Dollar(5) + Dollar(20))
        assertEquals(Dollar(25), Dollar(20) + 5)
        assertEquals(Dollar(0), !Dollar(20))
        assertEquals(Dollar(20), +Dollar(20))
        assertEquals(Dollar(-20), -Dollar(20))

        // String interpolation and val to var feature
        var decrementedDollar = Dollar(20);
        println("Decremented Dollar $decrementedDollar")
        // not working for default val value immediately
        decrementedDollar--
        assertEquals(Dollar(19), decrementedDollar)

        var incrementedDollar = Dollar(20);
        println("Incremented Dollar $incrementedDollar")
        // not working for default val value immediately
        incrementedDollar++
        assertEquals(Dollar(21), incrementedDollar)

        // Copy value with default (optional) value example
        assertEquals(Dollar(100), Dollar(20).copy())
        assertEquals(Dollar(10), Dollar(20).copy(10))
        assertEquals(Dollar(100), Dollar().copy())

        //Try/catch expression values
        assertEquals(null, Dollar(20)/0)
        assertEquals(Dollar(10), Dollar(20)/2)

        //Equals and hashcode override_operators && Referential and structural equals
        assertFalse(Dollar(10).equals(1))
        assertTrue(Dollar(10) == Dollar(10))
        assertFalse(Dollar(10) === Dollar(10))

        assertEquals(10, Dollar(10).hashCode())

        // Destructuring object
        val (fiftyCents) = Dollar(50)
        assertEquals(50, fiftyCents)

        // Inlining by locking example
        assertEquals(Dollar(20), Dollar(10).lock(ReentrantLock(), { println("this " + this); Dollar(20)}));

        //Infix function
        assertEquals(Dollar(20), Dollar(10) multiply 2)

        //Lazy property
        val dollarProperty = Dollar(10)
        assertEquals(Dollar(100), dollarProperty.oneDollar)
        dollarProperty.oneDollar
        dollarProperty.oneDollar

        // null check do
        val dollar = Dollar(50);
        dollar?.let {
            println("Dollar is not null and " + dollar.cents)
            // not working for properties...
            println("Dollar is not null and $dollar.cents")
        }

        // closure
        assertEquals(Dollar(30), Dollar().add(Dollar(10))(Dollar(20)))
    }
}