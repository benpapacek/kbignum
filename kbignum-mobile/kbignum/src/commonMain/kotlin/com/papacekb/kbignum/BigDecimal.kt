package com.papacekb.kbignum

expect class BigDecimal(value: String) {

    constructor(value: Double)

    constructor(value: Long)

    fun add(n: BigDecimal): BigDecimal

    fun subtract(n: BigDecimal): BigDecimal

    fun multiply(n: BigDecimal): BigDecimal

    fun divide(n: BigDecimal): BigDecimal

    override fun equals(other: Any?): Boolean

    override fun hashCode(): Int

    override fun toString(): String

}