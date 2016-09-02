package org.kotlin.examples.mapping

/**
 * Created by iurii.dziuban on 02.09.2016.
 */
class Mapping(val map: Map<String, Any?>) {
    val name: String by map
    val age: Int     by map
}