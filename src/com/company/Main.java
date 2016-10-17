package com.company;


import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        String s = "mcizmlgtebmnlkejzuzlnderxmhcsufatrmfxfjyrwjdhomgjlswpwomjvocpucjlpojuxilusobhahqmznbwbofxdimxkwjakt" +
                "uibfcuteculsglgihwoezwrxhoghyabgbgjwanyuzrbkxjtfghkgecdlqksokuvmbeicrhwqybwhvcndmthpxsfhlurgqdhumjm" +
                "tgdsefpmaradtltqdyptpwjtdefnrzuryaglaylebepuvtujmjfwdjajwriqmapmhanflshqicmcvgliqrftafdxloklextelyq" +
                "dfhlhtodazmrkrxopvzeflicendrildqerufrgwiyhavpqvtwgcylpmotexehojzjoqplzoszkopajxqlwbaiqunoyvchulwlbh" +
                "kqakaozaxixnupvcfpqtnlwvgirsjyczynzmakvyqsnlvtblnpxjkdrbwbaybymalybwuauksiwobxapmxzxbqyxsywtxiuihwe" +
                "cwznphjejheyucxreoqchozamhvprzrozedgohpwmorolitazvhouiacdvsvjuonbdvrzhfqwrzprylzmghnilibgekqzeadzrc" +
                "hxtdostgrfgeloruzavgegxdgbejavlitfmiyfplvtwjlrjlmpqtmuzoyipuxozjwxplnaghxqsozebovubquqpcfjxcxmtvbfi" +
                "clpabipbnrqjlrzfioinyfqwdcpyevghgwhifxjsoabasbgaponudjxgzvkvcrcyzkdwuwkuykmzqnpfadaemykmtuhwmjuluyi" +
                "putktexsvkiblbpyzktusphcktxibndvxwzvpvgxwrixgxgrqbkfimpckydxbzvyqotwlpounvakbsbdchmpwozvsxrsvpjgvzu" +
                "pnpqyrizulghadvaynyveqruabegweamrqcphkpcwvjwyfxtvsxmksnlxticutkxjsiyueuebtjyqcujahtufrotinsfxlnwfrq";
        System.out.println(longestPalindrom(s));

    }

    private static String longestPalindrom(String s) {
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            for (int j = s.length(); j >= i; j--) {
                String pal = s.substring(i,j);
                if (isPalindrom(pal) && pal.length() > res.length()) {
                    res = pal;
                    break;
                }
            }
        }
        return res;
    }

    private static boolean isPalindrom(String s) {
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) return false;
        }
        return true;
    }
}
