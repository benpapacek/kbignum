package com.papacekb.kbignum

import kotlin.test.Test
import kotlin.test.assertEquals

class KBigDecimalTest {

    @Test
    fun testAbs() {
        assertEquals(KBigDecimal("42"), KBigDecimal("-42").abs())
    }

    @Test
    fun testAbsWithMathContext() {
        val mc = KMathContext(4, KRoundingMode.CEILING)
        assertEquals(KBigDecimal("3.142"), KBigDecimal("3.14159").abs(mc))
    }

    @Test
    fun testBigDecimalAddition() {
        val a = KBigDecimal(42.0)
        val b = KBigDecimal(21.0)
        assertEquals(KBigDecimal(63.0), a.add(b))
    }

    @Test
    fun testBigDecimalSubtraction() {
        val a = KBigDecimal(42.5)
        val b = KBigDecimal(33.1)
        assertEquals(KBigDecimal(9.4), a.subtract(b))
    }

    @Test
    fun testBigDecimalMultiplication() {
        val a = KBigDecimal(42)
        val b = KBigDecimal(1.4)
        assertEquals(KBigDecimal(58.8), a.multiply(b))
    }

    @Test
    fun testBigDecimalDivision() {
        val a = KBigDecimal(42.0)
        val b = KBigDecimal(6.4)
        assertEquals(KBigDecimal(6.5625), a.divide(b))
    }
}