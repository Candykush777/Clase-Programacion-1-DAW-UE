package Tema3_IF;

import java.util.Scanner;

/*Hágase un programa que lea tres enteros positivos, y compruebe si alguno es suma de los otros dos.
En la salida se mostrará “Ninguno es suma de los otros dos” o “8 = 2 + 6” (en este último caso se
introdujeron los números 2, 8 y 6). SumaTres.java*/
public class Ejercicio2bis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dame numero 1 ");
        int numero1 = scanner.nextInt();
        System.out.println("Dame numero 2 ");
        int numero2 = scanner.nextInt();
        System.out.println("Dame numero 3 ");
        int numero3 = scanner.nextInt();
        if ((numero1 != numero2 + numero3) && (numero2 != numero1 + numero3) && (numero3 != numero1 + numero2)) {
            System.out.println("Ninguno es la suma de los otros dos ");
        } else {
            System.out.println("Es la suma de los otros dos ");


        }
    }

}
