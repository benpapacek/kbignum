package com.papacekb.kbignum

actual class BigInteger private constructor(private val delegate: java.math.BigInteger) {

    actual constructor(value: String): this(java.math.BigInteger(value))

    actual constructor(value: Long): this(java.math.BigInteger.valueOf(value))

    actual fun abs(): BigInteger = BigInteger(delegate.abs())

    actual fun add(n: BigInteger): BigInteger = BigInteger(delegate.add(n.delegate))

    actual fun and(n: BigInteger): BigInteger = BigInteger(delegate.and(n.delegate))

    actual fun andNot(n: BigInteger): BigInteger = BigInteger(delegate.andNot(n.delegate))

    actual fun bitCount(): Int = delegate.bitCount()

    actual fun bitLength(): Int = delegate.bitLength()

    actual fun clearBit(n: Int): BigInteger = BigInteger(delegate.clearBit(n))

    actual fun subtract(n: BigInteger): BigInteger = BigInteger(delegate.subtract(n.delegate))

    actual fun multiply(n: BigInteger): BigInteger = BigInteger(delegate.multiply(n.delegate))

    actual fun divide(n: BigInteger): BigInteger = BigInteger(delegate.divide(n.delegate))

    actual override fun equals(other: Any?): Boolean = delegate == other

    actual override fun hashCode(): Int = delegate.hashCode()

    actual override fun toString(): String = delegate.toString()

}