package com.papacekb.kbignum

import org.junit.Ignore
import org.junit.Test
import java.io.File
import java.math.BigDecimal
import java.math.BigInteger
import java.math.MathContext
import java.math.RoundingMode
import kotlin.random.Random
import kotlin.random.asJavaRandom

class KBigIntegerTestWriter {

    private val random = Random(42)

    private fun randomBigInteger() = BigInteger.valueOf(random.nextLong())

    private fun wrapBI(n: BigInteger) = "KBigInteger(\"$n\")"

    @Ignore("This is not a test per se, but a way of generating kmm tests which compare results with those of corresponding java classes")
    @Test
    fun createKBigIntegerTest() {
        val file = File("../kbignum/src/commonTest/kotlin/com/papacekb/kbignum/KBigIntegerTest.kt")

        file.printWriter().use { out ->
            out.println(HEADER)


            out.println("\t@Test fun `test abs`() {")
            (1..10).forEach { _ ->
                val a = randomBigInteger()
                out.println("\t\tassertEquals(${wrapBI(a.abs())}, ${wrapBI(a)}.abs())")
            }
            out.println("\t}\n")

            out.println("\t@Test fun `test add`() {")
            (1..10).forEach { _ ->
                val a = randomBigInteger()
                val b = randomBigInteger()
                out.println("\t\tassertEquals(${wrapBI(a.add(b))}, ${wrapBI(a)}.add(${wrapBI(b)}))")
            }
            out.println("\t}\n")

            out.println("\t@Test fun `test and`() {")
            (1..10).forEach { _ ->
                val a = randomBigInteger()
                val b = randomBigInteger()
                out.println("\t\tassertEquals(${wrapBI(a.and(b))}, ${wrapBI(a)}.and(${wrapBI(b)}))")
            }
            out.println("\t}\n")

            out.println("\t@Test fun `test andNot`() {")
            (1..10).forEach { _ ->
                val a = randomBigInteger()
                val b = randomBigInteger()
                out.println("\t\tassertEquals(${wrapBI(a.andNot(b))}, ${wrapBI(a)}.andNot(${wrapBI(b)}))")
            }
            out.println("\t}\n")

            out.println("\t@Test fun `test bitCount`() {")
            (1..10).forEach { _ ->
                val a = randomBigInteger()
                out.println("\t\tassertEquals(${a.bitCount()}, ${wrapBI(a)}.bitCount())")
            }
            out.println("\t}\n")

            out.println("\t@Test fun `test bitLength`() {")
            (1..10).forEach { _ ->
                val a = randomBigInteger()
                out.println("\t\tassertEquals(${a.bitLength()}, ${wrapBI(a)}.bitLength())")
            }
            out.println("\t}\n")

            out.println("\t@Test fun `test clearBit`() {")
            (1..10).forEach { _ ->
                val a = randomBigInteger()
                val n = random.nextInt(0, 20)
                out.println("\t\tassertEquals(${wrapBI(a.clearBit(n))}, ${wrapBI(a)}.clearBit($n))")
            }
            out.println("\t}\n")

            out.println("\t@Test fun `test divide`() {")
            (1..10).forEach { _ ->
                val a = BigInteger.valueOf(random.nextLong())
                val b = BigInteger.valueOf(random.nextInt().toLong())
                out.println("\t\tassertEquals(${wrapBI(a.divide(b))}, ${wrapBI(a)}.divide(${wrapBI(b)}))")
            }
            out.println("\t}\n")

            out.println("\t@Test fun `test divideAndRemainder`() {")
            (1..10).forEach { _ ->
                val a = BigInteger.valueOf(random.nextLong())
                val b = BigInteger.valueOf(random.nextInt().toLong())
                val result = a.divideAndRemainder(b)
                out.println("\t\tassertEquals(listOf(${wrapBI(result[0])}, ${wrapBI(result[1])}), " +
                        "${wrapBI(a)}.divideAndRemainder(${wrapBI(b)}).asList())")
            }
            out.println("\t}\n")

            out.println("\t@Test fun `test doubleValue`() {")
            (1..10).forEach { _ ->
                val a = randomBigInteger()
                out.println("\t\tassertEquals(${a.toDouble()}, ${wrapBI(a)}.doubleValue())")
            }
            out.println("\t}\n")

            out.println("\t@Test fun `test flipBit`() {")
            (1..10).forEach { _ ->
                val a = randomBigInteger()
                val n = random.nextInt(0, 20)
                out.println("\t\tassertEquals(${wrapBI(a.flipBit(n))}, ${wrapBI(a)}.flipBit($n))")
            }
            out.println("\t}\n")

            out.println("\t@Test fun `test floatValue`() {")
            (1..10).forEach { _ ->
                val a = BigInteger.valueOf(random.nextInt().toLong())
                out.println("\t\tassertEquals(${a.toFloat()}f, ${wrapBI(a)}.floatValue())")
            }
            out.println("\t}\n")

            out.println("\t@Test fun `test gcd`() {")
            (1..10).forEach { _ ->
                val a = randomBigInteger()
                val b = randomBigInteger()
                out.println("\t\tassertEquals(${wrapBI(a.gcd(b))}, ${wrapBI(a)}.gcd(${wrapBI(b)}))")
            }
            out.println("\t}\n")

            out.println("\t@Test fun `test getLowestSetBit`() {")
            (1..10).forEach { _ ->
                val a = randomBigInteger()
                out.println("\t\tassertEquals(${a.lowestSetBit}, ${wrapBI(a)}.getLowestSetBit())")
            }
            out.println("\t}\n")

            out.println("\t@Test fun `test intValue`() {")
            (1..10).forEach { _ ->
                val a = randomBigInteger()
                out.println("\t\tassertEquals(${a.toInt()}, ${wrapBI(a)}.intValue())")
            }
            out.println("\t}\n")

            out.println("\t@Test fun `test isProbablePrime`() {")
            (1 .. 10).forEach { _ ->
                val a = if (random.nextBoolean()) {
                    BigInteger.valueOf(random.nextLong(0, Long.MAX_VALUE))
                } else {
                    BigInteger.probablePrime(100, random.asJavaRandom())
                }
                val n = random.nextInt(1, 10)
                out.println("\t\tassertEquals(${a.isProbablePrime(n)}, ${wrapBI(a)}.isProbablePrime($n))")
            }
            out.println("\t}\n")

            out.println("\t@Test fun `test longValue`() {")
            (1 .. 10).forEach { _ ->
                val a = BigInteger.valueOf(random.nextLong())
                out.println("\t\tassertEquals(${a.toLong()}, ${wrapBI(a)}.longValue())")
            }
            out.println("\t}\n")

            out.println("\t@Test fun `test max`() {")
            (1 .. 10).forEach { _ ->
                val a = randomBigInteger()
                val b = randomBigInteger()
                out.println("\t\tassertEquals(${wrapBI(a.max(b))}, ${wrapBI(a)}.max(${wrapBI(b)}))")
            }
            out.println("\t}\n")

            out.println("\t@Test fun `test min`() {")
            (1 .. 10).forEach { _ ->
                val a = randomBigInteger()
                val b = randomBigInteger()
                out.println("\t\tassertEquals(${wrapBI(a.min(b))}, ${wrapBI(a)}.min(${wrapBI(b)}))")
            }
            out.println("\t}\n")

            out.println("\t@Test fun `test mod`() {")
            (1 .. 10).forEach { _ ->
                val a = randomBigInteger()
                val b = BigInteger.valueOf(random.nextInt(0, Integer.MAX_VALUE).toLong())
                out.println("\t\tassertEquals(${wrapBI(a.mod(b))}, ${wrapBI(a)}.mod(${wrapBI(b)}))")
            }
            out.println("\t}\n")

            out.println("\t@Test fun `test modInverse`() {")
            (1.. 10).forEach { _ ->
                val a = randomBigInteger()
                val b = BigInteger.probablePrime(20, random.asJavaRandom())
                out.println("\t\tassertEquals(${wrapBI(a.modInverse(b))}, ${wrapBI(a)}.modInverse(${wrapBI(b)}))")
            }
            out.println("\t}\n")

            out.println("\t@Test fun `test modPow`() {")
            (1.. 10).forEach { _ ->
                val a = randomBigInteger()
                val b = BigInteger.valueOf(random.nextInt(10, 1000).toLong())
                val m = BigInteger.valueOf(random.nextInt(10, 1000).toLong())
                out.println("\t\tassertEquals(${wrapBI(a.modPow(b, m))}, ${wrapBI(a)}.modPow(${wrapBI(b)}, ${wrapBI(m)}))")
            }
            out.println("\t}\n")

            out.println("\t@Test fun `test multiply`() {")
            (1.. 10).forEach { _ ->
                val a = randomBigInteger()
                val b = randomBigInteger()
                out.println("\t\tassertEquals(${wrapBI(a.multiply(b))}, ${wrapBI(a)}.multiply(${wrapBI(b)}))")
            }
            out.println("\t}\n")

            out.println("\t@Test fun `test negate`() {")
            (1.. 10).forEach { _ ->
                val a = randomBigInteger()
                out.println("\t\tassertEquals(${wrapBI(a.negate())}, ${wrapBI(a)}.negate())")
            }
            out.println("\t}\n")

            out.println("\t@Test fun `test nextProbablePrime`() {")
            (1.. 10).forEach { _ ->
                val a = BigInteger.valueOf(random.nextLong(1, Long.MAX_VALUE))
                out.println("\t\tassertEquals(${wrapBI(a.nextProbablePrime())}, ${wrapBI(a)}.nextProbablePrime())")
            }
            out.println("\t}\n")

            out.println("\t@Test fun `test not`() {")
            (1.. 10).forEach { _ ->
                val a = randomBigInteger()
                out.println("\t\tassertEquals(${wrapBI(a.not())}, ${wrapBI(a)}.not())")
            }
            out.println("\t}\n")

            out.println("\t@Test fun `test or`() {")
            (1.. 10).forEach { _ ->
                val a = randomBigInteger()
                val b = randomBigInteger()
                out.println("\t\tassertEquals(${wrapBI(a.or(b))}, ${wrapBI(a)}.or(${wrapBI(b)}))")
            }
            out.println("\t}\n")

            out.println("\t@Test fun `test pow`() {")
            (1.. 10).forEach { _ ->
                val a = BigInteger.valueOf(random.nextLong())
                val b = random.nextInt(2, 20)
                out.println("\t\tassertEquals(${wrapBI(a.pow(b))}, ${wrapBI(a)}.pow($b))")
            }
            out.println("\t}\n")

            out.println("\t@Test fun `test remainder`() {")
            (1.. 10).forEach { _ ->
                val a = BigInteger.valueOf(random.nextLong())
                val b = BigInteger.valueOf(random.nextInt().toLong())
                out.println("\t\tassertEquals(${wrapBI(a.remainder(b))}, ${wrapBI(a)}.remainder(${wrapBI(b)}))")
            }
            out.println("\t}\n")

            out.println("\t@Test fun `test setBit`() {")
            (1.. 10).forEach { _ ->
                val a = BigInteger.valueOf(random.nextLong())
                val b = random.nextInt(0, a.bitLength())
                out.println("\t\tassertEquals(${wrapBI(a.setBit(b))}, ${wrapBI(a)}.setBit($b))")
            }
            out.println("\t}\n")

            out.println("\t@Test fun `test shiftLeft`() {")
            (1.. 10).forEach { _ ->
                val a = randomBigInteger()
                val b = random.nextInt(0, 10)
                out.println("\t\tassertEquals(${wrapBI(a.shiftLeft(b))}, ${wrapBI(a)}.shiftLeft($b))")
            }
            out.println("\t}\n")

            out.println("\t@Test fun `test shiftRight`() {")
            (1.. 10).forEach { _ ->
                val a = randomBigInteger()
                val b = random.nextInt(0, 10)
                out.println("\t\tassertEquals(${wrapBI(a.shiftRight(b))}, ${wrapBI(a)}.shiftRight($b))")
            }
            out.println("\t}\n")

            out.println("\t@Test fun `test signum`() {")
            (1.. 10).forEach { _ ->
                val a = randomBigInteger()
                out.println("\t\tassertEquals(${a.signum()}, ${wrapBI(a)}.signum())")
            }
            out.println("\t}\n")

            out.println("\t@Test fun `test subtract`() {")
            (1.. 10).forEach { _ ->
                val a = randomBigInteger()
                val b = randomBigInteger()
                out.println("\t\tassertEquals(${wrapBI(a.subtract(b))}, ${wrapBI(a)}.subtract(${wrapBI(b)}))")
            }
            out.println("\t}\n")

            out.println("\t@Test fun `test testBit`() {")
            (1.. 10).forEach { _ ->
                val a = randomBigInteger()
                val b = random.nextInt(0, a.bitLength())
                out.println("\t\tassertEquals(${a.testBit(b)}, ${wrapBI(a)}.testBit($b))")
            }
            out.println("\t}\n")

            out.println("\t@Test fun `test toByteArray`() {")
            (1.. 10).forEach { _ ->
                val a = randomBigInteger()
                out.println("\t\tassertEquals(\"${a.toByteArray().hex()}\", ${wrapBI(a)}.toByteArray().hex())")
            }
            out.println("\t}\n")

            out.println("\t@Test fun `test xor`() {")
            (1.. 10).forEach { _ ->
                val a = randomBigInteger()
                val b = randomBigInteger()
                out.println("\t\tassertEquals(${wrapBI(a.xor(b))}, ${wrapBI(a)}.xor(${wrapBI(b)}))")
            }
            out.println("\t}\n")


            out.println("\n}")
        }


    }

    @OptIn(ExperimentalUnsignedTypes::class)
    fun ByteArray.hex(): String = asUByteArray().joinToString("") { it.toString(radix = 16).padStart(2, '0') }
}

private const val HEADER = """
package com.papacekb.kbignum

import com.papacekb.kbignum.KRoundingMode.*
import kotlin.test.Test
import kotlin.test.assertEquals

@OptIn(ExperimentalUnsignedTypes::class)
fun ByteArray.hex(): String = asUByteArray().joinToString("") { it.toString(radix = 16).padStart(2, '0') }

class KBigIntegerTest {
"""