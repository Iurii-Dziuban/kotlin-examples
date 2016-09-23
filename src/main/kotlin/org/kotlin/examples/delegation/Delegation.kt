package org.kotlin.examples.delegation

/**
 * Created by iurii.dziuban on 02.09.2016.
 */
class Delegation(b : Base) : Base by b {
    fun getValue() : String {
        return "Delegation"
    }
}