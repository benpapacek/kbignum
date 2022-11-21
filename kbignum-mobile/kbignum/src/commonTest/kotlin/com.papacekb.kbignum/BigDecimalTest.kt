package com.papacekb.kbignum

import kotlin.test.Test
import kotlin.test.assertEquals

class BigDecimalTest {

    @Test
    fun testBigDecimalAddition() {
        val a = BigDecimal(42.0)
        val b = BigDecimal(21.0)
        assertEquals(BigDecimal(63.0), a.add(b))
    }

    @Test
    fun testBigDecimalSubtraction() {
        val a = BigDecimal(42.5)
        val b = BigDecimal(33.1)
        assertEquals(BigDecimal(9.4), a.subtract(b))
    }

    @Test
    fun testBigDecimalMultiplication() {
        val a = BigDecimal(42)
        val b = BigDecimal(1.4)
        assertEquals(BigDecimal(58.8), a.multiply(b))
    }

    @Test
    fun testBigDecimalDivision() {
        val a = BigDecimal(42.0)
        val b = BigDecimal(6.4)
        assertEquals(BigDecimal(6.5625), a.divide(b))
    }
}