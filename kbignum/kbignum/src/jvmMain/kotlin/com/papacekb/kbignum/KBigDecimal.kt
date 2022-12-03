package com.papacekb.kbignum

import java.math.MathContext
import java.math.RoundingMode

actual class KBigDecimal private constructor(private val delegate: java.math.BigDecimal) {

    actual constructor(value: String): this(java.math.BigDecimal(value))

    actual constructor(value: Double): this(java.math.BigDecimal.valueOf(value))

    actual constructor(value: Long): this(java.math.BigDecimal.valueOf(value))

    actual fun abs(): KBigDecimal = KBigDecimal(this.delegate.abs())

    actual fun abs(mc: KMathContext): KBigDecimal = KBigDecimal(this.delegate.abs(mc.toMathContext()))

    actual fun add(n: KBigDecimal): KBigDecimal = KBigDecimal(this.delegate.add(n.delegate))

    actual fun add(n: KBigDecimal, mc: KMathContext): KBigDecimal = KBigDecimal(this.delegate.add(n.delegate, mc.toMathContext()))

    actual fun byteValueExact(): Byte = delegate.byteValueExact()

    actual operator fun compareTo(n: KBigDecimal): Int = delegate.compareTo(n.delegate)

    actual fun divide(n: KBigDecimal, scale: Int, roundingMode: KRoundingMode): KBigDecimal = KBigDecimal(delegate.divide(n.delegate, scale, roundingMode.toRoundingMode()))

    actual fun divide(n: KBigDecimal, roundingMode: KRoundingMode): KBigDecimal = KBigDecimal(delegate.divide(n.delegate, roundingMode.toRoundingMode()))

    actual fun divide(n: KBigDecimal, mc: KMathContext): KBigDecimal = KBigDecimal(delegate.divide(n.delegate, mc.toMathContext()))

    actual fun divideAndRemainder(n: KBigDecimal): Array<KBigDecimal> = delegate.divideAndRemainder(n.delegate).map { KBigDecimal(it) }.toTypedArray()

    actual fun divideAndRemainder(n: KBigDecimal, mc: KMathContext): Array<KBigDecimal> =
        delegate.divideAndRemainder(n.delegate, mc.toMathContext()).map { KBigDecimal(it) }.toTypedArray()

    actual fun divideToIntegralValue(n: KBigDecimal): KBigDecimal = KBigDecimal(delegate.divideToIntegralValue(n.delegate))

    actual fun divideToIntegralValue(n: KBigDecimal, mc: KMathContext): KBigDecimal = KBigDecimal(delegate.divideToIntegralValue(n.delegate, mc.toMathContext()))

    actual fun subtract(n: KBigDecimal): KBigDecimal = KBigDecimal(this.delegate.subtract(n.delegate))

    actual fun multiply(n: KBigDecimal): KBigDecimal = KBigDecimal(this.delegate.multiply(n.delegate))

    actual fun divide(n: KBigDecimal): KBigDecimal = KBigDecimal(this.delegate.divide(n.delegate))

    actual override fun equals(other: Any?): Boolean {
        return other is KBigDecimal && this.delegate == other.delegate
    }

    actual override fun hashCode() = delegate.hashCode()

    actual override fun toString() = delegate.toString()

}

private fun KMathContext.toMathContext() = MathContext(precision, kRoundingMode.toRoundingMode())

private fun KRoundingMode.toRoundingMode() = RoundingMode.valueOf(name)