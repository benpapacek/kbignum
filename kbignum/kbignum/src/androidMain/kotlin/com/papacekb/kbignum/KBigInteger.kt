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

    actual fun divideAndRemainder(n: KBigInteger): Array<KBigInteger> = delegate.divideAndRemainder(n.delegate).map { KBigInteger(it) }.toTypedArray()

    actual fun doubleValue(): Double = delegate.toDouble()

    actual fun flipBit(n: Int): KBigInteger = KBigInteger(delegate.flipBit(n))

    actual fun floatValue(): Float = delegate.toFloat()

    actual fun gcd(n: KBigInteger): KBigInteger = KBigInteger(delegate.gcd(n.delegate))

    actual fun getLowestSetBit(): Int = delegate.lowestSetBit

    actual fun intValue(): Int = delegate.toInt()

    actual fun isProbablePrime(certainty: Int): Boolean = delegate.isProbablePrime(certainty)

    actual fun longValue(): Long = delegate.toLong()

    actual fun max(n: KBigInteger): KBigInteger = KBigInteger(delegate.max(n.delegate))

    actual fun min(n: KBigInteger): KBigInteger = KBigInteger(delegate.min(n.delegate))

    actual fun mod(n: KBigInteger): KBigInteger = KBigInteger(delegate.mod(n.delegate))

    actual fun modInverse(n: KBigInteger): KBigInteger = KBigInteger(delegate.modInverse(n.delegate))

    actual fun modPow(exp: KBigInteger, m: KBigInteger): KBigInteger = KBigInteger(delegate.modPow(exp.delegate, m.delegate))

    actual fun negate(): KBigInteger = KBigInteger(delegate.negate())

    actual fun nextProbablePrime(): KBigInteger = KBigInteger(delegate.nextProbablePrime())

    actual fun not(): KBigInteger = KBigInteger(delegate.not())

    actual fun or(n: KBigInteger): KBigInteger = KBigInteger(delegate.or(n.delegate))

    actual fun pow(exp: Int): KBigInteger = KBigInteger(delegate.pow(exp))

    actual fun remainder(n: KBigInteger): KBigInteger = KBigInteger(delegate.remainder(n.delegate))

    actual fun setBit(n: Int): KBigInteger = KBigInteger(delegate.setBit(n))

    actual fun shiftLeft(n: Int): KBigInteger = KBigInteger(delegate.shiftLeft(n))

    actual fun shiftRight(n: Int): KBigInteger = KBigInteger(delegate.shiftRight(n))

    actual fun signum(): Int = delegate.signum()

    actual fun testBit(n: Int): Boolean = delegate.testBit(n)

    actual fun toByteArray(): ByteArray = delegate.toByteArray()

    actual fun xor(n: KBigInteger): KBigInteger = KBigInteger(delegate.xor(n.delegate))

    actual operator fun compareTo(other: KBigInteger): Int = delegate.compareTo(other.delegate)

    actual override fun equals(other: Any?): Boolean {
        return delegate == (other as? KBigInteger)?.delegate
    }

    actual override fun hashCode(): Int = delegate.hashCode()

    actual override fun toString(): String = delegate.toString()

}