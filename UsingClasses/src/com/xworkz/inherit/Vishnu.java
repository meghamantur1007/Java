package com.xworkz.inherit;

public class Vishnu {
    private Box box;

    public Vishnu(Box box) {
        this.box = box;
    }

    public void ship() {
        if (box != null) {
            box.display();
            System.out.println("Box is shipped to the destination.");
        } else {
            System.out.println("Box is null.");
        }
    }
}