package org.kotlin.examples

import org.junit.Test
import kotlin.test.assertEquals

class IsNullableCheckTest {

    @Test
    fun isNullableCheck() {
        var nullableFunctions = NullableNonNullableReturnTypeExample::class.members.filter {
            it.returnType.isMarkedNullable
        }
        var nonNullableFunctions = NullableNonNullableReturnTypeExample::class.members.filter {
            !it.returnType.isMarkedNullable
        }
        assertEquals("bar", nullableFunctions[0].name);
        assertEquals("foo", nonNullableFunctions[0].name);
    }
}