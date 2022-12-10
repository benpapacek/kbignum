package com.papacekb.kbignum
import javaObjc.ComPapacekbKbignumJBigInteger

actual class KBigInteger constructor(private val delegate: ComPapacekbKbignumJBigInteger) {

    actual companion object {
        actual val ONE: KBigInteger = KBigInteger(1)
        actual val TEN: KBigInteger = KBigInteger(10)
        actual val ZERO: KBigInteger = KBigInteger(0)
        actual fun valueOf(n: Long): KBigInteger = KBigInteger(n)
    }

    actual constructor(value: String, radix: Int): this(ComPapacekbKbignumJBigInteger(value, radix))

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

    actual fun divideAndRemainder(n: KBigInteger): Array<KBigInteger> {
        val delegateResult = delegate.divideAndRemainderWithComPapacekbKbignumJBigInteger(n.delegate)!!
        return arrayOf(
            KBigInteger(delegateResult.objectAtIndex(0) as ComPapacekbKbignumJBigInteger),
            KBigInteger(delegateResult.objectAtIndex(1) as ComPapacekbKbignumJBigInteger),
        )
    }

    actual fun doubleValue(): Double = delegate.doubleValue()

    actual fun flipBit(n: Int): KBigInteger = KBigInteger(delegate.flipBitWithInt(n)!!)

    actual fun floatValue(): Float = delegate.floatValue()

    actual fun gcd(n: KBigInteger): KBigInteger = KBigInteger(delegate.gcdWithComPapacekbKbignumJBigInteger(n.delegate)!!)

    actual fun getLowestSetBit(): Int = delegate.getLowestSetBit()

    actual fun intValue(): Int = delegate.intValue()

    actual fun isProbablePrime(certainty: Int): Boolean = delegate.isProbablePrimeWithInt(certainty)

    actual fun longValue(): Long = delegate.longValue()

    actual fun max(n: KBigInteger): KBigInteger = KBigInteger(delegate.maxWithComPapacekbKbignumJBigInteger(n.delegate)!!)

    actual fun min(n: KBigInteger): KBigInteger = KBigInteger(delegate.minWithComPapacekbKbignumJBigInteger(n.delegate)!!)

    actual fun mod(n: KBigInteger): KBigInteger = KBigInteger(delegate.modWithComPapacekbKbignumJBigInteger(n.delegate)!!)

    actual fun modInverse(n: KBigInteger): KBigInteger = KBigInteger(delegate.modInverseWithComPapacekbKbignumJBigInteger(n.delegate)!!)

    actual fun modPow(exp: KBigInteger, m: KBigInteger): KBigInteger = KBigInteger(delegate.modPowWithComPapacekbKbignumJBigInteger(exp.delegate, m.delegate)!!)

    actual fun negate(): KBigInteger = KBigInteger(delegate.negate()!!)

    actual fun nextProbablePrime(): KBigInteger = KBigInteger(delegate.nextProbablePrime()!!)

    actual fun not(): KBigInteger = KBigInteger(delegate.not__()!!)

    actual fun or(n: KBigInteger): KBigInteger = KBigInteger(delegate.or__WithComPapacekbKbignumJBigInteger(n.delegate)!!)

    actual fun pow(exp: Int): KBigInteger = KBigInteger(delegate.powWithInt(exp)!!)

    actual fun remainder(n: KBigInteger): KBigInteger = KBigInteger(delegate.remainderWithComPapacekbKbignumJBigInteger(n.delegate)!!)

    actual fun setBit(n: Int): KBigInteger = KBigInteger(delegate.setBitWithInt(n)!!)

    actual fun shiftLeft(n: Int): KBigInteger = KBigInteger(delegate.shiftLeftWithInt(n)!!)

    actual fun shiftRight(n: Int): KBigInteger = KBigInteger(delegate.shiftRightWithInt(n)!!)

    actual fun signum(): Int = delegate.signum()

    actual fun testBit(n: Int): Boolean = delegate.testBitWithInt(n)

    actual fun toByteArray(): ByteArray {
        val jByteArray = delegate.toByteArray()!!
        val byteArray = ByteArray(jByteArray.getSize())
        (byteArray.indices).forEach { i ->
            byteArray[i] = jByteArray.getByteAtWithInt(i)
        }
        return byteArray
    }

    actual fun xor(n: KBigInteger): KBigInteger = KBigInteger(delegate.xor__WithComPapacekbKbignumJBigInteger(n.delegate)!!)

    actual operator fun plus(n: KBigInteger): KBigInteger = add(n)

    actual operator fun minus(n: KBigInteger): KBigInteger = subtract(n)

    actual operator fun times(n: KBigInteger): KBigInteger = multiply(n)

    actual operator fun div(n: KBigInteger): KBigInteger = divide(n)

    actual operator fun compareTo(other: KBigInteger): Int = delegate.compareToWithId(other.delegate)

    actual override fun equals(other: Any?): Boolean = delegate.equalsImplWithId((other as? KBigInteger)?.delegate)

    actual override fun hashCode(): Int = delegate.hashCodeImpl()

    actual override fun toString(): String = delegate.toStringImpl()!!
}