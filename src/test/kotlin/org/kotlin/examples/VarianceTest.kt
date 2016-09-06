package org.kotlin.examples

import org.junit.Test
import org.kotlin.examples.variance.*
import kotlin.test.assertEquals
import kotlin.test.assertFalse

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

        assertEquals("bark", dog.talk())
        assertEquals("meow", cat.talk())
        assertEquals("Rrrrrrrr", Animal(1).talk())

        assertEquals(AnimalComparator(dog).consume(cat), 1)
        assertEquals(AnimalComparator(cat).consume(dog), -1)
        assertEquals(AnimalComparator(dog).consume(dog), 0)

        val animalIterator = AnimalIterator(listOf(cat, dog))
        assertEquals(cat, animalIterator.produce())
        assertEquals(1, animalIterator.index)
        assertEquals(dog, animalIterator.produce())
        assertEquals(2, animalIterator.index)
    }
}