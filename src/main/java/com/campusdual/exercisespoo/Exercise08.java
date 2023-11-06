package com.campusdual.exercisespoo;

import java.util.Scanner;

public class Exercise08 {

    public static void main(String[] args) {
//        mostrarSaludo();
//        pedirNumero();
        pedirNumeroYContarDigitos();
    }

    /*Pedir al usuario su nombre y mostrar por pantalla un mensaje de bienvenida con el*/
    public static void mostrarSaludo() {
        Scanner scan = new Scanner(System.in);
        String nombreUsuario;
        System.out.println("Introduce tu nombre");
        nombreUsuario = scan.next();
        System.out.println("Hola " + nombreUsuario + "! ¿Como estas?");
    }

    /*Pedir al usuario un numero mayor que 5 y mostrarlo por pantalla*/
    public static void pedirNumero() {
        Scanner scan = new Scanner(System.in);
        int numeroParaMostrar;
        do {
            System.out.println("Introduce un numero mayor que 5");
            numeroParaMostrar = scan.nextInt();
        } while (numeroParaMostrar < 5);
        System.out.println("El numero que has escrito es: " + numeroParaMostrar);
    }

    /*Escribir un programa que solicite la carga de un numero entre 0 y 999,
     y nos muestre un mensaje de cuantos dígitos tiene el mismo. Finalizar el programa
    cuando se cargue el valor 0.*/
    public static void pedirNumeroYContarDigitos() {
        Scanner datos = new Scanner(System.in);
        int valor;
        do {
            System.out.print("Ingrese un valor entre 0 y 999 (0 finaliza):");
            valor = datos.nextInt();
            if (valor >= 100) {
                System.out.println("Es de  3 dígitos.");
            } else {
                if (valor >= 10) {
                    System.out.println("Es de  2 dígitos.");
                } else {
                    System.out.println("Es de  1 dígito.");
                }
            }
        } while (valor != 0);
    }


}
