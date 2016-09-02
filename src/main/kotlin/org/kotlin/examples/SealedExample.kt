package org.kotlin.examples

/**
 * Created by iurii.dziuban on 02.09.2016.
 */
sealed class Expr {
    class Const(val number: Double) : Expr()
    class Sum(val e1: Expr, val e2: Expr) : Expr()
    object NotANumber : Expr()

    companion object {
        fun eval(expr: Expr): Double = when (expr) {
            is Expr.Const -> expr.number
            is Expr.Sum -> eval(expr.e1) + eval(expr.e2)
            Expr.NotANumber -> Double.NaN
        }
    }
}

