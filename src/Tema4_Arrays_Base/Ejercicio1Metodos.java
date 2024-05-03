package Tema4_Arrays_Base;

import java.util.Scanner;

/* Realiza un programa que pida 10 números por teclado y que los almacene en un array.
 A continuación se mostrará el contenido de ese array junto al índice (0 – 9)
 */
public class Ejercicio1Metodos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];
        llenarArray(array, scanner);
        mostrarArray(array);
    }

    //Metodo para rellenar el array
    public static void llenarArray(int[] array, Scanner scanner) {

        for (int i = 0; i < array.length; i++) {
            System.out.println("Introduce  número  " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
        //Mostrar contenido del array
    }

    public static void mostrarArray(int[] array) {
        System.out.println("Mostrar el array" );
        for (int elemento : array) {
            System.out.printf(elemento + " ");

        }

    }
}
