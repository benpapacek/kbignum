package com.papacekb.kbignum;

import java.util.Random;

public class JBigInteger implements Comparable<JBigInteger> {

    private final java.math.BigInteger delegate;

    private static final Random random = new Random();

    public static JBigInteger probablePrime(int bitLength) {
        return new JBigInteger(java.math.BigInteger.probablePrime(bitLength, random));
    }

    private JBigInteger(java.math.BigInteger delegate) {
        this.delegate = delegate;
    }

    public JBigInteger(String value) {
        delegate = new java.math.BigInteger(value);
    }

    public JBigInteger(long value) {
        delegate = java.math.BigInteger.valueOf(value);
    }

    public JBigInteger abs() {
        return new JBigInteger(delegate.abs());
    }

    public JBigInteger add(JBigInteger n) {
        return new JBigInteger(delegate.add(n.delegate));
    }

    public JBigInteger and(JBigInteger n) {
        return new JBigInteger(delegate.and(n.delegate));
    }

    public JBigInteger andNot(JBigInteger n) {
        return new JBigInteger(delegate.andNot(n.delegate));
    }

    public int bitCount() {
        return delegate.bitCount();
    }

    public int bitLength() {
        return delegate.bitLength();
    }

    public JBigInteger clearBit(int n) {
        return new JBigInteger(delegate.clearBit(n));
    }

    public JBigInteger divide(JBigInteger n) {
        return new JBigInteger(delegate.divide(n.delegate));
    }

    public JBigInteger[] divideAndRemainder(JBigInteger n) {
        java.math.BigInteger[] result = delegate.divideAndRemainder(n.delegate);
        return new JBigInteger[] {
                new JBigInteger(result[0]),
                new JBigInteger(result[1]),
        };
    }

    public double doubleValue() {
        return delegate.doubleValue();
    }

    public JBigInteger flipBit(int n) {
        return new JBigInteger(delegate.flipBit(n));
    }

    public float floatValue() {
        return delegate.floatValue();
    }

    public JBigInteger gcd(JBigInteger n) {
        return new JBigInteger(delegate.gcd(n.delegate));
    }

    public int getLowestSetBit() {
        return delegate.getLowestSetBit();
    }

    public int intValue() {
        return delegate.intValue();
    }

    public boolean isProbablePrime(int certainty) {
        return delegate.isProbablePrime(certainty);
    }

    public long longValue() {
        return delegate.longValue();
    }

    public JBigInteger max(JBigInteger n) {
        return new JBigInteger(delegate.max(n.delegate));
    }

    public JBigInteger min(JBigInteger n) {
        return new JBigInteger(delegate.min(n.delegate));
    }

    public JBigInteger mod(JBigInteger n) {
        return new JBigInteger(delegate.mod(n.delegate));
    }

    public JBigInteger modInverse(JBigInteger n) {
        return new JBigInteger(delegate.modInverse(n.delegate));
    }

    public JBigInteger modPow(JBigInteger exp, JBigInteger m) {
        return new JBigInteger(delegate.modPow(exp.delegate, m.delegate));
    }

    public JBigInteger multiply(JBigInteger n) {
        return new JBigInteger(delegate.multiply(n.delegate));
    }

    public JBigInteger negate() {
        return new JBigInteger(delegate.negate());
    }

    public JBigInteger nextProbablePrime() {
        return new JBigInteger(delegate.nextProbablePrime());
    }

    public JBigInteger not() {
        return new JBigInteger(delegate.not());
    }

    public JBigInteger or(JBigInteger n) {
        return new JBigInteger(delegate.or(n.delegate));
    }

    public JBigInteger pow(int exp) {
        return new JBigInteger(delegate.pow(exp));
    }

    public JBigInteger remainder(JBigInteger n) {
        return new JBigInteger(delegate.remainder(n.delegate));
    }

    public JBigInteger setBit(int n) {
        return new JBigInteger(delegate.setBit(n));
    }

    public JBigInteger shiftLeft(int n) {
        return new JBigInteger(delegate.shiftLeft(n));
    }

    public JBigInteger shiftRight(int n) {
        return new JBigInteger(delegate.shiftRight(n));
    }

    public int signum() {
        return delegate.signum();
    }

    public JBigInteger subtract(JBigInteger n) {
        return new JBigInteger(delegate.subtract(n.delegate));
    }

    public boolean testBit(int n) {
        return delegate.testBit(n);
    }

    public JByteArray toByteArray() {
        return new JByteArray(delegate.toByteArray());
    }

    public JBigInteger xor(JBigInteger n) {
        return new JBigInteger(delegate.xor(n.delegate));
    }

    @Override
    public int compareTo(JBigInteger other) {
        return delegate.compareTo(other.delegate);
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
        return o instanceof JBigInteger && delegate.equals(((JBigInteger)o).delegate);
    }

    public int hashCodeImpl() {
        return delegate.hashCode();
    }

    public String toStringImpl() {
        return delegate.toString();
    }

    public String toStringImpl(int radix) {
        return delegate.toString(radix);
    }

}
