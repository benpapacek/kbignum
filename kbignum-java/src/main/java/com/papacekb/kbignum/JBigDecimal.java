package com.papacekb.kbignum;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.math.RoundingMode;

public class JBigDecimal {

    private final BigDecimal delegate;

    private JBigDecimal(BigDecimal delegate) {
        this.delegate = delegate;
    }

    public JBigDecimal(BigInteger value) {
        this.delegate = new BigDecimal(value);
    }

    public JBigDecimal(BigInteger value, JMathContext mc) {
        this.delegate = new BigDecimal(value, mc.delegate);
    }

    public JBigDecimal(String value) {
        delegate = new BigDecimal(value);
    }

    public JBigDecimal(String value, JMathContext mc) {
        delegate = new BigDecimal(value, mc.delegate);
    }

    public JBigDecimal(double value) {
        delegate = BigDecimal.valueOf(value);
    }

    public JBigDecimal(double value, JMathContext mc) {
        delegate = new BigDecimal(value, mc.delegate);
    }

    public JBigDecimal(long value) {
        delegate = BigDecimal.valueOf(value);
    }

    public JBigDecimal(long value, JMathContext mc) {
        delegate = new BigDecimal(value, mc.delegate);
    }

    public JBigDecimal(long value, int scale) {
        delegate = BigDecimal.valueOf(value, scale);
    }

    public JBigDecimal abs() { return new JBigDecimal(delegate.abs()); }

    public JBigDecimal abs(JMathContext mc) {
        return new JBigDecimal(delegate.abs(mc.delegate));
    }

    public JBigDecimal add(JBigDecimal n) {
        return new JBigDecimal(delegate.add(n.delegate));
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
        return new JBigDecimal(delegate.divide(n.delegate));
    }

    public JBigDecimal divide(JBigDecimal n, int scale, String roundingMode) {
        return new JBigDecimal(delegate.divide(n.delegate, scale, RoundingMode.valueOf(roundingMode)));
    }

    public JBigDecimal divide(JBigDecimal n, String roundingMode) {
        return new JBigDecimal(delegate.divide(n.delegate, RoundingMode.valueOf(roundingMode)));
    }

    public JBigDecimal divide(JBigDecimal n, JMathContext mc) {
        return new JBigDecimal(delegate.divide(n.delegate, mc.delegate));
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

    public double doubleValue() {
        return delegate.doubleValue();
    }

    public float floatValue() {
        return delegate.floatValue();
    }

    public int intValue() {
        return delegate.intValue();
    }

    public int intValueExact() {
        return delegate.intValueExact();
    }

    public long longValue() {
        return delegate.longValue();
    }

    public long longValueExact() {
        return delegate.longValueExact();
    }

    public JBigDecimal max(JBigDecimal n) {
        return new JBigDecimal(delegate.max(n.delegate));
    }

    public JBigDecimal min(JBigDecimal n) {
        return new JBigDecimal(delegate.min(n.delegate));
    }

    public JBigDecimal movePointLeft(int n) {
        return new JBigDecimal(delegate.movePointLeft(n));
    }

    public JBigDecimal movePointRight(int n) {
        return new JBigDecimal(delegate.movePointRight(n));
    }

    public JBigDecimal multiply(JBigDecimal n) {
        return new JBigDecimal(delegate.multiply(n.delegate));
    }

    public JBigDecimal multiply(JBigDecimal n, JMathContext mc) {
        return new JBigDecimal(delegate.multiply(n.delegate, mc.delegate));
    }

    public JBigDecimal negate() {
        return new JBigDecimal(delegate.negate());
    }

    public JBigDecimal negate(JMathContext mc) {
        return new JBigDecimal(delegate.negate(mc.delegate));
    }

    public JBigDecimal plus() {
        return new JBigDecimal(delegate.plus());
    }

    public JBigDecimal plus(JMathContext mc) {
        return new JBigDecimal(delegate.plus(mc.delegate));
    }

    public JBigDecimal pow(int n) {
        return new JBigDecimal(delegate.pow(n));
    }

    public JBigDecimal pow(int n, JMathContext mc) {
        return new JBigDecimal(delegate.pow(n, mc.delegate));
    }

    public int precision() {
        return delegate.precision();
    }

    public JBigDecimal remainder(JBigDecimal n) {
        return new JBigDecimal(delegate.remainder(n.delegate));
    }

    public JBigDecimal remainder(JBigDecimal n, JMathContext mc) {
        return new JBigDecimal(delegate.remainder(n.delegate, mc.delegate));
    }

    public JBigDecimal round(JMathContext mc) {
        return new JBigDecimal(delegate.round(mc.delegate));
    }

    public int scale() {
        return delegate.scale();
    }

    public JBigDecimal scaleByPowerOfTen(int n) {
        return new JBigDecimal(delegate.scaleByPowerOfTen(n));
    }

    @SuppressWarnings("BigDecimalMethodWithoutRoundingCalled")
    public JBigDecimal setScale(int scale) {
        return new JBigDecimal(delegate.setScale(scale));
    }

    public JBigDecimal setScale(int scale, String roundingMode) {
        return new JBigDecimal(delegate.setScale(scale, RoundingMode.valueOf(roundingMode)));
    }

    public short shortValueExact() {
        return delegate.shortValueExact();
    }

    public int signum() {
        return delegate.signum();
    }

    public JBigDecimal stripTrailingZeroes() {
        return new JBigDecimal(delegate.stripTrailingZeros());
    }

    public JBigDecimal subtract(JBigDecimal n) {
        return new JBigDecimal(delegate.subtract(n.delegate));
    }

    public JBigDecimal subtract(JBigDecimal n, JMathContext mc) {
        return new JBigDecimal(delegate.subtract(n.delegate, mc.delegate));
    }

    public JBigInteger toBigInteger() {
        return new JBigInteger(delegate.toBigInteger());
    }

    public JBigInteger toBigIntegerExact() {
        return new JBigInteger(delegate.toBigIntegerExact());
    }

    public String toEngineeringString() {
        return delegate.toEngineeringString();
    }

    public String toPlainString() {
        return delegate.toPlainString();
    }

    public JBigDecimal ulp() {
        return new JBigDecimal(delegate.ulp());
    }

    public JBigInteger unscaledValue() {
        return new JBigInteger(delegate.unscaledValue());
    }

    @Override
    public boolean equals(Object o) {
        return o instanceof JBigDecimal && delegate.equals(((JBigDecimal)o).delegate);
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
