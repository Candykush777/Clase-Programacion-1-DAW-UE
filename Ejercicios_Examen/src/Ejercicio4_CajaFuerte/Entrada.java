package Ejercicio4_CajaFuerte;

import java.util.Scanner;

public class Entrada {


    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

     int combinacion;

     combinacion=(int)(Math.random()*(5001-1000))+1000;
        System.out.println("El numero de la combinacion es : ");

        System.out.println(combinacion);


        for (int i = 0; i < 5; i++) {
            System.out.println("Intrduce digitos entre 1000 y 5000 \n" +(i+1) +": ");

            int numeros= scanner.nextInt();
            scanner.nextLine();
            if (numeros ==combinacion){
                System.out.println("Enhorabuena has abierto la caja");
            }else{
                System.out.println("Error solo te quedan " +(4-i) +" intentos");
            }

            System.out.println("Caja bloqueada has perdido la oportunidad ");
        }








    }
}
