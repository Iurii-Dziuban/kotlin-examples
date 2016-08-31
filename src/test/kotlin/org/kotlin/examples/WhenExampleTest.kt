package org.kotlin.examples

import org.junit.Test
import kotlin.test.assertEquals

/**
 * Created by iurii.dziuban on 23.08.2016.
 */
class WhenExampleTest {

    @Test
    fun test() {
        assertEquals("ZERO", WhenExample().whenExample(0));
        assertEquals("ONE", WhenExample().whenExample(1));
        assertEquals("NotBinary", WhenExample().whenExample(100));
    }
}