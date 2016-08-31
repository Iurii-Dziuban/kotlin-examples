package org.kotlin.examples

import org.junit.Test
import org.kotlin.examples.data.Transaction
import kotlin.test.assertEquals

/**
 * Created by iurii.dziuban on 23.08.2016.
 */
class TransactionTest {
    @Test
    fun test(){
        val transaction = Transaction(1, "Iurii");
        assertEquals(1, transaction.id);
        assertEquals("Iurii", transaction.name);
    }
}