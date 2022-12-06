package com.papacekb.kbignum
import javaObjc.ComPapacekbKbignumJBigDecimal
import javaObjc.ComPapacekbKbignumJMathContext

actual class KBigDecimal private constructor(private val delegate: ComPapacekbKbignumJBigDecimal) {

    actual constructor(value: String): this(ComPapacekbKbignumJBigDecimal(value))

    actual constructor(value: Double): this(ComPapacekbKbignumJBigDecimal(value))

    actual constructor(value: Long): this(ComPapacekbKbignumJBigDecimal(value))

    actual fun abs(): KBigDecimal = KBigDecimal(this.delegate.abs()!!)

    actual fun abs(mc: KMathContext): KBigDecimal {
        return KBigDecimal(delegate.absWithComPapacekbKbignumJMathContext(mc.toMathContext())!!)
    }

    actual fun add(n: KBigDecimal) = KBigDecimal(this.delegate.addWithComPapacekbKbignumJBigDecimal(n.delegate)!!)

    actual fun add(n: KBigDecimal, mc: KMathContext): KBigDecimal = KBigDecimal(this.delegate.addWithComPapacekbKbignumJBigDecimal(n.delegate, mc.toMathContext())!!)

    actual fun byteValueExact(): Byte = delegate.byteValueExact()

    actual operator fun compareTo(n: KBigDecimal): Int = delegate.compareToWithComPapacekbKbignumJBigDecimal(n.delegate)

    actual fun divide(n: KBigDecimal) = KBigDecimal(this.delegate.divideWithComPapacekbKbignumJBigDecimal(n.delegate)!!)

    actual fun divide(n: KBigDecimal, scale: Int, roundingMode: KRoundingMode): KBigDecimal =
        KBigDecimal(delegate.divideWithComPapacekbKbignumJBigDecimal(n.delegate, scale, roundingMode.name)!!)

    actual fun divide(n: KBigDecimal, roundingMode: KRoundingMode): KBigDecimal =
        KBigDecimal(delegate.divideWithComPapacekbKbignumJBigDecimal(n.delegate, roundingMode.name)!!)

    actual fun divide(n: KBigDecimal, mc: KMathContext): KBigDecimal =
        KBigDecimal(delegate.divideWithComPapacekbKbignumJBigDecimal(n.delegate, mc.toMathContext())!!)

    actual fun divideAndRemainder(n: KBigDecimal): Array<KBigDecimal> {
        val result = delegate.divideAndRemainderWithComPapacekbKbignumJBigDecimal(n.delegate)!!
        return arrayOf(
            KBigDecimal(result.objectAtIndex(0) as ComPapacekbKbignumJBigDecimal),
            KBigDecimal(result.objectAtIndex(1) as ComPapacekbKbignumJBigDecimal)
        )
    }

    actual fun divideAndRemainder(n: KBigDecimal, mc: KMathContext): Array<KBigDecimal> {
        val result = delegate.divideAndRemainderWithComPapacekbKbignumJBigDecimal(n.delegate, mc.toMathContext())!!
        return arrayOf(
            KBigDecimal(result.objectAtIndex(0) as ComPapacekbKbignumJBigDecimal),
            KBigDecimal(result.objectAtIndex(1) as ComPapacekbKbignumJBigDecimal)
        )
    }

    actual fun divideToIntegralValue(n: KBigDecimal): KBigDecimal = KBigDecimal(
        delegate.divideToIntegralValueWithComPapacekbKbignumJBigDecimal(n.delegate)!!
    )

    actual fun divideToIntegralValue(n: KBigDecimal, mc: KMathContext): KBigDecimal =
        KBigDecimal(delegate.divideToIntegralValueWithComPapacekbKbignumJBigDecimal(n.delegate, mc.toMathContext())!!)

    actual fun doubleValue(): Double = this.delegate.doubleValue()

    actual fun floatValue(): Float = this.delegate.floatValue()

    actual fun intValue(): Int = this.delegate.intValue()

    actual fun intValueExact(): Int = this.delegate.intValueExact()

    actual fun longValue(): Long = this.delegate.longValue()

    actual fun longValueExact(): Long = this.delegate.longValueExact()

    actual fun max(n: KBigDecimal): KBigDecimal = KBigDecimal(this.delegate.maxWithComPapacekbKbignumJBigDecimal(n.delegate)!!)

    actual fun min(n: KBigDecimal): KBigDecimal = KBigDecimal(this.delegate.minWithComPapacekbKbignumJBigDecimal(n.delegate)!!)

    actual fun movePointLeft(n: Int): KBigDecimal = KBigDecimal(this.delegate.movePointLeftWithInt(n)!!)

    actual fun movePointRight(n: Int): KBigDecimal = KBigDecimal(delegate.movePointRightWithInt(n)!!)

    actual fun multiply(n: KBigDecimal) = KBigDecimal(this.delegate.multiplyWithComPapacekbKbignumJBigDecimal(n.delegate)!!)

    actual fun multiply(n: KBigDecimal, mc: KMathContext): KBigDecimal = KBigDecimal(
        delegate.multiplyWithComPapacekbKbignumJBigDecimal(n.delegate, mc.toMathContext())!!
    )

    actual fun negate(): KBigDecimal = KBigDecimal(delegate.negate()!!)

    actual fun negate(mc: KMathContext): KBigDecimal = KBigDecimal(delegate.negateWithComPapacekbKbignumJMathContext(mc.toMathContext())!!)

    actual fun plus(): KBigDecimal = KBigDecimal(delegate.plus()!!)

    actual fun plus(mc: KMathContext): KBigDecimal = KBigDecimal(delegate.plusWithComPapacekbKbignumJMathContext(mc.toMathContext())!!)

    actual fun pow(n: Int): KBigDecimal = KBigDecimal(delegate.powWithInt(n)!!)

    actual fun pow(n: Int, mc: KMathContext): KBigDecimal = KBigDecimal(delegate.powWithInt(n, mc.toMathContext())!!)

    actual fun precision(): Int = delegate.precision()

    actual fun remainder(n: KBigDecimal): KBigDecimal = KBigDecimal(delegate.remainderWithComPapacekbKbignumJBigDecimal(n.delegate)!!)

    actual fun remainder(n: KBigDecimal, mc: KMathContext): KBigDecimal = KBigDecimal(
        delegate.remainderWithComPapacekbKbignumJBigDecimal(n.delegate, mc.toMathContext())!!
    )

    actual fun round(mc: KMathContext): KBigDecimal = KBigDecimal(delegate.roundWithComPapacekbKbignumJMathContext(mc.toMathContext())!!)

    actual fun scale(): Int = delegate.scale__()

    actual fun scaleByPowerOfTen(n: Int): KBigDecimal = KBigDecimal(delegate.scaleByPowerOfTenWithInt(n)!!)

    actual fun setScale(scale: Int): KBigDecimal = KBigDecimal(delegate.setScaleWithInt(scale)!!)

    actual fun setScale(scale: Int, roundingMode: KRoundingMode): KBigDecimal = KBigDecimal(delegate.setScaleWithInt(scale, roundingMode.name)!!)

    actual fun shortValueExact(): Short = delegate.shortValueExact()

    actual fun signum(): Int = delegate.signum()

    actual fun stripTrailingZeros(): KBigDecimal = KBigDecimal(delegate.stripTrailingZeroes()!!)

    actual fun subtract(n: KBigDecimal) = KBigDecimal(this.delegate.subtractWithComPapacekbKbignumJBigDecimal(n.delegate)!!)

    actual fun subtract(n: KBigDecimal, mc: KMathContext): KBigDecimal = KBigDecimal(
        delegate.subtractWithComPapacekbKbignumJBigDecimal(n.delegate, mc.toMathContext())!!
    )

    actual fun toBigInteger(): KBigInteger = KBigInteger(delegate.toBigInteger()!!)

    actual fun toBigIntegerExact(): KBigInteger = KBigInteger(delegate.toBigIntegerExact()!!)

    actual fun toEngineeringString(): String = delegate.toEngineeringString()!!

    actual fun toPlainString(): String = delegate.toPlainString()!!

    actual fun ulp(): KBigDecimal = KBigDecimal(delegate.ulp()!!)

    actual fun unscaledValue(): KBigInteger = KBigInteger(delegate.unscaledValue()!!)

    actual override fun equals(other: Any?): Boolean {
        return other is KBigDecimal && other.delegate == this.delegate
    }

    actual override fun hashCode() = this.delegate.hashCode()

    actual override fun toString() = this.delegate.toString()

}

private fun KMathContext.toMathContext() = ComPapacekbKbignumJMathContext(precision, kRoundingMode.name)