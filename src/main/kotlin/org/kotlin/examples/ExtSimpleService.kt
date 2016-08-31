package org.kotlin.examples

/**
 * Created by iurii.dziuban on 23.08.2016.
 *
 * Adding additional method to the service
 */
class SimpleService {
    fun serve() : String{
        return "Serve"
    }
}

fun SimpleService.extServe() : String {
    return "ExtServe"
}