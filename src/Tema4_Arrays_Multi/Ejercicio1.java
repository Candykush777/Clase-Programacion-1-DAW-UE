package Tema4_Arrays_Multi;

import java.util.Scanner;
/*1. (MultiplicarArray) Crear un array de 5 posiciones:
    - se le pedirá al usuario que introduzca cada unos de los elementos del array
    - Multiplica cada elemento del array * 2 y vuelve a guardar su valor
    - Saca por consola la suma de todos los números
    - Saca la media de todos los elementos*/
public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear un array de 5 posiciones
        int[] array = new int[5];

        // Pedir al usuario que introduzca cada uno de los elementos del array
        for (int i = 0; i < array.length; i++) {
            System.out.print("Introduce el elemento " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        // Multiplicar cada elemento del array por 2 y volver a guardar su valor
        for (int i = 0; i < array.length; i++) {
            array[i] *= 2;
        }

        // Calcular la suma de todos los números
        int suma = 0;
        for (int i = 0; i < array.length; i++) {
            suma += array[i];
        }

        // Calcular la media de todos los elementos
        double media = (double) suma / array.length;

        // Mostrar resultados por consola
        System.out.println("La suma de todos los números es: " + suma);
        System.out.println("La media de todos los elementos es: " + media);


    }
}



