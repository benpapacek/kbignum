package com.papacekb.kbignum;

import java.math.MathContext;
import java.math.RoundingMode;

public class JMathContext {

    public static final JMathContext DECIMAL32 = new JMathContext(MathContext.DECIMAL32);
    public static final JMathContext DECIMAL64 = new JMathContext(MathContext.DECIMAL64);
    public static final JMathContext DECIMAL128 = new JMathContext(MathContext.DECIMAL128);
    public static final JMathContext UNLIMITED = new JMathContext(MathContext.UNLIMITED);

    public final MathContext delegate;

    public JMathContext(MathContext delegate) {
        this.delegate = delegate;
    }

    public JMathContext(int precision) {
        this(new MathContext(precision));
    }

    public JMathContext(int precision, String roundingMode) {
        this(new MathContext(precision, roundingMode(roundingMode)));
    }

    private static RoundingMode roundingMode(String s) {
        switch(s) {
            case JRoundingMode.CEILING: return RoundingMode.CEILING;
            case JRoundingMode.DOWN: return RoundingMode.DOWN;
            case JRoundingMode.FLOOR: return RoundingMode.FLOOR;
            case JRoundingMode.HALF_DOWN: return RoundingMode.HALF_DOWN;
            case JRoundingMode.HALF_EVEN: return RoundingMode.HALF_EVEN;
            case JRoundingMode.HALF_UP: return RoundingMode.HALF_UP;
            case JRoundingMode.UNNECESSARY: return RoundingMode.UNNECESSARY;
            case JRoundingMode.UP: return RoundingMode.UP;
            default: throw new IllegalStateException("Invalid rounding mode: " + s);
        }
    }
}
