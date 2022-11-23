package com.papacekb.kbignum

expect class KBigInteger(value: String) {

    constructor(value: Long)

    fun abs(): KBigInteger

    fun add(n: KBigInteger): KBigInteger

    fun and(n: KBigInteger): KBigInteger

    fun andNot(n: KBigInteger): KBigInteger

    fun bitCount(): Int

    fun bitLength(): Int

    fun clearBit(n: Int): KBigInteger

    fun subtract(n: KBigInteger): KBigInteger

    fun multiply(n: KBigInteger): KBigInteger

    fun divide(n: KBigInteger): KBigInteger

    override fun equals(other: Any?): Boolean

    override fun hashCode(): Int

    override fun toString(): String

}