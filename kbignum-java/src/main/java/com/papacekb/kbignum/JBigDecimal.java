package com.papacekb.kbignum;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class JBigDecimal {

    private final java.math.BigDecimal delegate;

    private JBigDecimal(java.math.BigDecimal delegate) {
        this.delegate = delegate;
    }

    public JBigDecimal(String value) {
        this.delegate = new java.math.BigDecimal(value);
    }

    public JBigDecimal(double value) {
        this.delegate = java.math.BigDecimal.valueOf(value);
    }

    public JBigDecimal(long value) {
        this.delegate = java.math.BigDecimal.valueOf(value);
    }

    public JBigDecimal abs() { return new JBigDecimal(delegate.abs()); }

    public JBigDecimal abs(JMathContext mc) {
        return new JBigDecimal(delegate.abs(mc.delegate));
    }

    public JBigDecimal add(JBigDecimal n) {
        return new JBigDecimal(this.delegate.add(n.delegate));
    }

    public JBigDecimal add(JBigDecimal n, JMathContext mc) {
        return new JBigDecimal(delegate.add(n.delegate, mc.delegate));
    }

    public byte byteValueExact() {
        return delegate.byteValueExact();
    }

    public int compareTo(JBigDecimal n) {
        return delegate.compareTo(n.delegate);
    }

    @SuppressWarnings("BigDecimalMethodWithoutRoundingCalled")
    public JBigDecimal divide(JBigDecimal n) {
        return new JBigDecimal(this.delegate.divide(n.delegate));
    }

    public JBigDecimal divide(JBigDecimal n, int scale, String roundingMode) {
        return new JBigDecimal(this.delegate.divide(n.delegate, scale, RoundingMode.valueOf(roundingMode)));
    }

    public JBigDecimal divide(JBigDecimal n, String roundingMode) {
        return new JBigDecimal(this.delegate.divide(n.delegate, RoundingMode.valueOf(roundingMode)));
    }

    public JBigDecimal divide(JBigDecimal n, JMathContext mc) {
        return new JBigDecimal(this.delegate.divide(n.delegate, mc.delegate));
    }

    public JBigDecimal[] divideAndRemainder(JBigDecimal n) {
        BigDecimal[] result = delegate.divideAndRemainder(n.delegate);
        return new JBigDecimal[]{
                new JBigDecimal(result[0]),
                new JBigDecimal(result[1]),
        };
    }

    public JBigDecimal[] divideAndRemainder(JBigDecimal n, JMathContext mc) {
        BigDecimal[] result = delegate.divideAndRemainder(n.delegate, mc.delegate);
        return new JBigDecimal[]{
                new JBigDecimal(result[0]),
                new JBigDecimal(result[1]),
        };
    }

    public JBigDecimal divideToIntegralValue(JBigDecimal n) {
        return new JBigDecimal(delegate.divideToIntegralValue(n.delegate));
    }

    public JBigDecimal divideToIntegralValue(JBigDecimal n, JMathContext mc) {
        return new JBigDecimal(delegate.divideToIntegralValue(n.delegate, mc.delegate));
    }

    public JBigDecimal subtract(JBigDecimal n) {
        return new JBigDecimal(this.delegate.subtract(n.delegate));
    }

    public JBigDecimal multiply(JBigDecimal n) {
        return new JBigDecimal(this.delegate.multiply(n.delegate));
    }

    @Override
    public boolean equals(Object o) {
        return o instanceof JBigDecimal && this.delegate.equals(((JBigDecimal)o).delegate);
    }

    @Override
    public int hashCode() {
        return delegate.hashCode();
    }

    @Override
    public String toString() {
        return delegate.toString();
    }

}
