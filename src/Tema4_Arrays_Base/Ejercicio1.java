package Tema4_Arrays_Base;

import java.util.Scanner;

/* Realiza un programa que pida 10 números por teclado y que los almacene en un array.
 A continuación se mostrará el contenido de ese array junto al índice (0 – 9)
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Introduce numero " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
        System.out.println("Contenido del array : ");

        for (int item : array) {

            System.out.printf(item + " ");
        }

    }
}
