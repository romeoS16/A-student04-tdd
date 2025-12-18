package de.ba.experiment.password;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class PasswordStrengthEvaluator {

    /**
     * Bewertet die Stärke eines Passworts.
     *
     * (Siehe ausführliche Beschreibung in README.md)
     *
     * @param password das zu prüfende Passwort
     * @return "WEAK", "MEDIUM" oder "STRONG" nach Definition
     */

    public static String evaluateStrength(String password) {
        // TODO: implementieren

        if (password == null) {
            return "WEAK";
        }
        if (password.contains("\\s")){
            return "WEAK";
        }
        if (password.isEmpty()){
            return "WEAK";
        }
        if (password.length() <= 5){
            return "WEAK";
        }

        Pattern smallLettersPattern = Pattern.compile("[a-z]");
        Matcher smallLetterMatcher = smallLettersPattern.matcher(password);

        Pattern bigLettersPattern = Pattern.compile("[A-Z]");
        Matcher bigLetterMatcher = bigLettersPattern.matcher(password);


        //Matcher matcher = PASSWORD_PATTERN.matcher(passwort);
            //return matcher.matches();
        int score = 0;
        if (smallLetterMatcher.find()){
            score += 1;
        }
        if (bigLetterMatcher.find()){
            score += 1;
        }

        if (score >= 4){
            return "STRONG";
        }
        if (score == 3){
            return "MEDIUM";
        }
        else{
            return "WEAK";
        }
    }


}
