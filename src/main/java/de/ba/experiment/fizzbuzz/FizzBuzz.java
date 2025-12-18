package de.ba.experiment.fizzbuzz;

public class FizzBuzz {

    /**
     * Gibt für die Zahlen von 1 bis n jeweils einen String zurück.
     *
     * (Siehe ausführliche Beschreibung in README.md)
     *
     * @param n die größe des Arrays
     * @return ein String-Array der Länge n mit den FizzBuzz-Werten
     */

    public static String[] fizzBuzz(int n) {
        // TODO: implementieren

        if (n <= 0){
            String [] result = new String[0];
        }

        String[] result = new String[n];

        for (int i=0; i<n; i++){
            result[i] = String.valueOf(i +1);
        }

        return result;
    }
}
