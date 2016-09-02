package org.kotlin.examples

import org.junit.Test
import org.junit.runner.RunWith
import org.kotlin.examples.data.Transaction
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.test.context.ContextConfiguration
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner
import kotlin.test.assertEquals

/**
 * Created by iurii.dziuban on 02.09.2016.
 * Simple kotlin spring integration example
 */
@RunWith(SpringJUnit4ClassRunner::class)
@ContextConfiguration(locations = arrayOf("classpath:application-context.xml"))
class SpringExampleTest {

    @Autowired
    lateinit var transaction : Transaction

    @Test
    fun test() {
        assertEquals(2, transaction.id)
        assertEquals("Iurii", transaction.name)
    }
}