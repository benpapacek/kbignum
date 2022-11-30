package com.papacekb.kbignum

import kotlin.test.Test
import kotlin.test.assertEquals

class KBigIntegerTest {

    @Test
    fun testAbs() {
        assertEquals(KBigInteger("42"), KBigInteger("-42").abs())
        assertEquals(KBigInteger("42"), KBigInteger("42").abs())
    }

    @Test
    fun testAdd() {
        assertEquals(KBigInteger("84"), KBigInteger("42").add(KBigInteger("42")))
        assertEquals(KBigInteger("0"), KBigInteger("42").add(KBigInteger("-42")))
        assertEquals(KBigInteger("-84"), KBigInteger("-42").add(KBigInteger("-42")))
    }

    @Test
    fun testAnd() {
        assertEquals(KBigInteger("8"), KBigInteger("42").and(KBigInteger("25")))
    }

    @Test
    fun testAndNot() {
        assertEquals(KBigInteger("34"), KBigInteger("42").andNot(KBigInteger("25")))
    }

    @Test
    fun testBitCount() {
        assertEquals(14, KBigInteger("356347456").bitCount())
    }

    @Test
    fun testBitLength() {
        assertEquals(29, KBigInteger("356347456").bitLength())
    }

    @Test
    fun testClearBit() {
        assertEquals(KBigInteger("356347392"), KBigInteger("356347456").clearBit(6))
    }

    @Test
    fun testDivide() {
        assertEquals(KBigInteger("15362"), KBigInteger("74567456").divide(KBigInteger("4854")))
    }

    /*

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

    operator fun compareTo(other: KBigInteger): Int

    override fun equals(other: Any?): Boolean

    override fun hashCode(): Int

    override fun toString(): String
     */
}