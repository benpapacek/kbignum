package com.papacekb.kbignum

expect class KBigInteger(value: String, radix: Int = 10) {

    companion object {
        val ONE: KBigInteger
        val TEN: KBigInteger
        val ZERO: KBigInteger
        fun valueOf(n: Long): KBigInteger
    }

    constructor(value: Long)

    fun abs(): KBigInteger

    fun add(n: KBigInteger): KBigInteger

    fun and(n: KBigInteger): KBigInteger

    fun andNot(n: KBigInteger): KBigInteger

    fun bitCount(): Int

    fun bitLength(): Int

    fun clearBit(n: Int): KBigInteger

    fun divide(n: KBigInteger): KBigInteger

    fun divideAndRemainder(n: KBigInteger): Array<KBigInteger>

    fun doubleValue(): Double

    fun flipBit(n: Int): KBigInteger

    fun floatValue(): Float

    fun gcd(n: KBigInteger): KBigInteger

    fun getLowestSetBit(): Int

    fun intValue(): Int

    fun isProbablePrime(certainty: Int): Boolean

    fun longValue(): Long

    fun max(n: KBigInteger): KBigInteger

    fun min(n: KBigInteger): KBigInteger

    fun mod(n: KBigInteger): KBigInteger

    fun modInverse(n: KBigInteger): KBigInteger

    fun modPow(exp: KBigInteger, m: KBigInteger): KBigInteger

    fun multiply(n: KBigInteger): KBigInteger

    fun negate(): KBigInteger

    fun nextProbablePrime(): KBigInteger

    fun not(): KBigInteger

    fun or(n: KBigInteger): KBigInteger

    fun pow(exp: Int): KBigInteger

    fun remainder(n: KBigInteger): KBigInteger

    fun setBit(n: Int): KBigInteger

    fun shiftLeft(n: Int): KBigInteger

    fun shiftRight(n: Int): KBigInteger

    fun signum(): Int

    fun subtract(n: KBigInteger): KBigInteger

    fun testBit(n: Int): Boolean

    fun toByteArray(): ByteArray

    fun xor(n: KBigInteger): KBigInteger

    operator fun plus(n: KBigInteger): KBigInteger

    operator fun minus(n: KBigInteger): KBigInteger

    operator fun times(n: KBigInteger): KBigInteger

    operator fun div(n: KBigInteger): KBigInteger

    operator fun compareTo(other: KBigInteger): Int

    override fun equals(other: Any?): Boolean

    override fun hashCode(): Int

    override fun toString(): String

}