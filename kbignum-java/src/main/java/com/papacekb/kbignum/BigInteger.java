package com.papacekb.kbignum;

public class BigInteger {

    private final java.math.BigInteger delegate;

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

    public BigInteger subtract(BigInteger n) {
        return new BigInteger(delegate.subtract(n.delegate));
    }

    public BigInteger multiply(BigInteger n) {
        return new BigInteger(delegate.multiply(n.delegate));
    }

    public BigInteger divide(BigInteger n) {
        return new BigInteger(delegate.divide(n.delegate));
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

}
