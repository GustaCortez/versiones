package org.prueba;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce tu nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Elige un idioma (1. Español, 2. Inglés): ");
        int opcion = scanner.nextInt();

        saludar(nombre, opcion);
    }

    public static void saludar(String nombre, int opcion) {
        switch (opcion) {
            case 1:
                System.out.println("Hola, " + nombre + "!");
                break;
            case 2:
                System.out.println("Hello, " + nombre + "!");
                break;
            default:
                System.out.println("Idioma no soportado");
        }
    }
}