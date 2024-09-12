package com.xworkz.filereading;

import java.io.BufferedReader;//users/programfiles/jdk<version>/src/java/io
import java.io.FileReader;
import java.io.IOException;

public class Education {
    public static void main(String[] args) {
        String fileName = "input.txt"; // Name of the file to read

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line); // Print each line of the file to the console
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

