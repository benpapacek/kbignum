package com.papacekb.kbignum
import javaObjc.*

actual class BigInteger private constructor(private val delegate: ComPapacekbKbignumBigInteger) {

    actual constructor(value: String): this(ComPapacekbKbignumBigInteger(value))

    actual constructor(value: Long): this(ComPapacekbKbignumBigInteger(value))

    actual fun abs(): BigInteger = BigInteger(delegate.abs()!!)

    actual fun add(n: BigInteger): BigInteger = BigInteger(delegate.addWithComPapacekbKbignumBigInteger(n.delegate)!!)

    actual fun and(n: BigInteger): BigInteger = BigInteger(delegate.and__WithComPapacekbKbignumBigInteger(n.delegate)!!)

    actual fun andNot(n: BigInteger): BigInteger = BigInteger(delegate.andNotWithComPapacekbKbignumBigInteger(n.delegate)!!)

    actual fun bitCount(): Int = delegate.bitCount()

    actual fun bitLength(): Int = delegate.bitLength()

    actual fun clearBit(n: Int): BigInteger = BigInteger(delegate.clearBitWithInt(n)!!)

    actual fun subtract(n: BigInteger): BigInteger = BigInteger(delegate.subtractWithComPapacekbKbignumBigInteger(n.delegate)!!)

    actual fun multiply(n: BigInteger): BigInteger = BigInteger(delegate.multiplyWithComPapacekbKbignumBigInteger(n.delegate)!!)

    actual fun divide(n: BigInteger): BigInteger = BigInteger(delegate.divideWithComPapacekbKbignumBigInteger(n.delegate)!!)

    actual override fun equals(other: Any?): Boolean = delegate.equalsImplWithId(other)

    actual override fun hashCode(): Int = delegate.hashCodeImpl()

    actual override fun toString(): String = delegate.toStringImpl()!!

}