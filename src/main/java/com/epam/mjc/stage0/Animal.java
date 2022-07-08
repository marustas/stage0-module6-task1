package com.epam.mjc.stage0;

public class Animal {
    private final String color;
    private final int numberOfPaws;
    private final boolean hasFur;

    Animal(String c, int n, boolean h) {
        color = c;
        numberOfPaws = n;
        hasFur = h;
    }
    public void getDescription() {
        System.out.print("This animal is mostly " + color + ".");
        if (numberOfPaws > 0 && numberOfPaws > 1) {
            System.out.print(" It has " + (numberOfPaws) + " paws ");
        } else if (numberOfPaws == 1) {
            System.out.print(" It has " + (numberOfPaws) + " paw ");
        }
        if (hasFur) {
            System.out.print("and a fur.");
        } else {
            System.out.print("and no fur.");
        }
    }
}