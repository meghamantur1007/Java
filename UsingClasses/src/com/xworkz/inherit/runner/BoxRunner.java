package com.xworkz.inherit.runner;

import com.xworkz.inherit.Box;
import com.xworkz.inherit.Ranjini;
import com.xworkz.inherit.Vishnu;
import com.xworkz.inherit.Kamal;
import com.xworkz.inherit.Swathi;

public class BoxRunner {
    public static void main(String[] args) {
        Ranjini ranjini = new Ranjini();
        ranjini.wrap();
        System.out.println("-----------------------------");

        Box box = new Box("IKEA", 2500, "White");
        Kamal kamal = new Kamal();
        kamal.unwrap(box);
        System.out.println("-----------------------------");

        Vishnu vishnu = new Vishnu(box);
        vishnu.ship();
        System.out.println("-----------------------------");

        Box box1 = new Box("DHL", 1800, "Yellow");
        Swathi swathi = new Swathi();
        swathi.open(box1);
    }
}