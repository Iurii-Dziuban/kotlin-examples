package org.kotlin.examples

import org.junit.Test
import kotlin.ReplaceWith

/**
 * Example of using kotlin Intellij tooling for deprecation
 *
 * https://dzone.com/articles/deprecated-annotation-in-kotlin
 */
class DeprecatedTest {

    @Test
    fun deprecated() {
        val s = ""
        assert(isEmpty(s));
    }

    @Deprecated(message = "we are going to replace with String.isEmpty", replaceWith = ReplaceWith(expression = "input.isEmpty()", imports = ["kotlin.String"]))
    fun isEmpty(input: String): Boolean {
        return input == ""
    }
}