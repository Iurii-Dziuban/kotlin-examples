package org.kotlin.examples.variance

import org.kotlin.examples.variance.animal.Animal

/**
 * Created by iurii.dziuban on 02.09.2016.
 */
class AnimalComparator(val value: Animal) : ElementConsumer<Animal>() {

    override fun consume(value: Animal): Int {
        return this@AnimalComparator.value.value - value.value
    }

}