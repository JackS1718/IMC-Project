package com.jackelin;

import java.util.Scanner;

public class ImcProject {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca su peso en kilogramos (Utilizar , para los decimales): ");
        float weight = scanner.nextFloat();
        System.out.println("Su peso es: " + weight + " Kgs.");

        System.out.println("Introduzca su altura en metros (Utilizar , para los decimales): ");
        float height = scanner.nextFloat();
        System.out.println("Su altura es: " + height + " meters.");

        float imc = (float) (weight / Math.pow(height, 2));

        System.out.println("Su índice de masa corporal es: " + imc);

        if (imc < 16.0) {
            System.out.println("Tienes una delgadez severa.");
        } else if (imc >= 16.0 && imc < 17.0) {
            System.out.println("Tienes una delgadez moderada.");
        } else if (imc >= 17.0 && imc < 18.5) {
            System.out.println("Tienes una delgadez leve.");
        } else if (imc >= 18.5 && imc < 25.0) {
            System.out.println("Tiene un peso normal.");
        } else if (imc >= 25.0 && imc < 30.0) {
            System.out.println("Tienes sobrepeso.");
        } else if (imc >= 30.0 && imc < 35.0) {
            System.out.println("Tienes obesidad clase I.");
        } else if (imc >= 35.0 && imc < 40.0) {
            System.out.println("Tienes obesidad clase II.");
        } else if (imc >= 40) {
            System.out.println("Tienes obesidad clase III.");
        }

        scanner.close();

    }
}