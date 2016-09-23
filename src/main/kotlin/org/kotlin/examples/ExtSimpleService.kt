package org.kotlin.examples

/**
 * Created by iurii.dziuban on 23.08.2016.
 *
 * Adding additional method to the service
 */
class ExtSimpleService {
    fun serve() : String{
        return "Serve"
    }
}

fun ExtSimpleService.extServe() : String {
    return "ExtServe"
}