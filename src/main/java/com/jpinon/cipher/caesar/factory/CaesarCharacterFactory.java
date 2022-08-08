package com.jpinon.cipher.caesar.factory;

import com.jpinon.cipher.caesar.model.AsciiCode;
import com.jpinon.cipher.caesar.model.CaesarCharacter;
import com.jpinon.cipher.caesar.model.LowerCase;
import com.jpinon.cipher.caesar.model.Symbol;
import com.jpinon.cipher.caesar.model.UpperCase;

public class CaesarCharacterFactory {

    public static CaesarCharacter newCaesarCharacter(Character character) {
        if (isLowerCaseCharacter(character)) {
            return new LowerCase(character);
        }

        if (isUpperCaseCharacter(character)) {
            return new UpperCase(character);
        }

        return new Symbol(character);
    }


    private static boolean isUpperCaseCharacter(Character character) {
        return character <= AsciiCode.UPPER_Z.getValue() && character >= AsciiCode.UPPER_A.getValue();
    }

    private static boolean isLowerCaseCharacter(Character character) {
        return character <= AsciiCode.LOWER_Z.getValue() && character >= AsciiCode.LOWER_A.getValue();
    }
}
