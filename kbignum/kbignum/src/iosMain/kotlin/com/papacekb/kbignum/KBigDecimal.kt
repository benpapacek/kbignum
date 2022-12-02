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

    actual fun divideToIntegralValue(n: KBigDecimal): KBigDecimal = KBigDecimal(n.delegate.divideToIntegralValueWithComPapacekbKbignumJBigDecimal(n.delegate)!!)

    actual fun divideToIntegralValue(n: KBigDecimal, mc: KMathContext): KBigDecimal =
        KBigDecimal(n.delegate.divideToIntegralValueWithComPapacekbKbignumJBigDecimal(n.delegate, mc.toMathContext())!!)

    actual fun subtract(n: KBigDecimal) = KBigDecimal(this.delegate.subtractWithComPapacekbKbignumJBigDecimal(n.delegate)!!)

    actual fun multiply(n: KBigDecimal) = KBigDecimal(this.delegate.multiplyWithComPapacekbKbignumJBigDecimal(n.delegate)!!)

    actual fun divide(n: KBigDecimal) = KBigDecimal(this.delegate.divideWithComPapacekbKbignumJBigDecimal(n.delegate)!!)

    actual override fun equals(other: Any?): Boolean {
        return other is KBigDecimal && other.delegate == this.delegate
    }

    actual override fun hashCode() = this.delegate.hashCode()

    actual override fun toString() = this.delegate.toString()

}

private fun KMathContext.toMathContext() = ComPapacekbKbignumJMathContext(precision, kRoundingMode.name)