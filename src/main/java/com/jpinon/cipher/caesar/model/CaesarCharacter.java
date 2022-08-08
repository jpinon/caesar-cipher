package com.jpinon.cipher.caesar.model;

public abstract class CaesarCharacter {

    protected static final int ALPHABET_SIZE = 26;

    protected Character character;

    public void rotate(int rotation) {

        int cipheredAsciiCode = (int)character + rotation;

        if (isOutOfBounds(cipheredAsciiCode)) {
            cipheredAsciiCode -= ALPHABET_SIZE;
        }

        character = (char) cipheredAsciiCode;
    }

    protected abstract boolean isOutOfBounds(int asciiCode);

    public Character getCharacter() {
        return character;
    }


}
