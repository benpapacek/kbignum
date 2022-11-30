package com.papacekb.kbignum;

import java.math.MathContext;
import java.math.RoundingMode;

public class JMathContext {

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
            case "CEILING": return RoundingMode.CEILING;
            case "DOWN": return RoundingMode.DOWN;
            case "FLOOR": return RoundingMode.FLOOR;
            case "HALF_DOWN": return RoundingMode.HALF_DOWN;
            case "HALF_EVEN": return RoundingMode.HALF_EVEN;
            case "HALF_UP": return RoundingMode.HALF_UP;
            case "UNNECESSARY": return RoundingMode.UNNECESSARY;
            case "UP": return RoundingMode.UP;
            default: throw new IllegalStateException("Invalid rounding mode: " + s);
        }
    }
}
