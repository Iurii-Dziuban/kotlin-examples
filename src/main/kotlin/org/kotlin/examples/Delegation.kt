package org.kotlin.examples

/**
 * Created by iurii.dziuban on 02.09.2016.
 */
interface Base{
    fun getName(): String
}

class BaseImpl() : Base {
    override fun getName():String { return "BaseImpl" }
}

class Delegation(b : Base) : Base by b {
    fun getValue() : String {
        return "Delegation"
    }
}