package com.papacekb.kbignum

expect class KBigDecimal(value: String) {

    constructor(value: Double)

    constructor(value: Long)

    fun abs(): KBigDecimal

    fun abs(mc: KMathContext): KBigDecimal

    fun add(n: KBigDecimal): KBigDecimal

    fun subtract(n: KBigDecimal): KBigDecimal

    fun multiply(n: KBigDecimal): KBigDecimal

    fun divide(n: KBigDecimal): KBigDecimal

    override fun equals(other: Any?): Boolean

    override fun hashCode(): Int

    override fun toString(): String

}