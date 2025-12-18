package de.ba.experiment.palindrome;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class PalindromeCheckerTest {

    // In dieser Gruppe arbeiten Sie mit Test-Driven Development (TDD).
    // Schreiben Sie Tests zuerst, bevor Sie die Methode implementieren
    // oder ändern (Red – Green – Refactor).

    @Test
    public void simpleLowercasePalindrome_returnsTrue() {
        boolean result = PalindromeChecker.isPalindrome("anna");
        assertTrue(result);
    }

    // TODO: weitere Testfälle ergänzen

    @Test
    public void noPalindrome_returnsFalse(){
        boolean result = PalindromeChecker.isPalindrome("romeo");
        assertFalse(result);
    }

    @Test
    public void upperLowercase() {
        boolean result = PalindromeChecker.isPalindrome("Anna");
        assertTrue(result);
    }

    @Test
    public void space() {
        boolean result = PalindromeChecker.isPalindrome("a abaa");
        assertTrue(result);
    }

    @Test
    public void emptyString(){
        boolean result = PalindromeChecker.isPalindrome("");
        assertTrue(result);
    }

    @Test
    public void nullString(){
        boolean result = PalindromeChecker.isPalindrome(null);
        assertFalse(result);
    }


}
