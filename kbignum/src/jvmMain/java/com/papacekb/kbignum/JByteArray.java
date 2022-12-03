package com.papacekb.kbignum;

public class JByteArray {

    private final byte[] bytes;

    JByteArray(byte[] bytes) {
        this.bytes = bytes;
    }

    public int getSize() {
        return bytes.length;
    }

    public byte getByteAt(int index) {
        return this.bytes[index];
    }

    public byte[] getBytes() {
        return bytes;
    }
}
