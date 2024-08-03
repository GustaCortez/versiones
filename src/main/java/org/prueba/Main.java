package org.prueba;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce tu nombre: ");
        String nombre = scanner.nextLine();
        saludar(nombre);
    }

    public static void saludar(String nombre) {
        System.out.println("Hola, " + nombre + "!");
    }}