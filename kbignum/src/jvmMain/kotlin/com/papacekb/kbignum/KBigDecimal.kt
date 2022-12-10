package com.papacekb.kbignum

import java.math.MathContext
import java.math.RoundingMode

actual class KBigDecimal private constructor(private val delegate: java.math.BigDecimal) {

    actual companion object {
        actual val ONE: KBigDecimal = KBigDecimal(1)
        actual val TEN: KBigDecimal = KBigDecimal(10)
        actual val ZERO: KBigDecimal = KBigDecimal(0)
        actual fun valueOf(value: Double): KBigDecimal = KBigDecimal(java.math.BigDecimal.valueOf(value))
        actual fun valueOf(value: Long): KBigDecimal = KBigDecimal(java.math.BigDecimal.valueOf(value))
        actual fun valueOf(unscaledValue: Long, scale: Int): KBigDecimal = KBigDecimal(java.math.BigDecimal.valueOf(unscaledValue, scale))
    }

    actual constructor(value: String): this(java.math.BigDecimal(value))

    actual constructor(value: Double): this(java.math.BigDecimal.valueOf(value))

    actual constructor(value: Long): this(java.math.BigDecimal.valueOf(value))

    actual constructor(value: String, mc: KMathContext) : this(java.math.BigDecimal(value, mc.toMathContext()))

    actual constructor(value: Double, mc: KMathContext) : this(java.math.BigDecimal(value, mc.toMathContext()))

    actual constructor(value: Long, mc: KMathContext) : this(java.math.BigDecimal(value, mc.toMathContext()))

    actual constructor(value: KBigInteger) : this(java.math.BigDecimal(value.toString()))

    actual constructor(value: KBigInteger, mc: KMathContext) : this(java.math.BigDecimal(value.toString(), mc.toMathContext()))

    actual fun abs(): KBigDecimal = KBigDecimal(this.delegate.abs())

    actual fun abs(mc: KMathContext): KBigDecimal = KBigDecimal(this.delegate.abs(mc.toMathContext()))

    actual fun add(n: KBigDecimal): KBigDecimal = KBigDecimal(this.delegate.add(n.delegate))

    actual fun add(n: KBigDecimal, mc: KMathContext): KBigDecimal = KBigDecimal(this.delegate.add(n.delegate, mc.toMathContext()))

    actual fun byteValueExact(): Byte = delegate.byteValueExact()

    actual fun divide(n: KBigDecimal): KBigDecimal = KBigDecimal(delegate.divide(n.delegate))

    actual fun divide(n: KBigDecimal, scale: Int, roundingMode: KRoundingMode): KBigDecimal = KBigDecimal(delegate.divide(n.delegate, scale, roundingMode.toRoundingMode()))

    actual fun divide(n: KBigDecimal, roundingMode: KRoundingMode): KBigDecimal = KBigDecimal(delegate.divide(n.delegate, roundingMode.toRoundingMode()))

    actual fun divide(n: KBigDecimal, mc: KMathContext): KBigDecimal = KBigDecimal(delegate.divide(n.delegate, mc.toMathContext()))

    actual fun divideAndRemainder(n: KBigDecimal): Array<KBigDecimal> = delegate.divideAndRemainder(n.delegate).map { KBigDecimal(it) }.toTypedArray()

    actual fun divideAndRemainder(n: KBigDecimal, mc: KMathContext): Array<KBigDecimal> =
        delegate.divideAndRemainder(n.delegate, mc.toMathContext()).map { KBigDecimal(it) }.toTypedArray()

    actual fun divideToIntegralValue(n: KBigDecimal): KBigDecimal = KBigDecimal(delegate.divideToIntegralValue(n.delegate))

    actual fun divideToIntegralValue(n: KBigDecimal, mc: KMathContext): KBigDecimal = KBigDecimal(delegate.divideToIntegralValue(n.delegate, mc.toMathContext()))

    actual fun doubleValue(): Double = delegate.toDouble()

    actual fun floatValue(): Float = delegate.toFloat()

    actual fun intValue(): Int = delegate.toInt()

    actual fun intValueExact(): Int = delegate.intValueExact()

    actual fun longValue(): Long = delegate.toLong()

    actual fun longValueExact(): Long = delegate.longValueExact()

    actual fun max(n: KBigDecimal): KBigDecimal = KBigDecimal(delegate.max(n.delegate))

    actual fun min(n: KBigDecimal): KBigDecimal = KBigDecimal(delegate.min(n.delegate))

    actual fun movePointLeft(n: Int): KBigDecimal = KBigDecimal(delegate.movePointLeft(n))

    actual fun movePointRight(n: Int): KBigDecimal = KBigDecimal(delegate.movePointRight(n))

    actual fun multiply(n: KBigDecimal): KBigDecimal = KBigDecimal(delegate.multiply(n.delegate))

    actual fun multiply(n: KBigDecimal, mc: KMathContext): KBigDecimal = KBigDecimal(delegate.multiply(n.delegate, mc.toMathContext()))

    actual fun negate(): KBigDecimal = KBigDecimal(delegate.negate())

    actual fun negate(mc: KMathContext): KBigDecimal = KBigDecimal(delegate.negate(mc.toMathContext()))

    actual fun plus(): KBigDecimal = KBigDecimal(delegate.plus())

    actual fun plus(mc: KMathContext): KBigDecimal = KBigDecimal(delegate.plus(mc.toMathContext()))

    actual fun pow(n: Int): KBigDecimal = KBigDecimal(delegate.pow(n))

    actual fun pow(n: Int, mc: KMathContext): KBigDecimal = KBigDecimal(delegate.pow(n, mc.toMathContext()))

    actual fun precision(): Int = delegate.precision()

    actual fun remainder(n: KBigDecimal): KBigDecimal = KBigDecimal(delegate.remainder(n.delegate))

    actual fun remainder(n: KBigDecimal, mc: KMathContext): KBigDecimal = KBigDecimal(delegate.remainder(n.delegate, mc.toMathContext()))

    actual fun round(mc: KMathContext): KBigDecimal = KBigDecimal(delegate.round(mc.toMathContext()))

    actual fun scale(): Int = delegate.scale()

    actual fun scaleByPowerOfTen(n: Int): KBigDecimal = KBigDecimal(delegate.scaleByPowerOfTen(n))

    actual fun setScale(scale: Int): KBigDecimal = KBigDecimal(delegate.setScale(scale))

    actual fun setScale(scale: Int, roundingMode: KRoundingMode): KBigDecimal = KBigDecimal(delegate.setScale(scale, roundingMode.toRoundingMode()))

    actual fun shortValueExact(): Short = delegate.shortValueExact()

    actual fun signum(): Int = delegate.signum()

    actual fun stripTrailingZeros(): KBigDecimal = KBigDecimal(delegate.stripTrailingZeros())

    actual fun subtract(n: KBigDecimal): KBigDecimal = KBigDecimal(delegate.subtract(n.delegate))

    actual fun subtract(n: KBigDecimal, mc: KMathContext): KBigDecimal = KBigDecimal(delegate.subtract(n.delegate, mc.toMathContext()))

    actual fun toBigInteger(): KBigInteger = KBigInteger(delegate.toBigInteger())

    actual fun toBigIntegerExact(): KBigInteger = KBigInteger(delegate.toBigIntegerExact())

    actual fun toEngineeringString(): String = delegate.toEngineeringString()

    actual fun toPlainString(): String = delegate.toPlainString()

    actual fun ulp(): KBigDecimal = KBigDecimal(delegate.ulp())

    actual fun unscaledValue(): KBigInteger = KBigInteger(delegate.unscaledValue())

    actual operator fun plus(n: KBigDecimal): KBigDecimal = add(n)

    actual operator fun minus(n: KBigDecimal): KBigDecimal = subtract(n)

    actual operator fun times(n: KBigDecimal): KBigDecimal = multiply(n)

    actual operator fun div(n: KBigDecimal): KBigDecimal = divide(n, KRoundingMode.HALF_EVEN)

    actual operator fun compareTo(n: KBigDecimal): Int = delegate.compareTo(n.delegate)

    actual override fun equals(other: Any?): Boolean {
        return other is KBigDecimal && this.delegate == other.delegate
    }

    actual override fun hashCode() = delegate.hashCode()

    actual override fun toString() = delegate.toString()

}

private fun KMathContext.toMathContext() = MathContext(precision, kRoundingMode.toRoundingMode())

private fun KRoundingMode.toRoundingMode() = RoundingMode.valueOf(name)