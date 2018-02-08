package org.kotlin.examples

import org.junit.Test
import org.kotlin.examples.override_operators.Dollar
import org.slf4j.LoggerFactory
import kotlin.test.*

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
 * Range and step functionality
 */
class DollarTest {

    private val LOGGER = LoggerFactory.getLogger(DollarTest::class.java)

    @Test
    fun operatorOverloading() {
        assertEquals(Dollar(25), Dollar(5) + Dollar(20))
        assertEquals(Dollar(25), Dollar(20) + 5)
        assertEquals(Dollar(0), !Dollar(20))
        assertEquals(Dollar(20), +Dollar(20))
        assertEquals(Dollar(-20), -Dollar(20))
    }

    @Test
    fun decrementAndStringTemplate() {
        // String interpolation and val to var feature
        var decrementedDollar = Dollar(20);
        LOGGER.info("Decremented Dollar $decrementedDollar")
        // not working for default val value immediately
        decrementedDollar--
        assertEquals(Dollar(19), decrementedDollar)
    }

    @Test
    fun incrementAndStringTemplate() {
        var incrementedDollar = Dollar(20);
        LOGGER.info("Incremented Dollar $incrementedDollar")
        // not working for default val value immediately
        incrementedDollar++
        assertEquals(Dollar(21), incrementedDollar)
    }

    @Test
    fun copy() {
        assertEquals(Dollar(100), Dollar(20).copy())
        assertEquals(Dollar(10), Dollar(20).copy(10))
        assertEquals(Dollar(100), Dollar().copy())
    }

    @Test
    fun tryCatch() {
        assertEquals(null, Dollar(20)/0)
        assertEquals(Dollar(10), Dollar(20)/2)
    }

    @Test
    fun equalsAndHashcode() {
        assertFalse(Dollar(10).equals(1))
        assertTrue(Dollar(10) == Dollar(10))
        assertFalse(Dollar(10) === Dollar(10))

        assertEquals(10, Dollar(10).hashCode())
    }

    @Test
    fun destructuringObject() {
        val (fiftyCents) = Dollar(50)
        assertEquals(50, fiftyCents)
    }

    @Test
    fun inliningFunction() {
        assertEquals(Dollar().applyRate(Dollar(3), { d ->  d + d }), Dollar(6))
    }

    @Test
    fun infixFunction() {
        assertEquals(Dollar(20), Dollar(10) multiply 2)
    }

    @Test
    fun lazyProperty() {
        val dollarProperty = Dollar(10)
        dollarProperty.oneDollar
        dollarProperty.oneDollar
        assertEquals(Dollar(100), dollarProperty.oneDollar)
    }

    @Test(expected = AssertionError::class)
    fun nullAndStringTemplate() {
        val dollar = null;
        dollar?.let {
            LOGGER.info("Dollar is not null")
            // not working for properties...
            LOGGER.info("Dollar is not null and $dollar.cents")
            assertNull(dollar)
            return
        }
        fail("dollar should not be null")
    }

    @Test
    fun nonNullAndStringTemplate() {
        val dollar = Dollar(50);
        dollar.let {
            LOGGER.info("Dollar is not null and " + dollar.cents)
            // not working for properties...
            LOGGER.info("Dollar is not null and $dollar.cents")
            assertEquals(Dollar(50), dollar)
            return
        }
    }

    @Test
    fun closure() {
        assertEquals(Dollar(30), Dollar().add(Dollar(10))(Dollar(20)))
    }

    @Test
    fun range() {
        val to : MutableList<Dollar> = mutableListOf<Dollar>();
        for (i in Dollar(1)..Dollar(4))
            to.add(i)

        assertEquals(to.size, 4);
        assertTrue(to.contains(Dollar(1)));
        assertTrue(to.contains(Dollar(2)));
        assertTrue(to.contains(Dollar(3)));
        assertTrue(to.contains(Dollar(4)));
    }

    @Test
    fun downto() {
        val downTo : MutableList<Dollar> = mutableListOf<Dollar>();

        for (i in Dollar(4) downTo Dollar(1))
            downTo.add(i)

        assertEquals(downTo.size, 4);
        assertTrue(downTo.contains(Dollar(1)));
        assertTrue(downTo.contains(Dollar(2)));
        assertTrue(downTo.contains(Dollar(3)));
        assertTrue(downTo.contains(Dollar(4)));
    }

    @Test
    fun step() {
        val step : MutableList<Dollar> = mutableListOf<Dollar>();
        for (i in Dollar(1)..Dollar(4) step 2)
            step.add(i)

        assertEquals(2, step.size);
        assertTrue(step.contains(Dollar(1)));
        assertTrue(step.contains(Dollar(3)));
    }
}