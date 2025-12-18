package de.ba.experiment.fizzbuzz;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {

    // In dieser Gruppe arbeiten Sie mit Test-Driven Development (TDD).
    // Schreiben Sie Tests zuerst, bevor Sie die Methode implementieren
    // oder ändern (Red – Green – Refactor).

    @Test
    public void fizzBuzzOfOne_returnsArrayWithOne() {
        String[] result = FizzBuzz.fizzBuzz(1);
        assertArrayEquals(new String[]{"1"}, result);
    }

    // TODO: weitere Tests schreiben

    @Test
    public void fizzBuzzSmaller_One() {
        String[] result = FizzBuzz.fizzBuzz(0);
        assertEquals(result.length, 0);
    }

    @Test
    public void fizzBuzzLength_isN(){
        String[] result = FizzBuzz.fizzBuzz(10);
        assertEquals(result.length, 10);
    }


}
