package Tema3_IF;

import java.util.Scanner;

/*Hágase un programa que lea dos enteros y compruebe si el primero es o no mayor que el segundo.
 En la salida se mostrará “El primero es mayor que el segundo” o “El primero no es mayor que el segundo”.
 */
public class Ejercicio1bis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dame el numero 1" );
        int numero1 = scanner.nextInt();
        System.out.println("Dame el numero 2");
        int numero2 = scanner.nextInt();


        if (numero1 >numero2){
            System.out.println("El primero es m,ayor que el segundo");
        } else {
            System.out.println("El primero no es mayor que el segundo");




        }

    }}
