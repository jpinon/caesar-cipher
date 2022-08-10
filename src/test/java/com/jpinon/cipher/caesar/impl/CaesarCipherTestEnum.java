package com.jpinon.cipher.caesar.impl;

public enum CaesarCipherTestEnum {
    TEST_0 ("Hello_World!", "Lipps_Asvph!", 4),
    TEST_1 ("Ciphering.", "Ciphering.", 26),
    TEST_2 ("www.abc.xy", "fff.jkl.gh", 87),
    TEST_3 ("159357lcfd", "159357fwzx", 98),
    TEST_4 ("D3q4", "D3q4", 0),
    TEST_5 ("middle-Outz", "okffng-Qwvb", 2),
    TEST_6 ("!m-rB`-oN!.W`cLAcVbN/CqSoolII!SImji.!w/`Xu`uZa1TWPRq`uRBtok`xPT`lL-zPTc.BSRIhu..-!.!tcl!-U",
            "!w-bL`-yX!.G`mVKmFlX/MaCyyvSS!CSwts.!g/`He`eJk1DGZBa`eBLdyu`hZD`vV-jZDm.LCBSre..-!.!dmv!-E", 62),
    TEST_7 ("Pz-/aI/J`EvfthGH", "Dn-/oW/X`SjthvUV", 66),
    TEST_8 ("DNFjxo?b5h*5<LWbgs6?V5{3M].1hG)pv1VWq4(!][DZ3G)riSJ.CmUj9]7Gzl?VyeJ2dIPEW4GYW*scT8(vhu9wCr]q!7eyaoy.",
            "WGYcqh?u5a*5<EPuzl6?O5{3F].1aZ)io1OPj4(!][WS3Z)kbLC.VfNc9]7Zse?OrxC2wBIXP4ZRP*lvM8(oan9pVk]j!7xrthr.", 45),
    TEST_9 ("6DWV95HzxTCHP85dvv3NY2crzt1aO8j6g2zSDvFUiJj6XWDlZvNNr",
            "6MFE95QigCLQY85mee3WH2laic1jX8s6p2iBMeODrSs6GFMuIeWWa", 87),
    TEST_10 ("1X7T4VrCs23k4vv08D6yQ3S19G4rVP188M9ahuxB6j1tMGZs1m10ey7eUj62WV2exLT4C83zl7Q80M",
            "1Y7U4WsDt23l4ww08E6zR3T19H4sWQ188N9bivyC6k1uNHAt1n10fz7fVk62XW2fyMU4D83am7R80N", 27),
    TEST_11 ("Always-Look-on-the-Bright-Side-of-Life", "Fqbfdx-Qttp-ts-ymj-Gwnlmy-Xnij-tk-Qnkj", 5);

    private final String input;
    private final String output;
    private final int rotation;

    CaesarCipherTestEnum(String input, String output, int rotation) {
        this.input = input;
        this.output = output;
        this.rotation = rotation;
    }

    public String getInput() {
        return input;
    }

    public String getOutput() {
        return output;
    }

    public int getRotation() {
        return rotation;
    }
}
