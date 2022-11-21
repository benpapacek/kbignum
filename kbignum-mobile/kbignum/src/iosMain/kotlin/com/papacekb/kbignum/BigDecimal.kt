package com.papacekb.kbignum
import javaObjc.*

actual class BigDecimal private constructor(private val delegate: ComPapacekbKbignumBigDecimal) {

    actual constructor(value: String): this(ComPapacekbKbignumBigDecimal(value))

    actual constructor(value: Double): this(ComPapacekbKbignumBigDecimal(value))

    actual constructor(value: Long): this(ComPapacekbKbignumBigDecimal(value))

    actual fun add(n: BigDecimal) = BigDecimal(this.delegate.addWithComPapacekbKbignumBigDecimal(n.delegate)!!)

    actual fun subtract(n: BigDecimal) = BigDecimal(this.delegate.subtractWithComPapacekbKbignumBigDecimal(n.delegate)!!)

    actual fun multiply(n: BigDecimal) = BigDecimal(this.delegate.multiplyWithComPapacekbKbignumBigDecimal(n.delegate)!!)

    actual fun divide(n: BigDecimal) = BigDecimal(this.delegate.divideWithComPapacekbKbignumBigDecimal(n.delegate)!!)

    actual override fun equals(other: Any?): Boolean {
        return other is BigDecimal && other.delegate.equalsImplWithId(this.delegate)
    }

    actual override fun hashCode() = this.delegate.hashCodeImpl()

    actual override fun toString() = this.delegate.toStringImpl()!!

}