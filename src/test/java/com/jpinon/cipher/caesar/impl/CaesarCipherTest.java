package com.jpinon.cipher.caesar.impl;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import com.jpinon.cipher.Cipher;

public class CaesarCipherTest {

    private static Stream<CaesarCipherTestEnum> parameters() {
        return Stream.of(CaesarCipherTestEnum.values());
    }

    @ParameterizedTest
    @MethodSource("parameters")
    public void testCaesarCipher(CaesarCipherTestEnum data) {
        Cipher cipher = new CaesarCipher(data.getRotation());
        
        String cipherString = cipher.cipher(data.getInput());
        
        assertEquals(data.getOutput(), cipherString);
    }
}