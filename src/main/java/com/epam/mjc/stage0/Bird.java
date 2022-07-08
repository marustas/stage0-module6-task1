package com.epam.mjc.stage0;

import java.awt.*;

public class Bird extends Animal {
    Bird(){
        super("blue",2,false);
    }
    @Override
    public void getDescription() {
        super.getDescription();
        System.out.print("This animal is mostly blue. It has 2 paws and no fur. Moreover, it has 2 wings and can fly.");
    }
}
