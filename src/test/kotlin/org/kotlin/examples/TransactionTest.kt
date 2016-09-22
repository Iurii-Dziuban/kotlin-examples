package org.kotlin.examples

import org.junit.Test
import org.kotlin.examples.data.Transaction
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

/**
 * Created by iurii.dziuban on 23.08.2016.
 */
class TransactionTest {
    @Test
    fun test(){
        val transaction = Transaction(1, "Iurii");
        val transaction1 = Transaction(1, "Iurii");

        val (id, name) = transaction;

        assertEquals(1, transaction.id);
        assertEquals("Iurii", transaction.name);

        assertEquals(1, id);
        assertEquals("Iurii", name);

        assertTrue(transaction == transaction1);
        assertTrue(transaction.name == transaction1.name);

        assertFalse{transaction === transaction1};
        assertTrue(transaction.name === transaction1.name);
    }
}