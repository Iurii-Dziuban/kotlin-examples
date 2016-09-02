package org.kotlin.examples

import org.junit.Test
import org.kotlin.examples.variance.*

/**
 * Created by iurii.dziuban on 02.09.2016.
 *
 * in/out generic paradigm. value that is never in return (output) and value that is never in parameters(input)
 * gives guaranties to cast from one class (type) to another
 */
class VarianceTest {

    @Test
    fun test() {
        val dog = Dog()
        val cat = Cat()

        // possible
        val producerAny : ElementProducer<Any> = AnimalIterator(listOf(cat, dog));
        // not possible
        //val producerCat : ElementProducer<Cat> = AnimalIterator(listOf(cat, dog));

        val animalComparator = AnimalComparator(cat)

        // possible
        val consumerCat : ElementConsumer<Cat> = AnimalComparator(cat)
        // not possible
        //val consumerAny : ElementConsumer<Any> = AnimalComparator(cat)
    }
}