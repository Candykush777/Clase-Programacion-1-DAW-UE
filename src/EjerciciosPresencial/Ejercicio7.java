package EjerciciosPresencial;
/*Escribe un programa que rellene un array de 100 elementos con números enteros aleatorios comprendidos
entre 0 y 500 (ambos incluidos). A continuación el programa mostrará el array y preguntará si el usuario
quiere destacar el máximo o el mínimo. Seguidamente se volverá a mostrar el array escribiendo el número
destacado entre dobles asteriscos.
para generar los números aleatorios podemos utilizar n = (int)(Math.random() * 501)
*/

import java.util.Scanner;

public class Ejercicio7 {
    static public String[] destacar = new String[]{"Máximo", "Mínimo"};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            int n = (int) (Math.random() * 501);
            array[i] = n;
        }
        System.out.println("Elementos del array : ");
        for (int item : array)
            System.out.print(" " + item);
        System.out.println("\n¿Quieres destacar el máximo o el mínimo(poner acento) ? : ");
        String destacar = " ";
        destacar = scanner.next();
        if (destacar.equalsIgnoreCase("Máximo")) {
            int maximo = array[0];
            //Encontrar ´maximo
            for (int i = 0; i < array.length; i++) {
                maximo = Math.max(maximo, array[i]);
            }
            for (int i = 0; i < array.length; i++) {
                if (array[i] == maximo) {
                    System.out.print("*" + array[i] + "* ");
                } else {
                    System.out.print(array[i] + " ");
                }
            }
        }
        if (destacar.equalsIgnoreCase("Mínimo")) {
            int minimo = array[0];
            for (int i = 0; i < array.length; i++) {
                minimo = Math.min(minimo, array[i]);}
            //Encontrar mínimo
            for (int i = 0; i < array.length; i++) {
                if (array[i] == minimo) {
                    System.out.print("*" + minimo + "* ");
                } else {
                    System.out.print(array[i] + " ");
                }

            }

        }
    }
}

