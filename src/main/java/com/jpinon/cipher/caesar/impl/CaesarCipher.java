package com.jpinon.cipher.caesar.impl;

import java.util.List;
import java.util.stream.Collectors;

import com.jpinon.cipher.caesar.factory.CaesarCharacterFactory;
import com.jpinon.cipher.caesar.model.CaesarCharacter;

import com.jpinon.cipher.Cipher;

public class CaesarCipher implements Cipher {

    private static final int ALPHABET_SIZE = 26;

    private final int cipherRotation;

    public CaesarCipher(int rotationValue) {
        this.cipherRotation = normalizeCipherRotation(rotationValue);
    }

    private int normalizeCipherRotation(int cipherRotation){
        return cipherRotation % ALPHABET_SIZE;
    }

    public String cipher(String s) {

        List<Character> characters = s.chars().mapToObj(c -> (char) c).collect(Collectors.toList());

        List<CaesarCharacter> word = characters
                .stream()
                .map(CaesarCharacterFactory::newCaesarCharacter)
                .collect(Collectors.toList());

        word.forEach(caesarCharacter -> caesarCharacter.rotate(cipherRotation));

        return word.stream()
                .map(CaesarCharacter::getCharacter)
                .map(String::valueOf)
                .collect(Collectors.joining());

    }
}
