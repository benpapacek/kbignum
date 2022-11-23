package com.papacekb.kbignum

import kotlin.test.Test
import kotlin.time.ExperimentalTime
import kotlin.time.measureTime

class KBigDecimalPerformanceTest {

    // ignored by default
//    @Ignore
    @OptIn(ExperimentalTime::class)
    @Test
    fun testBigDecimalPerformance() {
        var a = KBigDecimal(0.0)
        val time = measureTime {
            (1..1_000).forEach { n ->
                a = a.multiply(KBigDecimal(n.toDouble()))
                a = a.add(KBigDecimal(n.toDouble()))
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