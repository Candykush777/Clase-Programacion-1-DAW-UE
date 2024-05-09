package Tema3_IF;

/*Pedir por teclado un entero y guardarlo en una variable llamada a. Comprobar si “a” es par.
De serlo, se almacena en la cadena “s” el texto “Es par”. Al final del bloque mostrar el mensaje por pantalla*/

import java.util.Scanner;

public class RepasoIF2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un numero entero : ");
        int a = scanner.nextInt();
        if (a % 2 == 0) {

            String s = "Es par";

            System.out.println(s);

        } else {
            System.out.println("El numero no es par");
        }

    }
}
