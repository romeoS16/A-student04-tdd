package de.ba.experiment.palindrome;

import java.util.Locale;

public class PalindromeChecker {

    /**
     * Prüft, ob ein gegebener String ein Palindrom ist.
     *
     * Ein Palindrom liest sich vorwärts und rückwärts gleich.
     *
     * (Siehe ausführliche Beschreibung in README.md)
     *
     * @param text der zu prüfende Text (kann null sein)
     * @return true, wenn der Text nach vorgegebener Definition ein Palindrom ist, sonst false
     */

    public static boolean isPalindrome(String text) {
        // TODO: implementieren

        if (text == null){
            return false;
        }

        text = text.toLowerCase(Locale.ROOT);
        text = text.replaceAll("\\s", "");

        String reversed = "";
        for (int i = text.length()-1; i>=0; i--){
            reversed += text.charAt(i);
        }
        return text.equals(reversed);
    }



}
