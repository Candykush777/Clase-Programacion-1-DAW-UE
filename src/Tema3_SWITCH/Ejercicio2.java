package Tema3_SWITCH;

import java.util.Scanner;

public class Ejercicio2 {
    /*Crea un programa que permita al usuario ingresar un carácter y luego
determine si es una vocal o una consonante utilizando una sentencia switch.
 */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresar una letra : ");
        char letra = scanner.next().toLowerCase().charAt(0);

        switch (letra) {

            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("Vocal");
                break;

            default:
                System.out.println("consonante");
        }


    }

}
