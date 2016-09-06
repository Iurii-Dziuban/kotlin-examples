package org.kotlin.examples

import org.slf4j.LoggerFactory

/**
 * Created by iurii.dziuban on 02.09.2016.
 */
class VarArgExample {
    private val LOGGER = LoggerFactory.getLogger(VarArgExample::class.java)

    fun first(vararg names : String) : String {
        names.forEach { name ->
            LOGGER.info(name)
        }
        return names[0]
    }
}