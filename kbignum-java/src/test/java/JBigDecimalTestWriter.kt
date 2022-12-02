import org.junit.jupiter.api.Test
import java.io.File
import java.math.BigDecimal
import java.math.MathContext
import java.math.RoundingMode
import kotlin.random.Random

class JBigDecimalTestWriter {

    companion object {
        const val CASES_PER_TEST = 10
        val LEGAL_ROUNDING_MODES = RoundingMode.values().filterNot { it == RoundingMode.UNNECESSARY }
    }

    private val random = Random(42)

    private fun randomBigDecimal() = BigDecimal.valueOf(random.nextInt() * random.nextDouble())

    private fun randomMathContext() = MathContext(random.nextInt(0, 10), LEGAL_ROUNDING_MODES.random())

    private fun wrap(n: BigDecimal) = "KBigDecimal(\"$n\")"
    private fun wrapMC(mc: MathContext) = "KMathContext(${mc.precision}, ${mc.roundingMode})"


    @Test
    fun createJBigDecimalTest() {
        val file = File("../kbignum-mobile/kbignum/src/commonTest/kotlin/com/papacekb/kbignum/KBigDecimalTest.kt")

        file.createNewFile()

        file.printWriter().use { out ->
            out.println(HEADER)


            out.println("\t@Test fun `test abs`() {")
            (0..10).forEach { _ ->
                val a = randomBigDecimal()
                val n = a.abs()
                out.println("\t\tassertEquals(${wrap(n)}, ${wrap(a)}.abs())")
            }
            out.println("\t}\n")


            out.println("\t@Test fun `test add`() {")
            (0..10).forEach { _ ->
                val a = randomBigDecimal()
                val b = randomBigDecimal()
                val n = a.add(b)
                out.println("\t\tassertEquals(${wrap(n)}, ${wrap(a)}.add(${wrap(b)}))")
            }
            out.println("\t}\n")


            out.println("\t@Test fun `test add with mc`() {")
            (0..10).forEach { _ ->
                val a = randomBigDecimal()
                val b = randomBigDecimal()
                val mc = randomMathContext()
                val n = a.add(b, mc)
                out.println("\t\tassertEquals(${wrap(n)}, ${wrap(a)}.add(${wrap(b)}, ${wrapMC(mc)}))")
            }
            out.println("\t}\n")


            out.println("\t@Test fun `test byteValueExact`() {")
            (0..10).forEach { _ ->
                val a = BigDecimal(random.nextInt(0, 127))
                out.println("\t\tassertEquals(${a.byteValueExact()}, ${wrap(a)}.byteValueExact())")
            }
            out.println("\t}\n")


            out.println("\t@Test fun `test compareTo`() {")
            (0..10).forEach { _ ->
                val a = randomBigDecimal()
                val b = randomBigDecimal()
                out.println("\t\tassertEquals(${a.compareTo(b)}, ${wrap(a)}.compareTo(${wrap(b)}))")
            }
            out.println("\t}\n")


            out.println("\n}")
        }



    }
}


/*
fun abs(): KBigDecimal

    operator fun compareTo(n: KBigDecimal): Int

    fun divide(n: KBigDecimal): KBigDecimal

    fun divide(n: KBigDecimal, scale: Int, roundingMode: KRoundingMode): KBigDecimal

    fun divide(n: KBigDecimal, roundingMode: KRoundingMode): KBigDecimal

    fun divide(n: KBigDecimal, mc: KMathContext): KBigDecimal

    fun divideAndRemainder(n: KBigDecimal): Array<KBigDecimal>

    fun divideAndRemainder(n: KBigDecimal, mc: KMathContext): Array<KBigDecimal>

    fun divideToIntegralValue(n: KBigDecimal): KBigDecimal

    fun divideToIntegralValue(n: KBigDecimal, mc: KMathContext): KBigDecimal

    fun subtract(n: KBigDecimal): KBigDecimal

    fun multiply(n: KBigDecimal): KBigDecimal
 */

const val HEADER = """
package com.papacekb.kbignum

import com.papacekb.kbignum.KRoundingMode.*
import kotlin.test.Test
import kotlin.test.assertEquals

class KBigDecimalTest {
"""