package org.kotlin.examples

import org.junit.Test
import java.math.BigInteger
import kotlin.test.assertEquals

/**
 * Created by iurii.dziuban on 23.09.2016.
 */
class FactorialTailRecTest {
    @Test
    fun test() {
        assertEquals(BigInteger.valueOf(6), FactorialTailRec().factorial(BigInteger.valueOf(3), BigInteger.ONE))
        assertEquals(BigInteger.ONE, FactorialTailRec().factorial(BigInteger.ONE, BigInteger.ONE))
    }
}