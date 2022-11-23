import com.papacekb.kbignum.JBigDecimal;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JBigDecimalTest {

    @Test
    public void testBigDecimal() {

        JBigDecimal a = new JBigDecimal(42.0);
        JBigDecimal b = new JBigDecimal(21.0);

        JBigDecimal expected = new JBigDecimal(63.0);
        JBigDecimal actual = a.add(b);

        assertEquals(expected, actual);
        System.out.println(expected);
        System.out.println(actual);
    }
}
