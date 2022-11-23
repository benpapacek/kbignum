package com.papacekb.kbignum
import javaObjc.*

actual class KBigInteger private constructor(private val delegate: ComPapacekbKbignumJBigInteger) {

    actual constructor(value: String): this(ComPapacekbKbignumJBigInteger(value))

    actual constructor(value: Long): this(ComPapacekbKbignumJBigInteger(value))

    actual fun abs(): KBigInteger = KBigInteger(delegate.abs()!!)

    actual fun add(n: KBigInteger): KBigInteger = KBigInteger(delegate.addWithComPapacekbKbignumJBigInteger(n.delegate)!!)

    actual fun and(n: KBigInteger): KBigInteger = KBigInteger(delegate.and__WithComPapacekbKbignumJBigInteger(n.delegate)!!)

    actual fun andNot(n: KBigInteger): KBigInteger = KBigInteger(delegate.andNotWithComPapacekbKbignumJBigInteger(n.delegate)!!)

    actual fun bitCount(): Int = delegate.bitCount()

    actual fun bitLength(): Int = delegate.bitLength()

    actual fun clearBit(n: Int): KBigInteger = KBigInteger(delegate.clearBitWithInt(n)!!)

    actual fun subtract(n: KBigInteger): KBigInteger = KBigInteger(delegate.subtractWithComPapacekbKbignumJBigInteger(n.delegate)!!)

    actual fun multiply(n: KBigInteger): KBigInteger = KBigInteger(delegate.multiplyWithComPapacekbKbignumJBigInteger(n.delegate)!!)

    actual fun divide(n: KBigInteger): KBigInteger = KBigInteger(delegate.divideWithComPapacekbKbignumJBigInteger(n.delegate)!!)

    actual override fun equals(other: Any?): Boolean = delegate.equalsImplWithId(other)

    actual override fun hashCode(): Int = delegate.hashCodeImpl()

    actual override fun toString(): String = delegate.toStringImpl()!!

}