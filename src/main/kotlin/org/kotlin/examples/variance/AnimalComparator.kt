package org.kotlin.examples.variance

/**
 * Created by iurii.dziuban on 02.09.2016.
 */
class AnimalComparator(val value: Animal) : ElementConsumer<Animal>() {

    override fun consume(value: Animal): Int {
        return this@AnimalComparator.value.value - value.value
    }

}