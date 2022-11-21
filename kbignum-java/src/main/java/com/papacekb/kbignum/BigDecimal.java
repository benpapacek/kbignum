package com.papacekb.kbignum;

public class BigDecimal {

    private final java.math.BigDecimal delegate;

    private BigDecimal(java.math.BigDecimal delegate) {
        this.delegate = delegate;
    }

    public BigDecimal(String value) {
        this.delegate = new java.math.BigDecimal(value);
    }

    public BigDecimal(double value) {
        this.delegate = java.math.BigDecimal.valueOf(value);
    }

    public BigDecimal(long value) {
        this.delegate = java.math.BigDecimal.valueOf(value);
    }

    public BigDecimal add(BigDecimal n) {
        return new BigDecimal(this.delegate.add(n.delegate));
    }

    public BigDecimal subtract(BigDecimal n) {
        return new BigDecimal(this.delegate.subtract(n.delegate));
    }

    public BigDecimal multiply(BigDecimal n) {
        return new BigDecimal(this.delegate.multiply(n.delegate));
    }

    public BigDecimal divide(BigDecimal n) {
        return new BigDecimal(this.delegate.divide(n.delegate));
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
        return o instanceof BigDecimal && this.delegate.equals(((BigDecimal)o).delegate);
    }

    public int hashCodeImpl() {
        return delegate.hashCode();
    }

    public String toStringImpl() {
        return delegate.toString();
    }

}
