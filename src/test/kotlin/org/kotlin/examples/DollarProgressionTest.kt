package org.kotlin.examples

import org.junit.Test
import org.kotlin.examples.override_operators.Dollar
import org.kotlin.examples.override_operators.DollarProgression
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

/**
 * Created by iurii.dziuban on 22.09.2016.
 */
class DollarProgressionTest {

    @Test(expected = IllegalArgumentException::class)
    fun stepIsZero() {
        DollarProgression(Dollar(1),Dollar(4),0)
    }

    @Test
    fun isEmpty() {
        assertTrue(DollarProgression(Dollar(1),Dollar(3),-1).isEmpty())
        assertTrue(DollarProgression(Dollar(3),Dollar(1),1).isEmpty())
        assertFalse(DollarProgression(Dollar(1),Dollar(2),1).isEmpty())
    }

    @Test
    fun equals() {
        assertTrue(DollarProgression(Dollar(1),Dollar(3),1).equals(DollarProgression(Dollar(1),Dollar(3),1)))
        assertFalse(DollarProgression(Dollar(1),Dollar(2),1).equals(DollarProgression(Dollar(1),Dollar(3),1)))
    }

    @Test
    fun testToString() {
        assertEquals(DollarProgression(Dollar(1),Dollar(3),1).toString(), "$0.01..$0.03 step 1")
        assertEquals(DollarProgression(Dollar(3),Dollar(1),2).toString(), "$0.03..$0.01 step 2")
    }

    @Test
    fun hashcode() {
        assertEquals(DollarProgression(Dollar(1),Dollar(3),1).hashCode(), 1055)
    }

}