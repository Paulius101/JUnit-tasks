package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SkaiciuokleTest {

    @Test
    void sudetis() {
        Skaiciuokle skaiciuokle = new Skaiciuokle(3, 2);
        assertEquals(5, skaiciuokle.sudetis());
    }

    @Test
    void atimtis() {
        Skaiciuokle skaiciuokle = new Skaiciuokle(3, 2);
        assertEquals(1, skaiciuokle.atimtis());
    }

    @Test
    void daugyba() {
        Skaiciuokle skaiciuokle = new Skaiciuokle(3, 2);
        assertEquals(6, skaiciuokle.daugyba());
    }

    @Test
    void dalyba() {
        Skaiciuokle skaiciuokle = new Skaiciuokle(3, 2);
        assertEquals(1, skaiciuokle.dalyba());
    }

    @Test
    void divisionByZeroException() {
        Skaiciuokle skaiciuokle = new Skaiciuokle(3, 0);
        assertThrows(ArithmeticException.class, () -> {
            skaiciuokle.dalyba();
        });
    }
}