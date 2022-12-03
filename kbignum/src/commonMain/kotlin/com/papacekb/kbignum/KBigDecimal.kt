package com.papacekb.kbignum

expect class KBigDecimal(value: String) {

    constructor(value: Double)

    constructor(value: Long)

    fun abs(): KBigDecimal

    fun abs(mc: KMathContext): KBigDecimal

    fun add(n: KBigDecimal): KBigDecimal

    fun add(n: KBigDecimal, mc: KMathContext): KBigDecimal

    fun byteValueExact(): Byte

    operator fun compareTo(n: KBigDecimal): Int

    fun divide(n: KBigDecimal): KBigDecimal

    fun divide(n: KBigDecimal, scale: Int, roundingMode: KRoundingMode): KBigDecimal

    fun divide(n: KBigDecimal, roundingMode: KRoundingMode): KBigDecimal

    fun divide(n: KBigDecimal, mc: KMathContext): KBigDecimal

    fun divideAndRemainder(n: KBigDecimal): Array<KBigDecimal>

    fun divideAndRemainder(n: KBigDecimal, mc: KMathContext): Array<KBigDecimal>

    fun divideToIntegralValue(n: KBigDecimal): KBigDecimal

    fun divideToIntegralValue(n: KBigDecimal, mc: KMathContext): KBigDecimal

    fun subtract(n: KBigDecimal): KBigDecimal

    fun multiply(n: KBigDecimal): KBigDecimal

    override fun equals(other: Any?): Boolean

    override fun hashCode(): Int

    override fun toString(): String

}