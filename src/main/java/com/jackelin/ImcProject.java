package com.jackelin;

import java.util.Scanner;

public class ImcProject {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your weight in kilograms (Use , for decimals): ");
        float weight = scanner.nextFloat();
        System.out.println("Your weight is: " + weight + " Kgs.");

        System.out.println("Enter your height in meters (Use , for decimals): ");
        float height = scanner.nextFloat();
        System.out.println("Your height is: " + height + " meters.");

        float imc = (float) (weight / Math.pow(height, 2));

        System.out.println("Your Body Mass Index is: " + imc);

        if (imc < 16.0) {
            System.out.println("You have severe thinness.");
        } else if (imc >= 16.0 && imc < 17.0) {
            System.out.println("You have moderate thinness.");
        } else if (imc >= 17.0 && imc < 18.5) {
            System.out.println("You have mild thinness.");
        } else if (imc >= 18.5 && imc < 25.0) {
            System.out.println("You have normal weight.");
        } else if (imc >= 25.0 && imc < 30.0) {
            System.out.println("You are overweight.");
        } else if (imc >= 30.0 && imc < 35.0) {
            System.out.println("You have obesity class I.");
        } else if (imc >= 35.0 && imc < 40.0) {
            System.out.println("You have obesity class II.");
        } else if (imc >= 40) {
            System.out.println("You have obesity class III.");
        }

        scanner.close();

    }
}