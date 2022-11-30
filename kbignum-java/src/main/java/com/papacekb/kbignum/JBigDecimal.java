package com.papacekb.kbignum;

import java.math.MathContext;

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

    public JBigDecimal subtract(JBigDecimal n) {
        return new JBigDecimal(this.delegate.subtract(n.delegate));
    }

    public JBigDecimal multiply(JBigDecimal n) {
        return new JBigDecimal(this.delegate.multiply(n.delegate));
    }

    public JBigDecimal divide(JBigDecimal n) {
        return new JBigDecimal(this.delegate.divide(n.delegate));
    }

    @Override
    public boolean equals(Object o) {
        return equalsImpl(o);
    }

    @Override
    public int hashCode() {
        return hashCodeImpl();
    }

    @Override
    public String toString() {
        return toStringImpl();
    }

    public boolean equalsImpl(Object o) {
        return o instanceof JBigDecimal && this.delegate.equals(((JBigDecimal)o).delegate);
    }

    public int hashCodeImpl() {
        return delegate.hashCode();
    }

    public String toStringImpl() {
        return delegate.toString();
    }

}
