package org.kotlin.examples

/**
 * Created by iurii.dziuban on 23.08.2016.
 * Function with when statement
 */
class WhenExample {
    fun whenExample(x : Int) : String {
        when(x) {
            0 -> return "ZERO"
            1 -> return "ONE"
            else -> return "NotBinary"
        }
    }
}