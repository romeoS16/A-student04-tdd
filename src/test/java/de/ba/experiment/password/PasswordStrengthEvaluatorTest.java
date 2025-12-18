package de.ba.experiment.password;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PasswordStrengthEvaluatorTest {

    // In dieser Gruppe arbeiten Sie mit Test-Driven Development (TDD).
    // Schreiben Sie Tests zuerst, bevor Sie die Methode implementieren
    // oder ändern (Red – Green – Refactor).

    @Test
    public void nullPassword_isWeak() {
        String result = PasswordStrengthEvaluator.evaluateStrength("ab1");
        assertEquals("WEAK", result);
    }

    // TODO: weitere Tests ergänzen

    @Test
    public void invalidPassword() {
        String result = PasswordStrengthEvaluator.evaluateStrength(null);
        assertEquals("WEAK", result);
    }

    @Test
    public void tooShort() {
        String result = PasswordStrengthEvaluator.evaluateStrength("test");
        assertEquals("WEAK", result);
    }

    @Test
    public void fullfillsTwoConditions() {
        String result = PasswordStrengthEvaluator.evaluateStrength("ab1aaaaaaaA");
        assertEquals("MEDIUM", result);
    }


    // mehr Tests zu der Punkte Verteilung

}
