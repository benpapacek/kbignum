package com.papacekb.kbignum

data class KMathContext(val precision: Int, val kRoundingMode: KRoundingMode = KRoundingMode.HALF_UP) {

    companion object {
        val UNLIMITED = KMathContext(0, KRoundingMode.HALF_UP)
        val DECIMAL32 = KMathContext(7, KRoundingMode.HALF_EVEN)
        val DECIMAL64 = KMathContext(16, KRoundingMode.HALF_EVEN)
        val DECIMAL128 = KMathContext(34, KRoundingMode.HALF_EVEN)
    }

}