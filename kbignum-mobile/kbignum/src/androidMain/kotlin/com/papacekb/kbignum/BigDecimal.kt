package com.papacekb.kbignum

actual class BigDecimal private constructor(private val delegate: java.math.BigDecimal) {

    actual constructor(value: String): this(java.math.BigDecimal(value))

    actual constructor(value: Double): this(java.math.BigDecimal.valueOf(value))

    actual constructor(value: Long): this(java.math.BigDecimal.valueOf(value))

    actual fun add(n: BigDecimal): BigDecimal = BigDecimal(this.delegate.add(n.delegate))

    actual fun subtract(n: BigDecimal): BigDecimal = BigDecimal(this.delegate.subtract(n.delegate))

    actual fun multiply(n: BigDecimal): BigDecimal = BigDecimal(this.delegate.multiply(n.delegate))

    actual fun divide(n: BigDecimal): BigDecimal = BigDecimal(this.delegate.divide(n.delegate))

    actual override fun equals(other: Any?): Boolean {
        return other is BigDecimal && this.delegate == other.delegate
    }

    actual override fun hashCode() = delegate.hashCode()

    actual override fun toString() = delegate.toString()
}