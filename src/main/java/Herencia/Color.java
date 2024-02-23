package Herencia;

import java.util.Random;

public enum Color {
    ROJO,
    VERDE;

    public boolean equalsIgnoreCase(String color) {
        return false;
    }

    static Color getRandomColor() {
        return Color.values()[new Random().nextInt(Color.values().length)];
    }
}

