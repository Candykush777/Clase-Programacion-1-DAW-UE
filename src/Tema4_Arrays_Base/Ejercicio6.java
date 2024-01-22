package Tema4_Arrays_Base;

import java.util.Scanner;

/*2. Escribe un programa que rellene un array de 20 números aleatorios entre el 0 y el 30. Una vez hecho esto realizará las siguientes operaciones:
    - modificar todos los 6 por 8
    - modificar todos los 7 por 15
    - modificar todos los 20 por 10*/
public class Ejercicio6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] array = new int[20];
        int modificaciones = 0;
        for (int i = 0; i < array.length; i++) {
            int numerosaleatorios = (int) (Math.random() * 31);
            array[i] = numerosaleatorios;
        }
        modificaciones = getModificaciones(array, modificaciones);
        System.out.println();
        for (int item : array){

            System.out.print(item + "\t");

        }
        System.out.println();
        System.out.println("\n Hay " + modificaciones +" modificaciones" );
    }

    protected static int getModificaciones(int[] array, int modificaciones) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 6) {
                array[i] = 8;
                modificaciones++;
            } else if (array[i] == 7) {
                array[i] = 15;
                modificaciones++;
            } else if (array[i] == 20) {
                array[i] = 10;
                modificaciones++;

            }
        }
        return modificaciones;
    }
}
