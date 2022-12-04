package com.papacekb.kbignum

expect class KBigDecimal(value: String) {

    constructor(value: Double)

    constructor(value: Long)

    fun abs(): KBigDecimal

    fun abs(mc: KMathContext): KBigDecimal

    fun add(n: KBigDecimal): KBigDecimal

    fun add(n: KBigDecimal, mc: KMathContext): KBigDecimal

    fun byteValueExact(): Byte

    fun divide(n: KBigDecimal): KBigDecimal

    fun divide(n: KBigDecimal, scale: Int, roundingMode: KRoundingMode): KBigDecimal

    fun divide(n: KBigDecimal, roundingMode: KRoundingMode): KBigDecimal

    fun divide(n: KBigDecimal, mc: KMathContext): KBigDecimal

    fun divideAndRemainder(n: KBigDecimal): Array<KBigDecimal>

    fun divideAndRemainder(n: KBigDecimal, mc: KMathContext): Array<KBigDecimal>

    fun divideToIntegralValue(n: KBigDecimal): KBigDecimal

    fun divideToIntegralValue(n: KBigDecimal, mc: KMathContext): KBigDecimal

    fun doubleValue(): Double

    fun floatValue(): Float

    fun intValue(): Int

    fun intValueExact(): Int

    fun longValue(): Long

    fun longValueExact(): Long

    fun max(n: KBigDecimal): KBigDecimal

    fun min(n: KBigDecimal): KBigDecimal

    fun movePointLeft(n: Int): KBigDecimal

    fun movePointRight(n: Int): KBigDecimal

    fun multiply(n: KBigDecimal): KBigDecimal

    fun multiply(n: KBigDecimal, mc: KMathContext): KBigDecimal

    fun negate(): KBigDecimal

    fun negate(mc: KMathContext): KBigDecimal

    fun plus(): KBigDecimal

    fun plus(mc: KMathContext): KBigDecimal

    fun pow(n: Int): KBigDecimal

    fun pow(n: Int, mc: KMathContext): KBigDecimal

    fun precision(): Int

    fun remainder(n: KBigDecimal): KBigDecimal

    fun remainder(n: KBigDecimal, mc: KMathContext): KBigDecimal

    fun round(mc: KMathContext): KBigDecimal

    fun scale(): Int

    fun scaleByPowerOfTen(n: Int): KBigDecimal

    fun setScale(scale: Int): KBigDecimal

    fun setScale(scale: Int, roundingMode: KRoundingMode): KBigDecimal

    fun shortValueExact(): Short

    fun signum(): Int

    fun stripTrailingZeroes(): KBigDecimal

    fun subtract(n: KBigDecimal): KBigDecimal

    fun subtract(n: KBigDecimal, mc: KMathContext): KBigDecimal

    fun toBigInteger(): KBigInteger

    fun toBigIntegerExact(): KBigInteger

    fun toEngineeringString(): String

    fun toPlainString(): String

    fun ulp(): KBigDecimal

    fun unscaledValue(): KBigInteger

    operator fun compareTo(n: KBigDecimal): Int

    override fun equals(other: Any?): Boolean

    override fun hashCode(): Int

    override fun toString(): String

}