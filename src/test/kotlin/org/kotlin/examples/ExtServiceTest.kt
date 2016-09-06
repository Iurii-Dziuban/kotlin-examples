package org.kotlin.examples

import org.junit.Test
import kotlin.test.assertEquals

/**
 * Created by iurii.dziuban on 23.08.2016.
 */
class ExtServiceTest {
    @Test
    fun extServiceCall() {
        assertEquals("Serve", SimpleService().serve())
        assertEquals("ExtServe", SimpleService().extServe())
    }
}