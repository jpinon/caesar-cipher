package com.jpinon.cipher.caesar.model;

public class Symbol extends CaesarCharacter{

    public Symbol(Character character) {
        this.character = character;
    }

    @Override
    public void rotate(int rotation) {
        //Symbols don't rotate
    }

    public boolean isOutOfBounds(int asciiCode) {
        return false;
    }
}
