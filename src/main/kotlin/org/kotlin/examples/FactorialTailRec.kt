package org.kotlin.examples

import java.math.BigInteger

/**
 * Created by iurii.dziuban on 23.09.2016.
 */
class FactorialTailRec {
    tailrec fun factorial(value: BigInteger, acc:BigInteger) : BigInteger {
        if (value.equals(BigInteger.ONE)){
            return acc;
        } else {
            return factorial(value.minus(BigInteger.ONE), acc.multiply(value))
        }
    }
}