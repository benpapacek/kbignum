import com.papacekb.kbignum.BigDecimal;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BigDecimalTest {

    @Test
    public void testBigDecimal() {

        BigDecimal a = new BigDecimal(42.0);
        BigDecimal b = new BigDecimal(21.0);

        BigDecimal expected = new BigDecimal(63.0);
        BigDecimal actual = a.add(b);

        assertEquals(expected, actual);
        System.out.println(expected);
        System.out.println(actual);
    }
}
