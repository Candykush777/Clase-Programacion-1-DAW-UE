package Tema3_WHILE;

import java.util.Scanner;

public class Ejemplo_video_Borja {
    // while de 0 a n
    //Introducir números hasta que se meta un 4

    public static void main(String[] args) {
        System.out.println("Iniciar programa");
        //introducir números hasta que se meta un 0;
        Scanner scanner = new Scanner(System.in);
        int numero = -1;
        int contador = 0;
        while (numero !=4){
            System.out.println("Introduce un número");
            numero = scanner.nextInt();
            if (numero!=4){
                contador++;
            }
        }
        System.out.println("El número de números diferente a 4 ha sido: "+contador);

    }

}
