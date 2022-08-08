package com.jpinon.cipher.caesar.model;

public class UpperCase extends CaesarCharacter{

    public UpperCase(Character character) {
        this.character = character;
    }

    protected boolean isOutOfBounds(int asciiCode) {
        return asciiCode > AsciiCode.UPPER_Z.getValue();
    }



}
