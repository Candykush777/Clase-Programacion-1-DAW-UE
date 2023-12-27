package Tema3_FOR;

import java.util.Scanner;

public class Ejericio1bis {
    public class Ejercicio1bis{
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Numero de temperaturas introducido");
            int nTemperaturas = scanner.nextInt();
            double sumatorio = 0.0;

            for (int i=0;i < nTemperaturas; i++){
                System.out.println("Temperatura introducida: " );
                int temperatura = scanner.nextInt();
                if (temperatura <1){
                    temperatura = 10;}

                sumatorio += temperatura;

            }

            System.out.printf("La media de las temperaturas es %.2f", sumatorio/nTemperaturas);
        }
}}
