package Tema4_Arrays_Multi;

import java.util.Scanner;
/*3. (SumaArrays) Crear una aplicación que:
    - pida la longitud de dos arrays de enteros
    - crea los array de enteros con las longitudes introducidas
    - crea un tercer array de la misma longitud que los dos anteriores
    - rellena el tercer array con la suma de las posiciones (Array1.posicion1 + array2.posicion = array3.posicion)*/

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca longitud array : ");
        int[] array1 = new int[scanner.nextInt()];
        System.out.println("Introduzca longitud array : ");
        int[] array2 = new int[scanner.nextInt()];
        int[] array3 = new int[Math.max(array1.length, array2.length)];
        for (int i = 0; i < array1.length; i++) {
            System.out.println("Introduzca elementos array1 " + " ");
            array1[i] = scanner.nextInt();
        }
        System.out.println("------------------------------------");
        for (int i = 0; i < array2.length; i++) {
            System.out.println("Introduzca elementos array2 " + " ");
            array2[i] = scanner.nextInt();
        }
        for (int i = 0; i < array3.length; i++) {
            if (i < array1.length) {
                array3[i] += array1[i];
            }
            if (i < array2.length) {
                array3[i] += array2[i];
            }

            System.out.print("El resultado del array3 es : ");
            for (int resultado : array3
            ) {
                if (resultado != 0) {
                    System.out.print(resultado + " ");

                }

            }
        }
    }
}



