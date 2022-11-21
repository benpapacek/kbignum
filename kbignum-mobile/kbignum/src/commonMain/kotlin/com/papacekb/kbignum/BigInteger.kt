package com.papacekb.kbignum

expect class BigInteger(value: String) {

    constructor(value: Long)

    fun abs(): BigInteger

    fun add(n: BigInteger): BigInteger

    fun and(n: BigInteger): BigInteger

    fun andNot(n: BigInteger): BigInteger

    fun bitCount(): Int

    fun bitLength(): Int

    fun clearBit(n: Int): BigInteger

    fun subtract(n: BigInteger): BigInteger

    fun multiply(n: BigInteger): BigInteger

    fun divide(n: BigInteger): BigInteger

    override fun equals(other: Any?): Boolean

    override fun hashCode(): Int

    override fun toString(): String

}