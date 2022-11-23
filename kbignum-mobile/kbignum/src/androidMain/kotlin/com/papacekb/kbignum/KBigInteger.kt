package com.papacekb.kbignum

actual class KBigInteger private constructor(private val delegate: java.math.BigInteger) {

    actual constructor(value: String): this(java.math.BigInteger(value))

    actual constructor(value: Long): this(java.math.BigInteger.valueOf(value))

    actual fun abs(): KBigInteger = KBigInteger(delegate.abs())

    actual fun add(n: KBigInteger): KBigInteger = KBigInteger(delegate.add(n.delegate))

    actual fun and(n: KBigInteger): KBigInteger = KBigInteger(delegate.and(n.delegate))

    actual fun andNot(n: KBigInteger): KBigInteger = KBigInteger(delegate.andNot(n.delegate))

    actual fun bitCount(): Int = delegate.bitCount()

    actual fun bitLength(): Int = delegate.bitLength()

    actual fun clearBit(n: Int): KBigInteger = KBigInteger(delegate.clearBit(n))

    actual fun subtract(n: KBigInteger): KBigInteger = KBigInteger(delegate.subtract(n.delegate))

    actual fun multiply(n: KBigInteger): KBigInteger = KBigInteger(delegate.multiply(n.delegate))

    actual fun divide(n: KBigInteger): KBigInteger = KBigInteger(delegate.divide(n.delegate))

    actual override fun equals(other: Any?): Boolean = delegate == other

    actual override fun hashCode(): Int = delegate.hashCode()

    actual override fun toString(): String = delegate.toString()

}