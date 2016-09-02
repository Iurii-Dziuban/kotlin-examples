package org.kotlin.examples

import org.junit.Test
import org.kotlin.examples.observable.ObservableValue
import kotlin.test.assertEquals

/**
 * Created by iurii.dziuban on 02.09.2016.
 */
class ObservableTest {
    @Test
    fun test() {
        var observableValue = ObservableValue()
        observableValue.name = "one"
        assertEquals("<no name> -> one", observableValue.observableValue)
        observableValue.name = "two"
        assertEquals("one -> two", observableValue.observableValue)
    }
}
