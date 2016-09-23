package org.kotlin.examples.variance.animal

/**
 * Created by iurii.dziuban on 02.09.2016.
 */
open class Animal(val value : Int = 1 ) {
    open fun talk() : String {
        return "Rrrrrrrr"
    }
}