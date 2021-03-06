package org.kotlin.examples

import org.junit.Test
import org.kotlin.examples.override_operators.Dollar
import org.kotlin.examples.override_operators.DollarRange
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

/**
 * Created by iurii.dziuban on 23.09.2016.
 */
class DollarRangeTest {

    @Test
    fun test() {
        assertFalse(DollarRange(Dollar(1), Dollar(4)).isEmpty())
        assertTrue(DollarRange(Dollar(2), Dollar(1)).isEmpty())
        assertEquals(Dollar(1), DollarRange(Dollar(1), Dollar(4)).start)
        assertEquals(Dollar(4), DollarRange(Dollar(1), Dollar(4)).endInclusive)
    }

}