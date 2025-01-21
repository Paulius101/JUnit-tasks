package org.example;

public class Skaiciuokle {
    public static int a;
    public static int b;

    public Skaiciuokle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public static int sudetis() {
        return a + b;
    }

    public static int atimtis() {
        return a - b;
    }

    public static int daugyba() {
        return a * b;
    }

    public static int dalyba() {
        return a / b;
    }
}
