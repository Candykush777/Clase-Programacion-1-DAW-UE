package Tema3_SWITCH;

import java.util.Scanner;

public class Ejercicio3 {

    /* Desarrolla un programa que reciba un número entero y, utilizando una sentencia switch,
determine si es par o impar. */
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            int entero;
            System.out.println("Introdcue un número entero");
            entero = scanner.nextInt();
            {
                switch (entero % 2) {
                    case 0:

                        System.out.println("Par");
                        break;

                    default:
                        System.out.println("Impar");
                }


            }
        }
}
