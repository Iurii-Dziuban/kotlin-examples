package org.kotlin.examples

import org.kotlin.examples.foo

import org.junit.Test
import kotlin.test.assertEquals

/**
 * Created by iurii.dziuban on 23.08.2016.
 */

class TopLevelFunctionTest {

    @Test
    fun topLevel() {
        assertEquals("Foo", foo())
    }
}