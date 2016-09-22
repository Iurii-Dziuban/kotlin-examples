package org.kotlin.examples

import org.junit.Test
import kotlin.test.assertEquals

/**
 * Created by iurii.dziuban on 02.09.2016.
 */
class DelegationTest {
    @Test
    fun test() {
        val baseImpl = BaseImpl()
        val delegation = Delegation(baseImpl)
        assertEquals("BaseImpl", delegation.getName())
        assertEquals("Delegation", delegation.getValue())
    }
}