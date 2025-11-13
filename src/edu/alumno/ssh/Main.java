package edu.alumno.ssh;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //Investiga el uso de random y genera por pantalla los números de la lotería primitiva.
        Random random = new Random();

        System.out.println("Números de la Lotería Primitiva:");
        // Genera 5 números principales
        for (int i = 0; i<5; i++) {
        	System.out.printf("Número %dº: %09d\n", (i+1), Math.abs(random.nextInt(999999999)+1));
        }
        // Número complementario

    }
}