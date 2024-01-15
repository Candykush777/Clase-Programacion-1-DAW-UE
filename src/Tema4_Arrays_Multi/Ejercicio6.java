package Tema4_Arrays_Multi;

import java.util.Scanner;


/*1. (GeneradorPalabras) Crea un programa que cumpla los siguientes requisitos:
    - Crear un de chars con todas las letras del abecedario.
    - Crear un array de String con una longitud pedida por teclado
    - Pedir la longitud de cada una de las palabras que formarán parte del array del apartado 2. Tras pedir la longitud se creará una
     palabra de forma aleatoria con la longitud deseada (cada letra será una posición del array del apartado 1) y se guardará en el array del apartado 2
    - Imprimir por pantalla las palabras generadas*/
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] abecedario = new char[26];
        for (int i = 0; i < abecedario.length; i++) {
            abecedario[i] = (char) ('a' + i);

        }
        System.out.println("Abecedario : ");
        for (char letra : abecedario) {
            System.out.print(letra + " ");

        }
        System.out.println("\nIntroducir longitud array : ");
        String array[] = new String[scanner.nextInt()];

    }
}
