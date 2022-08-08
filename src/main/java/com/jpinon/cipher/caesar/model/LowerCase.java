package com.jpinon.cipher.caesar.model;

public class LowerCase extends CaesarCharacter{

    public LowerCase(Character character) {
        this.character = character;
    }

    public boolean isOutOfBounds(int asciiCode) {
        return asciiCode > AsciiCode.LOWER_Z.getValue();
    }
}
