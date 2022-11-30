import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.math.RoundingMode;

public class JBigDecimalTest {

    @Test
    public void testBigInteger() {

        BigInteger a = new BigInteger("74567456");
        BigInteger b = new BigInteger("4854");

        System.out.println(a.divide(b));
    }

    @Test
    public void testBigDecimal() {

        BigDecimal a = new BigDecimal("3.141592");
        System.out.println(a.abs(new MathContext(4, RoundingMode.CEILING)));
    }
}
