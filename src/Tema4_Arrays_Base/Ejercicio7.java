package Tema4_Arrays_Base;

import java.util.Random;
import java.util.Scanner;

/*1. Crea un programa que pida 10 palabras por consola y las guarde en un array de String.
Una vez hecho esto saldrá un menú que me dará las siguientes opciones:
    - Ver todas las palabras: mostrarla todas las palabras del array
    - Obtener una palabra al azar: mostrará una palabra de las que existen en el array
    - Ver número de letras: mostrará el número de letras que hay en total entre todas las palabras
    - Ver media de letras: mostrará el número medio de letras entre todas las palabas
    - Ver palabra con más letras
    - Ver palabra con menos letras*/
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*Crea un programa que pida 10 palabras por consola y las guarde en un array de String.*/
        System.out.println("Introduce 10 palabras : ");
        String diezPalabras = scanner.nextLine();
        /*mostrarla todas las palabras del array*/
        String[] frase = diezPalabras.split(" ");
        System.out.println("---------------------------------------------------");
        System.out.println();
        /*Obtener una palabra al azar: mostrará una palabra de las que existen en el array*/
        for (String frases : frase) {
            System.out.print(frases + " ");
        }
        Random random = new Random();
        int palabraRandom = random.nextInt(frase.length);
        System.out.println("\nPalabra al azar : " + frase[palabraRandom]);
        /* ¿Cuantas palabras hay en la frase? */
        System.out.println("\nCantidadd de palabras en la frase : " + frase.length);
        /*mostrará el número de letras que hay en total entre todas las palabras*/
        int totalLetras = 0;
        for (String palabra : frase) {
            for (int i = 0; i < palabra.length(); i++) {
                totalLetras++;
            }
        }
        System.out.println("\ntotal de letras que hay en la frase : " + totalLetras);
        /* mostrará el número medio de letras entre todas las palabas */
        double mediapalabras = ((double) totalLetras++ / frase.length);
        System.out.printf("Dime la media de letras por palabra : %.2f\n", mediapalabras);
        /* Cuantas palabras tengo, ejemplo clase*/
        String palabras= "Todo esta incluido";
        int numeropalabras = palabras.split(" ").length;
        System.out.println("el número de palabras es " +numeropalabras);
        /*ver palabra con más letras */

    }
}
