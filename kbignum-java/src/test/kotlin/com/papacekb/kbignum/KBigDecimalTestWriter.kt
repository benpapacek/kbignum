package com.papacekb.kbignum

import org.junit.Ignore
import org.junit.Test
import java.io.File
import java.math.BigDecimal
import java.math.BigInteger
import java.math.MathContext
import java.math.RoundingMode
import kotlin.random.Random

class JBigDecimalTestWriter {

    private val random = Random(42)

    private fun randomBigDecimal() = BigDecimal.valueOf(random.nextInt() * random.nextDouble())

    private fun randomRoundingMode() = RoundingMode.values().filterNot { it == RoundingMode.UNNECESSARY }.random()

    private fun randomMathContext() = MathContext(random.nextInt(1, 10), randomRoundingMode())

    private fun wrap(n: BigDecimal) = "KBigDecimal(\"$n\")"
    private fun wrapBI(n: BigInteger) = "KBigInteger(\"$n\")"
    private fun wrapMC(mc: MathContext) = "KMathContext(${mc.precision}, ${mc.roundingMode})"

    @Ignore("This is not a test per se, but a way of generating kmm tests which compare results with those of corresponding java classes")
    @Test
    fun createJBigDecimalTest() {
        val file = File("../kbignum/src/commonTest/kotlin/com/papacekb/kbignum/KBigDecimalTest.kt")

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


            out.println("\t@Test fun `test add with MathContext`() {")
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


            out.println("\t@Test fun `test divide with MathContext`() {")
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


            out.println("\t@Test fun `test divideAndRemainder with MathContext`() {")
            (0..10).forEach { _ ->
                val a = randomBigDecimal()
                val b = randomBigDecimal()
                val mathContext = randomMathContext()
                val result = a.divideAndRemainder(b, mathContext)
                out.println("\t\tassertEquals(listOf(${wrap(result[0])}, ${wrap(result[1])}), " +
                        "${wrap(a)}.divideAndRemainder(${wrap(b)}, ${wrapMC(mathContext)}).asList())")
            }
            out.println("\t}\n")


            out.println("\t@Test fun `test divideToIntegralValue`() {")
            (0..10).forEach { _ ->
                val a = randomBigDecimal()
                val b = randomBigDecimal()
                val result = a.divideToIntegralValue(b)
                out.println("\t\tassertEquals(${wrap(result)}, ${wrap(a)}.divideToIntegralValue(${wrap(b)}))")
            }
            out.println("\t}\n")


            out.println("\t@Test fun `test divideToIntegralValue with MathContext`() {")
            (0..10).forEach { _ ->
                val a = randomBigDecimal()
                val b = randomBigDecimal()
                val mc = randomMathContext()
                val result = a.divideToIntegralValue(b, mc)
                out.println("\t\tassertEquals(${wrap(result)}, ${wrap(a)}.divideToIntegralValue(${wrap(b)}, ${wrapMC(mc)}))")
            }
            out.println("\t}\n")


            out.println("\t@Test fun `test doubleValue`() {")
            (0..10).forEach { _ ->
                val a = randomBigDecimal()
                out.println("\t\tassertEquals(${a.toDouble()}, ${wrap(a)}.doubleValue())")
            }
            out.println("\t}\n")


            out.println("\t@Test fun `test floatValue`() {")
            (0..10).forEach { _ ->
                val a = randomBigDecimal()
                out.println("\t\tassertEquals(${a.toFloat()}f, ${wrap(a)}.floatValue())")
            }
            out.println("\t}\n")


            out.println("\t@Test fun `test intValue`() {")
            (0..10).forEach { _ ->
                val a = randomBigDecimal()
                out.println("\t\tassertEquals(${a.toInt()}, ${wrap(a)}.intValue())")
            }
            out.println("\t}\n")


            out.println("\t@Test fun `test intValueExact`() {")
            (0..10).forEach { _ ->
                val a = BigDecimal(random.nextInt())
                out.println("\t\tassertEquals(${a.intValueExact()}, ${wrap(a)}.intValueExact())")
            }
            out.println("\t}\n")


            out.println("\t@Test fun `test longValue`() {")
            (0..10).forEach { _ ->
                val a = randomBigDecimal()
                out.println("\t\tassertEquals(${a.toLong()}, ${wrap(a)}.longValue())")
            }
            out.println("\t}\n")


            out.println("\t@Test fun `test longValueExact`() {")
            (0..10).forEach { _ ->
                val a = BigDecimal(random.nextLong())
                out.println("\t\tassertEquals(${a.toLong()}, ${wrap(a)}.longValueExact())")
            }
            out.println("\t}\n")


            out.println("\t@Test fun `test max`() {")
            (0..10).forEach { _ ->
                val a = randomBigDecimal()
                val b = randomBigDecimal()
                out.println("\t\tassertEquals(${wrap(a.max(b))}, ${wrap(a)}.max(${wrap(b)}))")
            }
            out.println("\t}\n")


            out.println("\t@Test fun `test min`() {")
            (0..10).forEach { _ ->
                val a = randomBigDecimal()
                val b = randomBigDecimal()
                out.println("\t\tassertEquals(${wrap(a.min(b))}, ${wrap(a)}.min(${wrap(b)}))")
            }
            out.println("\t}\n")


            out.println("\t@Test fun `test movePointLeft`() {")
            (0..10).forEach { _ ->
                val a = randomBigDecimal()
                val b = random.nextInt(10, 100)
                out.println("\t\tassertEquals(${wrap(a.movePointLeft(b))}, ${wrap(a)}.movePointLeft(${b}))")
            }
            out.println("\t}\n")


            out.println("\t@Test fun `test movePointRight`() {")
            (0..10).forEach { _ ->
                val a = randomBigDecimal()
                val b = random.nextInt(10, 100)
                out.println("\t\tassertEquals(${wrap(a.movePointRight(b))}, ${wrap(a)}.movePointRight(${b}))")
            }
            out.println("\t}\n")


            out.println("\t@Test fun `test multiply`() {")
            (0..10).forEach { _ ->
                val a = randomBigDecimal()
                val b = randomBigDecimal()
                out.println("\t\tassertEquals(${wrap(a.multiply(b))}, ${wrap(a)}.multiply(${wrap(b)}))")
            }
            out.println("\t}\n")


            out.println("\t@Test fun `test multiply with MathContext`() {")
            (0..10).forEach { _ ->
                val a = randomBigDecimal()
                val b = randomBigDecimal()
                val mc = randomMathContext()
                out.println("\t\tassertEquals(${wrap(a.multiply(b, mc))}, ${wrap(a)}.multiply(${wrap(b)}, ${wrapMC(mc)}))")
            }
            out.println("\t}\n")


            out.println("\t@Test fun `test negate`() {")
            (0..10).forEach { _ ->
                val a = randomBigDecimal()
                out.println("\t\tassertEquals(${wrap(a.negate())}, ${wrap(a)}.negate())")
            }
            out.println("\t}\n")


            out.println("\t@Test fun `test negate with MathContext`() {")
            (0..10).forEach { _ ->
                val a = randomBigDecimal()
                val mc = randomMathContext()
                out.println("\t\tassertEquals(${wrap(a.negate(mc))}, ${wrap(a)}.negate(${wrapMC(mc)}))")
            }
            out.println("\t}\n")


            out.println("\t@Test fun `test plus`() {")
            (0..10).forEach { _ ->
                val a = randomBigDecimal()
                out.println("\t\tassertEquals(${wrap(a.plus())}, ${wrap(a)}.plus())")
            }
            out.println("\t}\n")


            out.println("\t@Test fun `test plus with MathContext`() {")
            (0..10).forEach { _ ->
                val a = randomBigDecimal()
                val mc = randomMathContext()
                out.println("\t\tassertEquals(${wrap(a.plus(mc))}, ${wrap(a)}.plus(${wrapMC(mc)}))")
            }
            out.println("\t}\n")


            out.println("\t@Test fun `test pow`() {")
            (0..10).forEach { _ ->
                val a = randomBigDecimal()
                val b = random.nextInt(1, 10)
                out.println("\t\tassertEquals(${wrap(a.pow(b))}, ${wrap(a)}.pow(${b}))")
            }
            out.println("\t}\n")


            out.println("\t@Test fun `test pow with MathContext`() {")
            (0..10).forEach { _ ->
                val a = randomBigDecimal()
                val b = random.nextInt(1, 10)
                val mc = randomMathContext()
                out.println("\t\tassertEquals(${wrap(a.pow(b, mc))}, ${wrap(a)}.pow(${b}, ${wrapMC(mc)}))")
            }
            out.println("\t}\n")


            out.println("\t@Test fun `test precision`() {")
            (0..10).forEach { _ ->
                val a = randomBigDecimal()
                out.println("\t\tassertEquals(${a.precision()}, ${wrap(a)}.precision())")
            }
            out.println("\t}\n")


            out.println("\t@Test fun `test remainder`() {")
            (0..10).forEach { _ ->
                val a = randomBigDecimal()
                val b = randomBigDecimal()
                out.println("\t\tassertEquals(${wrap(a.remainder(b))}, ${wrap(a)}.remainder(${wrap(b)}))")
            }
            out.println("\t}\n")


            out.println("\t@Test fun `test remainder with MathContext`() {")
            (0..10).forEach { _ ->
                val a = randomBigDecimal()
                val b = randomBigDecimal()
                val mc = randomMathContext()
                out.println("\t\tassertEquals(${wrap(a.remainder(b, mc))}, ${wrap(a)}.remainder(${wrap(b)}, ${wrapMC(mc)}))")
            }
            out.println("\t}\n")


            out.println("\t@Test fun `test round`() {")
            (0..10).forEach { _ ->
                val a = randomBigDecimal()
                val mc = randomMathContext()
                out.println("\t\tassertEquals(${wrap(a.round(mc))}, ${wrap(a)}.round(${wrapMC(mc)}))")
            }
            out.println("\t}\n")


            out.println("\t@Test fun `test scale`() {")
            (0..10).forEach { _ ->
                val a = randomBigDecimal()
                out.println("\t\tassertEquals(${a.scale()}, ${wrap(a)}.scale())")
            }
            out.println("\t}\n")


            out.println("\t@Test fun `test scaleByPowerOfTen`() {")
            (0..10).forEach { _ ->
                val a = randomBigDecimal()
                val b = random.nextInt(1, 20)
                out.println("\t\tassertEquals(${wrap(a.scaleByPowerOfTen(b))}, ${wrap(a)}.scaleByPowerOfTen($b))")
            }
            out.println("\t}\n")


            out.println("\t@Test fun `test setScale`() {")
            (0..10).forEach { _ ->
                val a = randomBigDecimal()
                val b = random.nextInt(6, 20)
                out.println("\t\tassertEquals(${wrap(a.setScale(b))}, ${wrap(a)}.setScale($b))")
            }
            out.println("\t}\n")


            out.println("\t@Test fun `test setScale with RoundingMode`() {")
            (0..10).forEach { _ ->
                val a = randomBigDecimal()
                val b = random.nextInt(6, 20)
                val rm = randomRoundingMode()
                out.println("\t\tassertEquals(${wrap(a.setScale(b, rm))}, ${wrap(a)}.setScale($b, $rm))")
            }
            out.println("\t}\n")


            out.println("\t@Test fun `test shortValueExact`() {")
            (0..10).forEach { _ ->
                val a = BigDecimal(random.nextInt(Short.MIN_VALUE.toInt(), Short.MAX_VALUE.toInt()))
                out.println("\t\tassertEquals(${a.shortValueExact()}, ${wrap(a)}.shortValueExact())")
            }
            out.println("\t}\n")


            out.println("\t@Test fun `test signum`() {")
            (0..10).forEach { _ ->
                val a = randomBigDecimal()
                out.println("\t\tassertEquals(${a.signum()}, ${wrap(a)}.signum())")
            }
            out.println("\t}\n")


            out.println("\t@Test fun `test stripTrailingZeros`() {")
            (0..10).forEach { _ ->
                val a = randomBigDecimal().movePointRight(random.nextInt(10, 20))
                out.println("\t\tassertEquals(${wrap(a.stripTrailingZeros())}, ${wrap(a)}.stripTrailingZeros())")
            }
            out.println("\t}\n")


            out.println("\t@Test fun `test subtract`() {")
            (0..10).forEach { _ ->
                val a = randomBigDecimal()
                val b = randomBigDecimal()
                out.println("\t\tassertEquals(${wrap(a.subtract(b))}, ${wrap(a)}.subtract(${wrap(b)}))")
            }
            out.println("\t}\n")


            out.println("\t@Test fun `test subtract with MathContext`() {")
            (0..10).forEach { _ ->
                val a = randomBigDecimal()
                val b = randomBigDecimal()
                val mc = randomMathContext()
                out.println("\t\tassertEquals(${wrap(a.subtract(b, mc))}, ${wrap(a)}.subtract(${wrap(b)}, ${wrapMC(mc)}))")
            }
            out.println("\t}\n")


            out.println("\t@Test fun `test toBigInteger`() {")
            (0..10).forEach { _ ->
                val a = randomBigDecimal()
                out.println("\t\tassertEquals(${wrapBI(a.toBigInteger())}, ${wrap(a)}.toBigInteger())")
            }
            out.println("\t}\n")


            out.println("\t@Test fun `test toBigIntegerExact`() {")
            (0..10).forEach { _ ->
                val a = BigDecimal(random.nextLong())
                out.println("\t\tassertEquals(${wrapBI(a.toBigIntegerExact())}, ${wrap(a)}.toBigIntegerExact())")
            }
            out.println("\t}\n")


            out.println("\t@Test fun `test toEngineeringString`() {")
            (0..10).forEach { _ ->
                val a = randomBigDecimal()
                out.println("\t\tassertEquals(\"${a.toEngineeringString()}\", ${wrap(a)}.toEngineeringString())")
            }
            out.println("\t}\n")


            out.println("\t@Test fun `test toPlainString`() {")
            (0..10).forEach { _ ->
                val a = randomBigDecimal()
                out.println("\t\tassertEquals(\"${a.toPlainString()}\", ${wrap(a)}.toPlainString())")
            }
            out.println("\t}\n")


            out.println("\t@Test fun `test ulp`() {")
            (0..10).forEach { _ ->
                val a = randomBigDecimal()
                out.println("\t\tassertEquals(${wrap(a.ulp())}, ${wrap(a)}.ulp())")
            }
            out.println("\t}\n")


            out.println("\t@Test fun `test unscaledValue`() {")
            (0..10).forEach { _ ->
                val a = randomBigDecimal()
                out.println("\t\tassertEquals(${wrapBI(a.unscaledValue())}, ${wrap(a)}.unscaledValue())")
            }
            out.println("\t}\n")


            out.println("\n}")
        }


    }
}


private const val HEADER = """
package com.papacekb.kbignum

import com.papacekb.kbignum.KRoundingMode.*
import kotlin.test.Test
import kotlin.test.assertEquals

class KBigDecimalTest {
"""