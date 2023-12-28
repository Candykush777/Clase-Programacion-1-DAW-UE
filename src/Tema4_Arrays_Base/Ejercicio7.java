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
        System.out.println("Introduce 10 palabras : ");
        String diezPalabras = scanner.nextLine();
        String[] frase = diezPalabras.split(" ");
        int opcion;
        do {
            System.out.println("1. Ver todas las plabras ");
            System.out.println("2. Obtener una palabra al azar ");
            System.out.println("3. Ver número de letras ");
            System.out.println("4. Ver media de letras ");
            System.out.println("5. Ver palabra con mas letras ");
            System.out.println("6. Ver palabra con menos letras");
            System.out.println("7. Salir del programa ");
            opcion = scanner.nextInt();
            scanner.nextLine();
            switch (opcion) {
                case 1:
                    if (frase.length == 10) {
                        System.out.println("La frase es : \n " + diezPalabras);
                    } else {
                        System.out.println("Debe tener 10 palabras");
                    }
                    break;
                case 2:
                    Random random = new Random();
                    int palabrarandom = random.nextInt(frase.length);
                    System.out.println("La palabra al azar es : \n" + frase[palabrarandom]);
                    break;
                case 3:
                    int numeroLetras = 0;
                    for (String palabra : frase) {
                        numeroLetras += palabra.length();
                    }
                    System.out.println("El numero de letras es : " + numeroLetras);
                    break;
                case 4:
                    double mediaLetras = 0;
                    for (String palabra : frase) {
                        mediaLetras += palabra.length();
                    }
                    mediaLetras /= frase.length;
                    System.out.printf("La Media de letras es : %.2f%n", mediaLetras);
                    break;
                case 5:
                    String palabraMayor = "";
                    for (String palabra : frase) {
                        if (palabra.length() > palabraMayor.length()) {
                            palabraMayor = palabra;
                        }
                    }
                    System.out.println("La palabra mayor es : \n" + palabraMayor);
                    break;
                case 6:
                    String palabraMenor = frase[0];
                    for (String palabra : frase) {
                        if (palabra.length() < palabraMenor.length()) {
                            palabraMenor = palabra;
                        }
                    }
                    System.out.println("La palabra menos es : \n" + palabraMenor);
                    break;
            }
        }
        while (opcion != 7);
        System.out.println("\"Sayonara Baby\"");


    }
}



