package com.xworkz.inherit;

public class Swathi {
    public Box open(Box box) {
        if (box != null) {
            box.pack();
            box.display();
        } else {
            System.out.println("Box is null.");
        }
        return box;
    }
}
