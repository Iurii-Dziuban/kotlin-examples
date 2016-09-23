package org.kotlin.examples

import org.junit.Test
import kotlin.test.assertEquals

/**
 * Created by iurii.dziuban on 02.09.2016.
 */
class SealedTest {
    @Test
    fun test() {
        assertEquals(4.0, SealedExprExample.eval(SealedExprExample.Sum(SealedExprExample.Const(1.0), SealedExprExample.Const(3.0))))
        assertEquals(Double.NaN, SealedExprExample.eval(SealedExprExample.Sum(SealedExprExample.Const(1.0), SealedExprExample.NotANumber)))
    }
}