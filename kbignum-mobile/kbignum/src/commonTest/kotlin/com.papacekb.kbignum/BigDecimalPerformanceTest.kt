package com.papacekb.kbignum

import kotlin.test.Ignore
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.time.ExperimentalTime
import kotlin.time.measureTime

class BigDecimalPerformanceTest {

    // ignored by default
//    @Ignore
    @OptIn(ExperimentalTime::class)
    @Test
    fun testBigDecimalPerformance() {
        var a = BigDecimal(0.0)
        val time = measureTime {
            (1..1_000).forEach { n ->
                a = a.multiply(BigDecimal(n.toDouble()))
                a = a.add(BigDecimal(n.toDouble()))
            }
        }
        println("time = $time")

        var b = com.ionspin.kotlin.bignum.decimal.BigDecimal.fromDouble(0.0)
        val timeComparison = measureTime {
            (1..1_000).forEach { n ->
                b = b.multiply(com.ionspin.kotlin.bignum.decimal.BigDecimal.fromDouble(n.toDouble()))
                b = b.add(com.ionspin.kotlin.bignum.decimal.BigDecimal.fromDouble(n.toDouble()))
            }
        }
        println("time for com.ionspin.kotlin.bignum.integer.BigInteger = $timeComparison")

    }

}