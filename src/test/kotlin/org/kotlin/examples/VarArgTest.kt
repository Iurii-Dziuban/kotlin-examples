package org.kotlin.examples

import org.junit.Test
import org.kotlin.examples.data.Transaction
import kotlin.test.assertEquals

/**
 * Created by iurii.dziuban on 02.09.2016.
 */
class VarArgTest {
    @Test
    fun test(){
        val varArg = VarArgExample();
        assertEquals("iurii", varArg.first("iurii", "lampapos", "sukharevd", "vixentael"));
    }
}