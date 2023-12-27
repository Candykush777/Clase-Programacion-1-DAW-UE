package Tema4_Arrays_Base;

import java.util.Scanner;

/*Realiza un programa que pida 8 números enteros, los guarde en un array
        y que luego muestre esos números junto con
        la palabra “par” o “impar” según proceda.*/
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[8];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Dame número : ");
            array[i] = scanner.nextInt();
        }

        for (int item : array) {
            if (item % 2 == 0) {
                System.out.printf(item + " : Es par ");
            } else {
                System.out.printf(item + " : Es impar ");
            }
        }
    }
}
