package org.kotlin.examples.variance

/**
 * Created by iurii.dziuban on 02.09.2016.
 */
open class Animal(val value : Int) {
    open fun talk() : String {
        return "Rrrrrrrr"
    }
}

class Cat : Animal(2) {
    override fun talk() : String {
        return "meow"
    }
}

class Dog : Animal(3) {
    override fun talk() : String {
        return "bark"
    }
}