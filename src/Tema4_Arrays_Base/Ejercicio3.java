package Tema4_Arrays_Base;

import java.util.Scanner;

/*3. Escribe un programa que lea 10 números por teclado, los guarde en un array y que luego los muestre:
    - en orden inverso, es decir, el primero que se introduce es el último en mostrarse
    - en orden normal, es decir, el primero que se muestra es el primero que se ha introducido*/
public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Introduce  número " + i + ":");
            array [i] = scanner.nextInt();
        }
        System.out.println("Contenido del array : ");

        for (int item : array) {

            System.out.printf(item + " ");


        }
        System.out.println();
        System.out.println("Contenido del array en orden inverso:");

        // Mostrar en orden inverso utilizando un bucle for
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.printf(array[i] + " ");
        }

        System.out.println();
    }
}
