package Tema3_WHILE;

import java.util.Scanner;

public class Ejercicio1 {
    //Leer números enteros hasta introducir un 0. El programa obtendrá la suma de todos
//los números positivos. (SumarPositivos)

        public static void main(String[] args) {
        System.out.println("Leer numeros hasta introducir un 0");
        Scanner scanner = new Scanner(System.in);
        int numero, sumatorio = 0;
        do {
            System.out.println("Introduce numero");
            numero = scanner.nextInt();
            if (numero >= 0) ;
            sumatorio+=numero;
        }
        while (numero != 0);
        System.out.println("Suma de numeros positivos:  " + sumatorio);
    }
}
