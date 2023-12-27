package Tema3_SWITCH;

import java.util.Scanner;

public class Ejercicio2 {
    /*Crea un programa que permita al usuario ingresar un carácter y luego
determine si es una vocal o una consonante utilizando una sentencia switch.
 */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresar caracter en mayuscula");
        char letra = scanner.next().charAt(0);

        switch (letra) {

            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("Vocal");
                break;

            default:
                System.out.println("consonante");
        }


    }

}
