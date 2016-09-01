package org.kotlin.examples

/**
 * Created by iurii.dziuban on 23.08.2016.
 * Function with when statement
 */
class WhenExample {
    fun whenExample(x : Int) : String {
        return when(x) {
            0 -> "ZERO"
            1 -> "ONE"
            // cast notation could be used in when statement
            // is Int -> "Int"
            else -> "NotBinary"
        }
    }
}