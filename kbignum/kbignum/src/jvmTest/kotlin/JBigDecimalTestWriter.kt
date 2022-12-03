import org.junit.Test
import java.io.File
import java.math.BigDecimal
import java.math.MathContext
import java.math.RoundingMode
import kotlin.random.Random

class JBigDecimalTestWriter {

    private val random = Random(42)

    private fun randomBigDecimal() = BigDecimal.valueOf(random.nextInt() * random.nextDouble())

    private fun randomRoundingMode() = RoundingMode.values().filterNot { it == RoundingMode.UNNECESSARY }.random()

    private fun randomMathContext() = MathContext(random.nextInt(1, 10), randomRoundingMode())

    private fun wrap(n: BigDecimal) = "KBigDecimal(\"$n\")"
    private fun wrapMC(mc: MathContext) = "KMathContext(${mc.precision}, ${mc.roundingMode})"


    @Test
    fun createJBigDecimalTest() {
        val file = File("src/commonTest/kotlin/com/papacekb/kbignum/KBigDecimalTest.kt")

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


            out.println("\t@Test fun `test divide`() {")
            (0..10).forEach { _ ->
                val a = BigDecimal(random.nextInt(2, 100))
                val b = a.multiply(randomBigDecimal())
                out.println("\t\tassertEquals(${wrap(b.divide(a))}, ${wrap(b)}.divide(${wrap(a)}))")
            }
            out.println("\t}\n")


            out.println("\t@Test fun `test divide with rounding mode`() {")
            (0..10).forEach { _ ->
                val a = randomBigDecimal()
                val b = randomBigDecimal()
                val roundingMode = randomRoundingMode()
                out.println("\t\tassertEquals(${wrap(a.divide(b, roundingMode))}, ${wrap(a)}.divide(${wrap(b)}, $roundingMode))")
            }
            out.println("\t}\n")


            out.println("\t@Test fun `test divide with math context`() {")
            (0..10).forEach { _ ->
                val a = randomBigDecimal()
                val b = randomBigDecimal()
                val mathContext = randomMathContext()
                println(mathContext.roundingMode)
                out.println("\t\tassertEquals(${wrap(a.divide(b, mathContext))}, ${wrap(a)}.divide(${wrap(b)}, ${wrapMC(mathContext)}))")
            }
            out.println("\t}\n")


            out.println("\t@Test fun `test divideAndRemainder`() {")
            (0..10).forEach { _ ->
                val a = randomBigDecimal()
                val b = randomBigDecimal()
                val result = a.divideAndRemainder(b)
                out.println("\t\tassertEquals(listOf(${wrap(result[0])}, ${wrap(result[1])}), " +
                        "${wrap(a)}.divideAndRemainder(${wrap(b)}).asList())")
            }
            out.println("\t}\n")


            out.println("\t@Test fun `test divideAndRemainder with math context`() {")
            (0..10).forEach { _ ->
                val a = randomBigDecimal()
                val b = randomBigDecimal()
                val mathContext = randomMathContext()
                val result = a.divideAndRemainder(b, mathContext)
                out.println("\t\tassertEquals(listOf(${wrap(result[0])}, ${wrap(result[1])}), " +
                        "${wrap(a)}.divideAndRemainder(${wrap(b)}, ${wrapMC(mathContext)}).asList())")
            }
            out.println("\t}\n")


            out.println("\n}")
        }


    }
}


/*
fun abs(): KBigDecimal



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