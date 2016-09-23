package org.kotlin.examples

/**
 * Created by iurii.dziuban on 02.09.2016.
 */
sealed class SealedExprExample {
    class Const(val number: Double) : SealedExprExample()
    class Sum(val e1: SealedExprExample, val e2: SealedExprExample) : SealedExprExample()
    object NotANumber : SealedExprExample()

    companion object {
        fun eval(expr: SealedExprExample): Double = when (expr) {
            is Const -> expr.number
            is Sum -> eval(expr.e1) + eval(expr.e2)
            NotANumber -> Double.NaN
        }
    }
}

