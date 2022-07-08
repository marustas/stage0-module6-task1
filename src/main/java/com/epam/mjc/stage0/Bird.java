package com.epam.mjc.stage0;

import java.awt.*;

public class Bird extends Animal {
    Bird() {
        super("blue", 2, false);
    }

    @Override
    public void getDescription() {
        super.getDescription();
        System.out.print("Moreover,it has 2 wings and can fly.");
    }

    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.getDescription();
    }
}


