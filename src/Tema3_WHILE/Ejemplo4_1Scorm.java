package Tema3_WHILE;

import java.util.Scanner;

public class Ejemplo4_1Scorm {
    /*Vamos a leer por el teclado y volverlo a mostrar por pntalla para ver que funciona bien*/

        public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Programa leer y escribir");
        System.out.println("Vamos a imprimir por pantalla todo lo que escribimos");
        System.out.println("Para terminar escribe FIN en mayusculas");
        //Leemos la 1a cadena de texto, si fuera FIN no entrariamos en el bucle
        String cadenadeTexto = scanner.next();
        while (cadenadeTexto != "FIN") {
            //Imprimir por pantalla lo leido por teclado(scanner)
            System.out.println(cadenadeTexto);
            //leer la siguiente linea de teclado
            cadenadeTexto = scanner.next();
            //...imprimirla por pantalla
        }
        //Si queremos imprimir el FIN también...

        System.out.println(cadenadeTexto);


    }
}
