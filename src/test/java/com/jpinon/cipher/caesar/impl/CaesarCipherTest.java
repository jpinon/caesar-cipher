package com.jpinon.cipher.caesar.impl;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.jpinon.cipher.Cipher;

public class CaesarCipherTest {

    private static final String TEST_0_INPUT = "Hello_World!";
    private static final String TEST_0_OUTPUT = "Lipps_Asvph!";
    private static final int TEST_0_ROTATION = 4;

    private static final String TEST_1_INPUT = "Ciphering.";
    private static final String TEST_1_OUTPUT = "Ciphering.";
    private static final int TEST_1_ROTATION = 26;

    private static final String TEST_2_INPUT = "www.abc.xy";
    private static final String TEST_2_OUTPUT = "fff.jkl.gh";
    private static final int TEST_2_ROTATION = 87;

    private static final String TEST_3_INPUT = "159357lcfd";
    private static final String TEST_3_OUTPUT = "159357fwzx";
    private static final int TEST_3_ROTATION = 98;

    private static final String TEST_4_INPUT = "D3q4";
    private static final String TEST_4_OUTPUT = "D3q4";
    private static final int TEST_4_ROTATION = 0;

    private static final String TEST_5_INPUT = "middle-Outz";
    private static final String TEST_5_OUTPUT = "okffng-Qwvb";
    private static final int TEST_5_ROTATION = 2;

    private static final String TEST_6_INPUT = "!m-rB`-oN!.W`cLAcVbN/CqSoolII!SImji.!w/`Xu`uZa1TWPRq`uRBtok`xPT`lL-zPTc.BSRIhu..-!.!tcl!-U";
    private static final String TEST_6_OUTPUT = "!w-bL`-yX!.G`mVKmFlX/MaCyyvSS!CSwts.!g/`He`eJk1DGZBa`eBLdyu`hZD`vV-jZDm.LCBSre..-!.!dmv!-E";
    private static final int TEST_6_ROTATION = 62;

    private static final String TEST_7_INPUT = "Pz-/aI/J`EvfthGH";
    private static final String TEST_7_OUTPUT = "Dn-/oW/X`SjthvUV";
    private static final int TEST_7_ROTATION = 66;

    private static final String TEST_8_INPUT = "DNFjxo?b5h*5<LWbgs6?V5{3M].1hG)pv1VWq4(!][DZ3G)riSJ.CmUj9]7Gzl?VyeJ2dIPEW4GYW*scT8(vhu9wCr]q!7eyaoy.";
    private static final String TEST_8_OUTPUT = "WGYcqh?u5a*5<EPuzl6?O5{3F].1aZ)io1OPj4(!][WS3Z)kbLC.VfNc9]7Zse?OrxC2wBIXP4ZRP*lvM8(oan9pVk]j!7xrthr.";
    private static final int TEST_8_ROTATION = 45;

    private static final String TEST_9_INPUT = "6DWV95HzxTCHP85dvv3NY2crzt1aO8j6g2zSDvFUiJj6XWDlZvNNr";
    private static final String TEST_9_OUTPUT = "6MFE95QigCLQY85mee3WH2laic1jX8s6p2iBMeODrSs6GFMuIeWWa";
    private static final int TEST_9_ROTATION = 87;

    private static final String TEST_10_INPUT = "1X7T4VrCs23k4vv08D6yQ3S19G4rVP188M9ahuxB6j1tMGZs1m10ey7eUj62WV2exLT4C83zl7Q80M";
    private static final String TEST_10_OUTPUT = "1Y7U4WsDt23l4ww08E6zR3T19H4sWQ188N9bivyC6k1uNHAt1n10fz7fVk62XW2fyMU4D83am7R80N";
    private static final int TEST_10_ROTATION = 27;

    private static final String TEST_11_INPUT = "Always-Look-on-the-Bright-Side-of-Life";
    private static final String TEST_11_OUTPUT = "Fqbfdx-Qttp-ts-ymj-Gwnlmy-Xnij-tk-Qnkj";
    private static final int TEST_11_ROTATION = 5;

    @Test
    public void test0() {
        Cipher cipher = new CaesarCipher(TEST_0_ROTATION);
        
        String cipherString = cipher.cipher(TEST_0_INPUT);
        
        assertEquals(TEST_0_OUTPUT, cipherString);
    }

    @Test
    public void test1() {
        Cipher cipher = new CaesarCipher(TEST_1_ROTATION);

        String cipherString = cipher.cipher(TEST_1_INPUT);

        assertEquals(TEST_1_OUTPUT, cipherString);
    }

    @Test
    public void test2() {
        Cipher cipher = new CaesarCipher(TEST_2_ROTATION);

        String cipherString = cipher.cipher(TEST_2_INPUT);

        assertEquals(TEST_2_OUTPUT, cipherString);
    }

    @Test
    public void test3() {
        Cipher cipher = new CaesarCipher(TEST_3_ROTATION);

        String cipherString = cipher.cipher(TEST_3_INPUT);

        assertEquals(TEST_3_OUTPUT, cipherString);
    }

    @Test
    public void test4() {
        Cipher cipher = new CaesarCipher(TEST_4_ROTATION);

        String cipherString = cipher.cipher(TEST_4_INPUT);

        assertEquals(TEST_4_OUTPUT, cipherString);
    }

    @Test
    public void test5() {
        Cipher cipher = new CaesarCipher(TEST_5_ROTATION);

        String cipherString = cipher.cipher(TEST_5_INPUT);

        assertEquals(TEST_5_OUTPUT, cipherString);
    }

    @Test
    public void test6() {
        Cipher cipher = new CaesarCipher(TEST_6_ROTATION);

        String cipherString = cipher.cipher(TEST_6_INPUT);

        assertEquals(TEST_6_OUTPUT, cipherString);
    }

    @Test
    public void test7() {
        Cipher cipher = new CaesarCipher(TEST_7_ROTATION);

        String cipherString = cipher.cipher(TEST_7_INPUT);

        assertEquals(TEST_7_OUTPUT, cipherString);
    }

    @Test
    public void test8() {
        Cipher cipher = new CaesarCipher(TEST_8_ROTATION);

        String cipherString = cipher.cipher(TEST_8_INPUT);

        assertEquals(TEST_8_OUTPUT, cipherString);
    }

    @Test
    public void test9() {
        Cipher cipher = new CaesarCipher(TEST_9_ROTATION);

        String cipherString = cipher.cipher(TEST_9_INPUT);

        assertEquals(TEST_9_OUTPUT, cipherString);
    }

    @Test
    public void test10() {
        Cipher cipher = new CaesarCipher(TEST_10_ROTATION);

        String cipherString = cipher.cipher(TEST_10_INPUT);

        assertEquals(TEST_10_OUTPUT, cipherString);
    }

    @Test
    public void test11() {
        Cipher cipher = new CaesarCipher(TEST_11_ROTATION);

        String cipherString = cipher.cipher(TEST_11_INPUT);

        assertEquals(TEST_11_OUTPUT, cipherString);
    }
}