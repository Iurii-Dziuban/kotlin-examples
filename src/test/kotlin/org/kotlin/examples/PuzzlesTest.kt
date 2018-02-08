package org.kotlin.examples

import org.junit.Test
import kotlin.test.assertEquals
import kotlin.test.assertNull
import kotlin.test.assertTrue

/**
 * To look at
 * https://github.com/angryziber/kotlin-puzzlers
 */
class PuzzlesTest {

    enum class E { e }

    @Test
    fun exhaustiveEnum() {
        val en = E.e
        val a = when (E.e) {
            en -> "1" // will be known at the runtime so else/other branches should be covered
            PuzzlesTest.E.e -> "2"
        }
        assertEquals("1", a)
    }

    //ClosedRange.contains() converts parameter into Int before checking
    @Test
    fun inclusiveRange() {
        val i = 10.5
        var res = ""
        when (i) {
            in 1..10 -> res = "in"
            !in 1..10 -> res = "!in"
            else -> res = "else"
        }
        assertEquals("in", res)
    }

    @Test
    fun eagerOrLazy() {
        //eager
        val x = listOf(1, 2, 3).filter { print("$it "); it >= 2 }
        println()
        assertEquals(5, x.sum())
        // lazy
        val y = sequenceOf(1, 2, 3).filter { print("$it "); it >= 2 }
        println()
        assertEquals(5, y.sum())
        // or
        val z = listOf(1, 2, 3).asSequence().filter { print("$it "); it >= 2 }
        println()
        assertEquals(5, z.sum())
    }

    @Test(expected = UnsupportedOperationException::class)
    fun isMutable() {
        val readonly = listOf(1, 2, 3)

        if (readonly is MutableList) {
            readonly.add(4)
        }

        assertEquals(readonly, listOf(1,2,3))
    }

    @Test
    fun inclusiveRanges() {
        val range = 0..9 step 3

        assertEquals("0, 3, 6, 9", range.joinToString())
    }

    @Test
    fun mapWithDefault() {
        val map = mapOf<Any, Any>().withDefault{ "default" }
        assertNull(map["1"])
    }

    @Test
    fun reversedRanges() {
        val range = 0..10

        val reverseThenStep = range.reversed().step(3).toList()
        val stepThenReverse = range.step(3).reversed().toList()

        assertEquals(listOf(10, 7, 4, 1), reverseThenStep)
        assertEquals(listOf(9, 6, 3, 0), stepThenReverse)
    }

    @Test
    fun sorted() {
        val list = arrayListOf(1, 5, 3, 2, 4)

        val sortedList = list.sort()

        assertTrue(sortedList is kotlin.Unit)
    }
}