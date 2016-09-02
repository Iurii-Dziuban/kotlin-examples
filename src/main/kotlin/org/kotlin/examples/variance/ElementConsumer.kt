package org.kotlin.examples.variance

/**
 * Created by iurii.dziuban on 02.09.2016.
 */
abstract class ElementConsumer<in T> {
    abstract fun consume(value: T) : Int
}