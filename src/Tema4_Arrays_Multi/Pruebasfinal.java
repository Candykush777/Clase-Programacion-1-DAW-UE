package Tema4_Arrays_Multi;

import java.util.Scanner;

public class Pruebasfinal {

    /*2. (MayorArray) Crea una aplicación que realice lo siguiente:
        - pida por pantalla la longitud del array de enteros
        - crea el array de enteros con la longitud introducida
        - pida al usuario que introduzca todos los datos del array
        - saque por pantalla el elemento mayor y el elemento menor*/

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Introduzca longitud de array : ");
            int[] array = new int[scanner.nextInt()];

            for (int i = 0; i < array.length; i++) {
                System.out.println("Introduzca datos array " + (i + 1) + " ");
                array[i] = scanner.nextInt();
            }
            int mayor = array[0];
            int menor = array[0];
            for (int elemento : array) {
                mayor = Math.max(elemento, mayor);
                menor = Math.min(elemento, menor);
            }
            System.out.println("El elmento mayor es : " + mayor);
            System.out.println();
            System.out.println("El elemento menor es : " + menor);
        }
}
