package Tema4_Arrays_Base;

import java.util.Scanner;

/*3. Escribe un programa que lea 10 números por teclado, los guarde en un array y que luego los muestre:
    - en orden inverso, es decir, el primero que se introduce es el último en mostrarse
    - en orden normal, es decir, el primero que se muestra es el primero que se ha introducido*/
public class Ejercicio3Métodos {

    public static void leerDieznumeros (int [] array,Scanner scanner) {


        for (int i = 0; i < 10; i++) {
            System.out.println("Introduce numero  " + (i+1) + ":");
            array[i]= scanner.nextInt();

        }

    }
    public static void mostrarInverso (int [] array,Scanner scanner ){


    }

    public static void mostrarNormal (int [] array,Scanner scanner ){}



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
    }

}
