package Tema4_Arrays_Base;

import java.util.Scanner;
/*3. Escribe un programa que lea 10 números por teclado, los guarde en un array y que luego los muestre:
    - en orden inverso, es decir, el primero que se introduce es el último en mostrarse
    - en orden normal, es decir, el primero que se muestra es el primero que se ha introducido*/
public class Ejercicio3Métodos {
    static int[] array = new int[10];
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        rellenarArray();
        mostrarArray();
        mostrarInverso();
        System.out.println();
        mostrarArray();
    }
    //rellenar array, cómo no me tiene que devolver puede ser void
    public static void rellenarArray() {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Introduce numeros : ");
            array[i] = scanner.nextInt();
        }
        System.out.println();
    }
    public static void mostrarArray(){

        System.out.println("Mostrar array : ");
        for (int item : array) {
            System.out.print(item + " ");
        }
        System.out.println();
    }
    public static void mostrarInverso(){
        System.out.println("Mostrar inverso : ");
        for (int i = array.length - 1 ;i >=0 ; i--) {
            System.out.print(array[i] + " ");
        }
    }
}
