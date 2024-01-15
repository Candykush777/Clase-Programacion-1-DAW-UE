package Tema4_Arrays_Base;

import java.util.Scanner;
/* 2. Crear un programa que genere 30 números aleatorios entre 0 - 10 y los
guarde en un array. Una vez metidos, se deberá mostrar:
    - Numero de puntos obtenidos
    - Media de puntos obtenidos*/
public class Ejercicio2Metodos {
private static int suma=0;
private static double media=0;
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[30];
        numerosAleatorios(array);
        mostrarnumeroPuntos(array);
        sumaPuntos(array);
        mediaPuntos(array);
    }
    public static void numerosAleatorios(int array[]) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 11);
        }
    }
    public static void mostrarnumeroPuntos(int array[]) {
        for (int elemento : array) {
            System.out.println("Mostrar los puntos : ");
            System.out.printf(elemento + " ");
        }
    }
    public static void sumaPuntos(int array[]){
        for (int i = 0; i < array.length; i++) {
            suma +=array[i];
            System.out.println("\nMostrar la suma " +suma);
        }
    }
    public static void mediaPuntos(int array[]){
        for (int i = 0; i < array.length; i++) {
            media =(double )suma/array.length;
            System.out.printf("Media de los elementos: %.2f", media);
        }
    }
}
