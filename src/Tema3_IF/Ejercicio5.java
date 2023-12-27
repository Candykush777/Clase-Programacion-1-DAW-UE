package Tema3_IF;

import java.util.Scanner;

public class Ejercicio5 {
        /* 5. Determinar si un número natural de 4 dígitos (entre 1000 y 9999) es capicúa. Se comprobará previamente
que el número introducido tiene 4 dígitos. En la salida se mostrará uno de los siguientes mensajes:
1. “El número no tiene 4 dígitos”;
2. “Es capicúa”
3. “No es capicúa”.
- * Un número es capicúa cuando se lee igual de izquierda a derecha que de derecha a izquierda */
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Introcuce número");
            int numero = scanner.nextInt();{
                if (numero >= 9999 || numero <= 1000);}

            System.out.println("el número no tiene 4 dígitos");


        }}


