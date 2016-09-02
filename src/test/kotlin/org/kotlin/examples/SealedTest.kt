package org.kotlin.examples

import org.junit.Test
import org.kotlin.examples.override_operators.Dollar
import kotlin.test.assertEquals

/**
 * Created by iurii.dziuban on 02.09.2016.
 */
class SealedTest {
    @Test
    fun test() {
        assertEquals(4.0, Expr.eval(Expr.Sum(Expr.Const(1.0), Expr.Const(3.0))))
    }
}