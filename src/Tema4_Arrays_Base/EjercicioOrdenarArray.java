package Tema4_Arrays_Base;

import java.util.Arrays;
import java.util.Scanner;

public class EjercicioOrdenarArray {
    static Scanner scanner = new Scanner(System.in);
    static int[] array = {2, 4, 1, 5, 8, 6, 3, 9};

    public static void main(String[] args) {
        //ordenarArrayascendente();
        ordenararraydescendente();
    }

    public static void ordenarArrayascendente() {
        Arrays.sort(array);
        //ordenar array orden ascendente
        for (int item : array) {
            System.out.print(item + " ");
        }
        System.out.println();
    }

    public static void ordenararraydescendente() {
        Arrays.sort(array);
        //ordenar array descendente
        for (int i = array.length - 1; i >= 0; i--) {

            System.out.print(array[i] + " ");
        }
    }
}
