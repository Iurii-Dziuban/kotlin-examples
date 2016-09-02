package org.kotlin.examples.variance

/**
 * Created by iurii.dziuban on 02.09.2016.
 */
abstract class ElementProducer<out T> {
    abstract fun produce() : T
}
