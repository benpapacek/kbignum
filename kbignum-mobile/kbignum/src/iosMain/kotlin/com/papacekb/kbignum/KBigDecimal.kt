package com.papacekb.kbignum
import javaObjc.*

actual class KBigDecimal private constructor(private val delegate: ComPapacekbKbignumJBigDecimal) {

    actual constructor(value: String): this(ComPapacekbKbignumJBigDecimal(value))

    actual constructor(value: Double): this(ComPapacekbKbignumJBigDecimal(value))

    actual constructor(value: Long): this(ComPapacekbKbignumJBigDecimal(value))

    actual fun abs(): KBigDecimal = KBigDecimal(this.delegate.abs()!!)

    actual fun abs(mc: KMathContext): KBigDecimal {
        return KBigDecimal(delegate.absWithComPapacekbKbignumJMathContext(mc.toMathContext())!!)
    }

    actual fun add(n: KBigDecimal) = KBigDecimal(this.delegate.addWithComPapacekbKbignumJBigDecimal(n.delegate)!!)

    actual fun subtract(n: KBigDecimal) = KBigDecimal(this.delegate.subtractWithComPapacekbKbignumJBigDecimal(n.delegate)!!)

    actual fun multiply(n: KBigDecimal) = KBigDecimal(this.delegate.multiplyWithComPapacekbKbignumJBigDecimal(n.delegate)!!)

    actual fun divide(n: KBigDecimal) = KBigDecimal(this.delegate.divideWithComPapacekbKbignumJBigDecimal(n.delegate)!!)

    actual override fun equals(other: Any?): Boolean {
        return other is KBigDecimal && other.delegate.equalsImplWithId(this.delegate)
    }

    actual override fun hashCode() = this.delegate.hashCodeImpl()

    actual override fun toString() = this.delegate.toStringImpl()!!
}

fun KMathContext.toMathContext() = ComPapacekbKbignumJMathContext(precision, kRoundingMode.name)