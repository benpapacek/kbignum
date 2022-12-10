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
        this(new MathContext(precision, RoundingMode.valueOf(roundingMode)));
    }

}
