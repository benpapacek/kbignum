package com.papacekb.kbignum

import org.junit.Ignore
import org.junit.Test
import java.io.File
import java.math.BigDecimal
import java.math.BigInteger
import java.math.MathContext
import java.math.RoundingMode
import kotlin.random.Random

class KBigDecimalTestWriter {

    private val random = Random(42)

    private fun randomBigDecimal() = BigDecimal.valueOf(random.nextInt() * random.nextDouble())
    private fun randomRoundingMode() = RoundingMode.values().filterNot { it == RoundingMode.UNNECESSARY }.random()
    private fun randomMathContext() = MathContext(random.nextInt(1, 10), randomRoundingMode())

    private fun wrapBD(n: BigDecimal) = "KBigDecimal(\"$n\")"
    private fun wrapBI(n: BigInteger) = "KBigInteger(\"$n\")"
    private fun wrapMC(mc: MathContext) = "KMathContext(${mc.precision}, ${mc.roundingMode})"

    @Ignore("This is not a test per se, but a way of generating kmm tests which compare results with those of corresponding java classes")
    @Test
    fun createKBigDecimalTest() {
        val file = File("../kbignum/src/commonTest/kotlin/com/papacekb/kbignum/KBigDecimalTest.kt")

        file.printWriter().use { out ->
            out.println(HEADER)


            out.println("\t@Test fun `test abs`() {")
            (1..10).forEach { _ ->
                val a = randomBigDecimal()
                val n = a.abs()
                out.println("\t\tassertEquals(${wrapBD(n)}, ${wrapBD(a)}.abs())")
            }
            out.println("\t}\n")

            out.println("\t@Test fun `test add`() {")
            (1..10).forEach { _ ->
                val a = randomBigDecimal()
                val b = randomBigDecimal()
                val n = a.add(b)
                out.println("\t\tassertEquals(${wrapBD(n)}, ${wrapBD(a)}.add(${wrapBD(b)}))")
            }
            out.println("\t}\n")

            out.println("\t@Test fun `test add with MathContext`() {")
            (1..10).forEach { _ ->
                val a = randomBigDecimal()
                val b = randomBigDecimal()
                val mc = randomMathContext()
                val n = a.add(b, mc)
                out.println("\t\tassertEquals(${wrapBD(n)}, ${wrapBD(a)}.add(${wrapBD(b)}, ${wrapMC(mc)}))")
            }
            out.println("\t}\n")

            out.println("\t@Test fun `test byteValueExact`() {")
            (1..10).forEach { _ ->
                val a = BigDecimal(random.nextInt(0, 127))
                out.println("\t\tassertEquals(${a.byteValueExact()}, ${wrapBD(a)}.byteValueExact())")
            }
            out.println("\t}\n")

            out.println("\t@Test fun `test compareTo`() {")
            (1..10).forEach { _ ->
                val a = randomBigDecimal()
                val b = randomBigDecimal()
                out.println("\t\tassertEquals(${a.compareTo(b)}, ${wrapBD(a)}.compareTo(${wrapBD(b)}))")
            }
            out.println("\t}\n")

            out.println("\t@Test fun `test divide`() {")
            (1..10).forEach { _ ->
                val a = BigDecimal(random.nextInt(2, 100))
                val b = a.multiply(randomBigDecimal())
                out.println("\t\tassertEquals(${wrapBD(b.divide(a))}, ${wrapBD(b)}.divide(${wrapBD(a)}))")
            }
            out.println("\t}\n")

            out.println("\t@Test fun `test divide with rounding mode`() {")
            (1..10).forEach { _ ->
                val a = randomBigDecimal()
                val b = randomBigDecimal()
                val roundingMode = randomRoundingMode()
                out.println("\t\tassertEquals(${wrapBD(a.divide(b, roundingMode))}, ${wrapBD(a)}.divide(${wrapBD(b)}, $roundingMode))")
            }
            out.println("\t}\n")

            out.println("\t@Test fun `test divide with MathContext`() {")
            (1..10).forEach { _ ->
                val a = randomBigDecimal()
                val b = randomBigDecimal()
                val mathContext = randomMathContext()
                println(mathContext.roundingMode)
                out.println("\t\tassertEquals(${wrapBD(a.divide(b, mathContext))}, ${wrapBD(a)}.divide(${wrapBD(b)}, ${wrapMC(mathContext)}))")
            }
            out.println("\t}\n")

            out.println("\t@Test fun `test divideAndRemainder`() {")
            (1..10).forEach { _ ->
                val a = randomBigDecimal()
                val b = randomBigDecimal()
                val result = a.divideAndRemainder(b)
                out.println("\t\tassertEquals(listOf(${wrapBD(result[0])}, ${wrapBD(result[1])}), " +
                        "${wrapBD(a)}.divideAndRemainder(${wrapBD(b)}).asList())")
            }
            out.println("\t}\n")

            out.println("\t@Test fun `test divideAndRemainder with MathContext`() {")
            (1..10).forEach { _ ->
                val a = randomBigDecimal()
                val b = randomBigDecimal()
                val mathContext = randomMathContext()
                val result = a.divideAndRemainder(b, mathContext)
                out.println("\t\tassertEquals(listOf(${wrapBD(result[0])}, ${wrapBD(result[1])}), " +
                        "${wrapBD(a)}.divideAndRemainder(${wrapBD(b)}, ${wrapMC(mathContext)}).asList())")
            }
            out.println("\t}\n")

            out.println("\t@Test fun `test divideToIntegralValue`() {")
            (1..10).forEach { _ ->
                val a = randomBigDecimal()
                val b = randomBigDecimal()
                val result = a.divideToIntegralValue(b)
                out.println("\t\tassertEquals(${wrapBD(result)}, ${wrapBD(a)}.divideToIntegralValue(${wrapBD(b)}))")
            }
            out.println("\t}\n")

            out.println("\t@Test fun `test divideToIntegralValue with MathContext`() {")
            (1..10).forEach { _ ->
                val a = randomBigDecimal()
                val b = randomBigDecimal()
                val mc = randomMathContext()
                val result = a.divideToIntegralValue(b, mc)
                out.println("\t\tassertEquals(${wrapBD(result)}, ${wrapBD(a)}.divideToIntegralValue(${wrapBD(b)}, ${wrapMC(mc)}))")
            }
            out.println("\t}\n")

            out.println("\t@Test fun `test doubleValue`() {")
            (1..10).forEach { _ ->
                val a = randomBigDecimal()
                out.println("\t\tassertEquals(${a.toDouble()}, ${wrapBD(a)}.doubleValue())")
            }
            out.println("\t}\n")

            out.println("\t@Test fun `test floatValue`() {")
            (1..10).forEach { _ ->
                val a = randomBigDecimal()
                out.println("\t\tassertEquals(${a.toFloat()}f, ${wrapBD(a)}.floatValue())")
            }
            out.println("\t}\n")

            out.println("\t@Test fun `test intValue`() {")
            (1..10).forEach { _ ->
                val a = randomBigDecimal()
                out.println("\t\tassertEquals(${a.toInt()}, ${wrapBD(a)}.intValue())")
            }
            out.println("\t}\n")

            out.println("\t@Test fun `test intValueExact`() {")
            (1..10).forEach { _ ->
                val a = BigDecimal(random.nextInt())
                out.println("\t\tassertEquals(${a.intValueExact()}, ${wrapBD(a)}.intValueExact())")
            }
            out.println("\t}\n")

            out.println("\t@Test fun `test longValue`() {")
            (1..10).forEach { _ ->
                val a = randomBigDecimal()
                out.println("\t\tassertEquals(${a.toLong()}, ${wrapBD(a)}.longValue())")
            }
            out.println("\t}\n")

            out.println("\t@Test fun `test longValueExact`() {")
            (1..10).forEach { _ ->
                val a = BigDecimal(random.nextLong())
                out.println("\t\tassertEquals(${a.toLong()}, ${wrapBD(a)}.longValueExact())")
            }
            out.println("\t}\n")

            out.println("\t@Test fun `test max`() {")
            (1..10).forEach { _ ->
                val a = randomBigDecimal()
                val b = randomBigDecimal()
                out.println("\t\tassertEquals(${wrapBD(a.max(b))}, ${wrapBD(a)}.max(${wrapBD(b)}))")
            }
            out.println("\t}\n")

            out.println("\t@Test fun `test min`() {")
            (1..10).forEach { _ ->
                val a = randomBigDecimal()
                val b = randomBigDecimal()
                out.println("\t\tassertEquals(${wrapBD(a.min(b))}, ${wrapBD(a)}.min(${wrapBD(b)}))")
            }
            out.println("\t}\n")

            out.println("\t@Test fun `test movePointLeft`() {")
            (1..10).forEach { _ ->
                val a = randomBigDecimal()
                val b = random.nextInt(10, 100)
                out.println("\t\tassertEquals(${wrapBD(a.movePointLeft(b))}, ${wrapBD(a)}.movePointLeft(${b}))")
            }
            out.println("\t}\n")

            out.println("\t@Test fun `test movePointRight`() {")
            (1..10).forEach { _ ->
                val a = randomBigDecimal()
                val b = random.nextInt(10, 100)
                out.println("\t\tassertEquals(${wrapBD(a.movePointRight(b))}, ${wrapBD(a)}.movePointRight(${b}))")
            }
            out.println("\t}\n")

            out.println("\t@Test fun `test multiply`() {")
            (1..10).forEach { _ ->
                val a = randomBigDecimal()
                val b = randomBigDecimal()
                out.println("\t\tassertEquals(${wrapBD(a.multiply(b))}, ${wrapBD(a)}.multiply(${wrapBD(b)}))")
            }
            out.println("\t}\n")

            out.println("\t@Test fun `test multiply with MathContext`() {")
            (1..10).forEach { _ ->
                val a = randomBigDecimal()
                val b = randomBigDecimal()
                val mc = randomMathContext()
                out.println("\t\tassertEquals(${wrapBD(a.multiply(b, mc))}, ${wrapBD(a)}.multiply(${wrapBD(b)}, ${wrapMC(mc)}))")
            }
            out.println("\t}\n")

            out.println("\t@Test fun `test negate`() {")
            (1..10).forEach { _ ->
                val a = randomBigDecimal()
                out.println("\t\tassertEquals(${wrapBD(a.negate())}, ${wrapBD(a)}.negate())")
            }
            out.println("\t}\n")

            out.println("\t@Test fun `test negate with MathContext`() {")
            (1..10).forEach { _ ->
                val a = randomBigDecimal()
                val mc = randomMathContext()
                out.println("\t\tassertEquals(${wrapBD(a.negate(mc))}, ${wrapBD(a)}.negate(${wrapMC(mc)}))")
            }
            out.println("\t}\n")

            out.println("\t@Test fun `test plus`() {")
            (1..10).forEach { _ ->
                val a = randomBigDecimal()
                out.println("\t\tassertEquals(${wrapBD(a.plus())}, ${wrapBD(a)}.plus())")
            }
            out.println("\t}\n")

            out.println("\t@Test fun `test plus with MathContext`() {")
            (1..10).forEach { _ ->
                val a = randomBigDecimal()
                val mc = randomMathContext()
                out.println("\t\tassertEquals(${wrapBD(a.plus(mc))}, ${wrapBD(a)}.plus(${wrapMC(mc)}))")
            }
            out.println("\t}\n")

            out.println("\t@Test fun `test pow`() {")
            (1..10).forEach { _ ->
                val a = randomBigDecimal()
                val b = random.nextInt(1, 10)
                out.println("\t\tassertEquals(${wrapBD(a.pow(b))}, ${wrapBD(a)}.pow(${b}))")
            }
            out.println("\t}\n")

            out.println("\t@Test fun `test pow with MathContext`() {")
            (1..10).forEach { _ ->
                val a = randomBigDecimal()
                val b = random.nextInt(1, 10)
                val mc = randomMathContext()
                out.println("\t\tassertEquals(${wrapBD(a.pow(b, mc))}, ${wrapBD(a)}.pow(${b}, ${wrapMC(mc)}))")
            }
            out.println("\t}\n")

            out.println("\t@Test fun `test precision`() {")
            (1..10).forEach { _ ->
                val a = randomBigDecimal()
                out.println("\t\tassertEquals(${a.precision()}, ${wrapBD(a)}.precision())")
            }
            out.println("\t}\n")

            out.println("\t@Test fun `test remainder`() {")
            (1..10).forEach { _ ->
                val a = randomBigDecimal()
                val b = randomBigDecimal()
                out.println("\t\tassertEquals(${wrapBD(a.remainder(b))}, ${wrapBD(a)}.remainder(${wrapBD(b)}))")
            }
            out.println("\t}\n")

            out.println("\t@Test fun `test remainder with MathContext`() {")
            (1..10).forEach { _ ->
                val a = randomBigDecimal()
                val b = randomBigDecimal()
                val mc = randomMathContext()
                out.println("\t\tassertEquals(${wrapBD(a.remainder(b, mc))}, ${wrapBD(a)}.remainder(${wrapBD(b)}, ${wrapMC(mc)}))")
            }
            out.println("\t}\n")

            out.println("\t@Test fun `test round`() {")
            (1..10).forEach { _ ->
                val a = randomBigDecimal()
                val mc = randomMathContext()
                out.println("\t\tassertEquals(${wrapBD(a.round(mc))}, ${wrapBD(a)}.round(${wrapMC(mc)}))")
            }
            out.println("\t}\n")

            out.println("\t@Test fun `test scale`() {")
            (1..10).forEach { _ ->
                val a = randomBigDecimal()
                out.println("\t\tassertEquals(${a.scale()}, ${wrapBD(a)}.scale())")
            }
            out.println("\t}\n")

            out.println("\t@Test fun `test scaleByPowerOfTen`() {")
            (1..10).forEach { _ ->
                val a = randomBigDecimal()
                val b = random.nextInt(1, 20)
                out.println("\t\tassertEquals(${wrapBD(a.scaleByPowerOfTen(b))}, ${wrapBD(a)}.scaleByPowerOfTen($b))")
            }
            out.println("\t}\n")

            out.println("\t@Test fun `test setScale`() {")
            (1..10).forEach { _ ->
                val a = randomBigDecimal()
                val b = random.nextInt(10, 20)
                out.println("\t\tassertEquals(${wrapBD(a.setScale(b))}, ${wrapBD(a)}.setScale($b))")
            }
            out.println("\t}\n")

            out.println("\t@Test fun `test setScale with RoundingMode`() {")
            (1..10).forEach { _ ->
                val a = randomBigDecimal()
                val b = random.nextInt(6, 20)
                val rm = randomRoundingMode()
                out.println("\t\tassertEquals(${wrapBD(a.setScale(b, rm))}, ${wrapBD(a)}.setScale($b, $rm))")
            }
            out.println("\t}\n")


            out.println("\t@Test fun `test shortValueExact`() {")
            (1..10).forEach { _ ->
                val a = BigDecimal(random.nextInt(Short.MIN_VALUE.toInt(), Short.MAX_VALUE.toInt()))
                out.println("\t\tassertEquals(${a.shortValueExact()}, ${wrapBD(a)}.shortValueExact())")
            }
            out.println("\t}\n")

            out.println("\t@Test fun `test signum`() {")
            (1..10).forEach { _ ->
                val a = randomBigDecimal()
                out.println("\t\tassertEquals(${a.signum()}, ${wrapBD(a)}.signum())")
            }
            out.println("\t}\n")

            out.println("\t@Test fun `test stripTrailingZeros`() {")
            (1..10).forEach { _ ->
                val a = randomBigDecimal().movePointRight(random.nextInt(10, 20))
                out.println("\t\tassertEquals(${wrapBD(a.stripTrailingZeros())}, ${wrapBD(a)}.stripTrailingZeros())")
            }
            out.println("\t}\n")

            out.println("\t@Test fun `test subtract`() {")
            (1..10).forEach { _ ->
                val a = randomBigDecimal()
                val b = randomBigDecimal()
                out.println("\t\tassertEquals(${wrapBD(a.subtract(b))}, ${wrapBD(a)}.subtract(${wrapBD(b)}))")
            }
            out.println("\t}\n")

            out.println("\t@Test fun `test subtract with MathContext`() {")
            (1..10).forEach { _ ->
                val a = randomBigDecimal()
                val b = randomBigDecimal()
                val mc = randomMathContext()
                out.println("\t\tassertEquals(${wrapBD(a.subtract(b, mc))}, ${wrapBD(a)}.subtract(${wrapBD(b)}, ${wrapMC(mc)}))")
            }
            out.println("\t}\n")

            out.println("\t@Test fun `test toBigInteger`() {")
            (1..10).forEach { _ ->
                val a = randomBigDecimal()
                out.println("\t\tassertEquals(${wrapBI(a.toBigInteger())}, ${wrapBD(a)}.toBigInteger())")
            }
            out.println("\t}\n")

            out.println("\t@Test fun `test toBigIntegerExact`() {")
            (1..10).forEach { _ ->
                val a = BigDecimal(random.nextLong())
                out.println("\t\tassertEquals(${wrapBI(a.toBigIntegerExact())}, ${wrapBD(a)}.toBigIntegerExact())")
            }
            out.println("\t}\n")

            out.println("\t@Test fun `test toEngineeringString`() {")
            (1..10).forEach { _ ->
                val a = randomBigDecimal()
                out.println("\t\tassertEquals(\"${a.toEngineeringString()}\", ${wrapBD(a)}.toEngineeringString())")
            }
            out.println("\t}\n")

            out.println("\t@Test fun `test toPlainString`() {")
            (1..10).forEach { _ ->
                val a = randomBigDecimal()
                out.println("\t\tassertEquals(\"${a.toPlainString()}\", ${wrapBD(a)}.toPlainString())")
            }
            out.println("\t}\n")

            out.println("\t@Test fun `test ulp`() {")
            (1..10).forEach { _ ->
                val a = randomBigDecimal()
                out.println("\t\tassertEquals(${wrapBD(a.ulp())}, ${wrapBD(a)}.ulp())")
            }
            out.println("\t}\n")

            out.println("\t@Test fun `test unscaledValue`() {")
            (1..10).forEach { _ ->
                val a = randomBigDecimal()
                out.println("\t\tassertEquals(${wrapBI(a.unscaledValue())}, ${wrapBD(a)}.unscaledValue())")
            }
            out.println("\t}\n")

            out.println("\t@Test fun `test operator plus`() {")
            (1..10).forEach { _ ->
                val a = randomBigDecimal()
                val b = randomBigDecimal()
                out.println("\t\tassertEquals(${wrapBD(a + b)}, ${wrapBD(a)} + ${wrapBD(b)})")
            }
            out.println("\t}\n")

            out.println("\t@Test fun `test operator minus`() {")
            (1..10).forEach { _ ->
                val a = randomBigDecimal()
                val b = randomBigDecimal()
                out.println("\t\tassertEquals(${wrapBD(a - b)}, ${wrapBD(a)} - ${wrapBD(b)})")
            }
            out.println("\t}\n")

            out.println("\t@Test fun `test operator times`() {")
            (1..10).forEach { _ ->
                val a = randomBigDecimal()
                val b = randomBigDecimal()
                out.println("\t\tassertEquals(${wrapBD(a * b)}, ${wrapBD(a)} * ${wrapBD(b)})")
            }
            out.println("\t}\n")

            out.println("\t@Test fun `test operator divide`() {")
            (1..10).forEach { _ ->
                val a = randomBigDecimal()
                val b = randomBigDecimal()
                out.println("\t\tassertEquals(${wrapBD(a / b)}, ${wrapBD(a)} / ${wrapBD(b)})")
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