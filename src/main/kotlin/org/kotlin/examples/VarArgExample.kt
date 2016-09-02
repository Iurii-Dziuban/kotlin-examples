package org.kotlin.examples

/**
 * Created by iurii.dziuban on 02.09.2016.
 */
class VarArgExample {
    fun first(vararg names : String) : String {
        names.forEach { name ->
            println(name)
        }
        return names[0]
    }
}