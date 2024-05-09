package Tema3_FOR;

import java.util.Scanner;

/*Realizar un programa que lea por teclado 10 números y los sume.
Al final del proceso mostrará la suma total*/
public class Repaso1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int suma = 0;

        System.out.println("Ingrese 10 numeros : ");

        for (int i = 0; i < 10; i++) {


            System.out.println("Numero " + (i + 1) + ": ");
            int numeros = scanner.nextInt();
            suma += numeros;



        }

        System.out.println("La suma total es : " + suma);

    }
}
