package com.papacekb.kbignum;

import java.util.Random;

public class BigInteger implements Comparable<BigInteger> {

    private final java.math.BigInteger delegate;

    private static final Random random = new Random();

    public static BigInteger probablePrime(int bitLength) {
        return new BigInteger(java.math.BigInteger.probablePrime(bitLength, random));
    }

    private BigInteger(java.math.BigInteger delegate) {
        this.delegate = delegate;
    }

    public BigInteger(String value) {
        delegate = new java.math.BigInteger(value);
    }

    public BigInteger(long value) {
        delegate = java.math.BigInteger.valueOf(value);
    }

    public BigInteger abs() {
        return new BigInteger(delegate.abs());
    }

    public BigInteger add(BigInteger n) {
        return new BigInteger(delegate.add(n.delegate));
    }

    public BigInteger and(BigInteger n) {
        return new BigInteger(delegate.and(n.delegate));
    }

    public BigInteger andNot(BigInteger n) {
        return new BigInteger(delegate.andNot(n.delegate));
    }

    public int bitCount() {
        return delegate.bitCount();
    }

    public int bitLength() {
        return delegate.bitLength();
    }

    public BigInteger clearBit(int n) {
        return new BigInteger(delegate.clearBit(n));
    }

    public BigInteger divide(BigInteger n) {
        return new BigInteger(delegate.divide(n.delegate));
    }

    public BigInteger[] divideAndRemainder(BigInteger n) {
        java.math.BigInteger[] result = delegate.divideAndRemainder(n.delegate);
        return new BigInteger[]{
                new BigInteger(result[0]),
                new BigInteger(result[1]),
        };
    }

    public double doubleValue() {
        return delegate.doubleValue();
    }

    public BigInteger flipBit(int n) {
        return new BigInteger(delegate.flipBit(n));
    }

    public float floatValue() {
        return delegate.floatValue();
    }

    public BigInteger gcd(BigInteger n) {
        return new BigInteger(delegate.gcd(n.delegate));
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

    public BigInteger max(BigInteger n) {
        return new BigInteger(delegate.max(n.delegate));
    }

    public BigInteger min(BigInteger n) {
        return new BigInteger(delegate.min(n.delegate));
    }

    public BigInteger mod(BigInteger n) {
        return new BigInteger(delegate.mod(n.delegate));
    }

    public BigInteger modInverse(BigInteger n) {
        return new BigInteger(delegate.modInverse(n.delegate));
    }

    public BigInteger modPow(BigInteger exp, BigInteger m) {
        return new BigInteger(delegate.modPow(exp.delegate, m.delegate));
    }

    public BigInteger multiply(BigInteger n) {
        return new BigInteger(delegate.multiply(n.delegate));
    }

    public BigInteger negate() {
        return new BigInteger(delegate.negate());
    }

    public BigInteger nextProbablePrime() {
        return new BigInteger(delegate.nextProbablePrime());
    }

    public BigInteger not() {
        return new BigInteger(delegate.not());
    }

    public BigInteger or(BigInteger n) {
        return new BigInteger(delegate.or(n.delegate));
    }

    public BigInteger pow(int exp) {
        return new BigInteger(delegate.pow(exp));
    }

    public BigInteger remainder(BigInteger n) {
        return new BigInteger(delegate.remainder(n.delegate));
    }

    public BigInteger setBit(int n) {
        return new BigInteger(delegate.setBit(n));
    }

    public BigInteger shiftLeft(int n) {
        return new BigInteger(delegate.shiftLeft(n));
    }

    public BigInteger shiftRight(int n) {
        return new BigInteger(delegate.shiftRight(n));
    }

    public int signum() {
        return delegate.signum();
    }

    public BigInteger subtract(BigInteger n) {
        return new BigInteger(delegate.subtract(n.delegate));
    }

    public boolean testBit(int n) {
        return delegate.testBit(n);
    }

    public byte[] toByteArray() {
        return delegate.toByteArray();
    }

    public BigInteger xor(BigInteger n) {
        return new BigInteger(delegate.xor(n.delegate));
    }

    @Override
    public int compareTo(BigInteger other) {
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
        return o instanceof BigInteger && delegate.equals(((BigInteger)o).delegate);
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
