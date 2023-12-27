package Tema3_WHILE;

import java.util.Scanner;

public class Ejemplo_Borja_Dowhile {

    // Do while de 0 a n
    //Introducir números hasta que se meta un 4


        public static void main(String[] args) {
        System.out.println("Iniciar programa");
        //introducir números hasta que se meta un 0;
        Scanner scanner = new Scanner(System.in);
        int numero;
        int contador = 0;
        do {
            System.out.println("Introduce un número");
            numero = scanner.nextInt();
            if (numero != 0) {
                contador++;
            }
        } while (numero != 0);


        System.out.println("El número de números diferente a 0 ha sido: " + contador);
    }
}
