import org.junit.jupiter.api.Test;

import java.math.BigInteger;

public class JBigDecimalTest {

    @Test
    public void testBigDecimal() {

        BigInteger a = new BigInteger("74567456");
        BigInteger b = new BigInteger("4854");

        System.out.println(a.divide(b));
    }
}
