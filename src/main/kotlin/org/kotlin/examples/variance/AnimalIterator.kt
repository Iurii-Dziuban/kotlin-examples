package org.kotlin.examples.variance

/**
 * Created by iurii.dziuban on 02.09.2016.
 */
class AnimalIterator(val values: List<Animal>) : ElementProducer<Animal>() {
    var index : Int = 0

    override fun produce(): Animal {
        return values[index++]
    }

}