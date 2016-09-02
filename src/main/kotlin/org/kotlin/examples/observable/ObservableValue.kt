package org.kotlin.examples.observable

import kotlin.properties.Delegates

/**
 * Created by iurii.dziuban on 02.09.2016.
 */
class ObservableValue {
    lateinit var observableValue : String
    var name: String by Delegates.observable("<no name>") {
        prop, old, new ->
        observableValue = "$old -> $new"
    }

}