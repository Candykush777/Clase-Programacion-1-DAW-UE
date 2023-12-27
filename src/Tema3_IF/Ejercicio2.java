package Tema3_IF;

import java.util.Scanner;

public class Ejercicio2 {
    /*Hágase un programa que lea tres enteros positivos, y compruebe si alguno es suma de los otros dos.
En la salida se mostrará “Ninguno es suma de los otros dos” o “8 = 2 + 6” (en este último caso se
introdujeron los números 2, 8 y 6). SumaTres.java
 */
        public static void main(String[] args) {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Dame numero entero positivo 1");
            int enteropositivo1 = teclado.nextInt();
            System.out.println("Dame numero entero positivo 2 ");
            int enteropositivo2 = teclado.nextInt();
            System.out.println("Dame numero entero positivo 3");
            int enteropositivo3 = teclado.nextInt();

            if ((enteropositivo1 == enteropositivo2 + enteropositivo3) || (enteropositivo2 == enteropositivo1 + enteropositivo3) || (enteropositivo3 == enteropositivo1 + enteropositivo2)) {
                System.out.println("Uno de los números es la suma de los otros dos");
            } else {
                System.out.println("Ninguno es suma de los otros dos");
            }
        }
}
