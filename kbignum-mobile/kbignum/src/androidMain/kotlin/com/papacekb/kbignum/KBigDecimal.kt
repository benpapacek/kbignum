package com.papacekb.kbignum

actual class KBigDecimal private constructor(private val delegate: java.math.BigDecimal) {

    actual constructor(value: String): this(java.math.BigDecimal(value))

    actual constructor(value: Double): this(java.math.BigDecimal.valueOf(value))

    actual constructor(value: Long): this(java.math.BigDecimal.valueOf(value))

    actual fun add(n: KBigDecimal): KBigDecimal = KBigDecimal(this.delegate.add(n.delegate))

    actual fun subtract(n: KBigDecimal): KBigDecimal = KBigDecimal(this.delegate.subtract(n.delegate))

    actual fun multiply(n: KBigDecimal): KBigDecimal = KBigDecimal(this.delegate.multiply(n.delegate))

    actual fun divide(n: KBigDecimal): KBigDecimal = KBigDecimal(this.delegate.divide(n.delegate))

    actual override fun equals(other: Any?): Boolean {
        return other is KBigDecimal && this.delegate == other.delegate
    }

    actual override fun hashCode() = delegate.hashCode()

    actual override fun toString() = delegate.toString()
}