package Tema3_IF;

import java.util.Scanner;

public class Ejercicio1 {
    /*Hágase un programa que lea dos enteros y compruebe si el primero es o no mayor que el segundo.
   En la salida se mostrará “El primero es mayor que el segundo” o “El primero no es mayor que el segundo”.
   */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dame el entero 1 ");
        int entero1 = teclado.nextInt();
        System.out.println("Dame el número 2");
        int entero2 = teclado.nextInt();

        if (entero1 > entero2) {
            System.out.println("El primero es mayor que el segundo");
        } else {
            System.out.println("El primero no es mayor que el segundo");
        }


    }
}
