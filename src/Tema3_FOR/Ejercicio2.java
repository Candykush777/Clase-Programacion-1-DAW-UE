package Tema3_FOR;

import java.util.Scanner;

public class Ejercicio2 {
    /*Leer un número entre 0 y 10. Se mostrará la tabla de multiplicar de dicho número con el
formato: 5 x 3 = 15 (desde 0 hasta 10 en líneas distintas). (TablaDeMultiplicar)
 */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un numero de 0 a 10");
        int numero = scanner.nextInt();
        if ((numero <= 10 && numero >= 0)) {
            System.out.println("Está en el rango");

        } else {
            System.out.println("No esta en el rango");
        }

        System.out.println("Tabla de multiplicar");
        for (int i = 0; i < 11; i++) {
            System.out.println(numero + " * " + i + " = " + i * numero);

        }


    }
}
