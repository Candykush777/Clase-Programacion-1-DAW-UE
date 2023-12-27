package Tema4_Arrays_Multi;

import java.util.Scanner;

public class PruebasVideos {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int aleatorio = (int)(Math.random() * 99);

        int[] numeroselementos= new int[]{aleatorio};

        int[] numeros = new int[5];

        System.out.println("El tamaño del array es:  " +numeroselementos.length);

        System.out.println("Los numeros del carton son..." +numeroselementos);
        for ( int element: numeroselementos){
            System.out.println(element);
        }
    }
}
