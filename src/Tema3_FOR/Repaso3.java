package Tema3_FOR;
/*Pedir un número por teclado. En el caso que el número introducir sea
mayor que 10 o menor que 0 el programa parará la ejecución con el mensaje "dato erróneo".
En caso contrario mostrará la tabla de multiplicar del número introducido con la siguiente estructura: "5 por 1 = 5" "5 por 2 = 10" */

import java.util.Scanner;

public class Repaso3 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Ingresa un numero : ");
        int numero= scanner.nextInt();

        if (numero > 10 || numero <0){
            System.out.println("Dato erroneo");
            return;
        }
        for (int i = 1; i <=10 ; i++) {

            int resultado=numero * i;
            System.out.println(numero + " por " + i + " = " + resultado);
            //System.out.printf("%d por %d = %d%n",numero,i,resultado);;

        }

    }
}



