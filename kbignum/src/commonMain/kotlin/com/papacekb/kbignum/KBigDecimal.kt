package com.papacekb.kbignum

expect class KBigDecimal(value: String) {

    companion object {
        val ONE: KBigDecimal
        val TEN: KBigDecimal
        val ZERO: KBigDecimal
        fun valueOf(value: Double): KBigDecimal
        fun valueOf(value: Long): KBigDecimal
        fun valueOf(unscaledValue: Long, scale: Int): KBigDecimal
    }

    constructor(value: String, mc: KMathContext)

    constructor(value: Double)

    constructor(value: Double, mc: KMathContext)

    constructor(value: Long)

    constructor(value: Long, mc: KMathContext)

    constructor(value: KBigInteger)

    constructor(value: KBigInteger, mc: KMathContext)

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

    fun stripTrailingZeros(): KBigDecimal

    fun subtract(n: KBigDecimal): KBigDecimal

    fun subtract(n: KBigDecimal, mc: KMathContext): KBigDecimal

    fun toBigInteger(): KBigInteger

    fun toBigIntegerExact(): KBigInteger

    fun toEngineeringString(): String

    fun toPlainString(): String

    fun ulp(): KBigDecimal

    fun unscaledValue(): KBigInteger

    operator fun plus(n: KBigDecimal): KBigDecimal

    operator fun minus(n: KBigDecimal): KBigDecimal

    operator fun times(n: KBigDecimal): KBigDecimal

    operator fun div(n: KBigDecimal): KBigDecimal

    operator fun compareTo(n: KBigDecimal): Int

    override fun equals(other: Any?): Boolean

    override fun hashCode(): Int

    override fun toString(): String

}