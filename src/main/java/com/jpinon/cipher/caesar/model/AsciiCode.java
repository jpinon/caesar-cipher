package com.jpinon.cipher.caesar.model;

public enum AsciiCode {
    UPPER_A (65),
    UPPER_Z (90),
    LOWER_A (97),
    LOWER_Z (122);

    private final int value;

    AsciiCode(int value) {
        this.value = value;
    }

    public int getValue(){
        return this.value;
    }
}
