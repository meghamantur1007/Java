package com.xworkz.inherit;

public class Kamal {
    public void unwrap(Box box) {
        System.out.println("Running unwrap...");
        if (box != null) {
            box.display();
        } else {
            System.out.println("Box is null.");
        }
    }
}