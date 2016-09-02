package org.kotlin.examples

import org.junit.Test
import org.kotlin.examples.mapping.Mapping
import kotlin.test.assertEquals

/**
 * Created by iurii.dziuban on 02.09.2016.
 */
class MappingTest {
    @Test
    fun test() {
        val mapping = Mapping(mapOf(
                "name" to "Iurii Dziuban",
                "age"  to 26
        ))
        assertEquals("Iurii Dziuban", mapping.name)
        assertEquals(26, mapping.age)
    }
}