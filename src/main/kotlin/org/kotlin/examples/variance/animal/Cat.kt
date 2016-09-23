package org.kotlin.examples.variance.animal

/**
 * Created by iurii.dziuban on 22.09.2016.
 */
class Cat : Animal(2) {
    override fun talk() : String {
        return "meow"
    }
}