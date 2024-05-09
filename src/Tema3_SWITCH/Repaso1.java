package Tema3_SWITCH;

import java.util.Scanner;

/*Escribe un programa que solicite al usuario ingresar un número del 1 al 12 y muestre la estación del año
correspondiente (por ejemplo, "Primavera", "Verano", "Otoño", "Invierno") utilizando una sentencia switch.*/
public class Repaso1 {


    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int option;
        System.out.println("Introduce un mes del año : ");
        option= scanner.nextInt();
        switch (option){

            case 1 :
                System.out.println("Invierno");
                break;
            case 2 :
                System.out.println("Invierno");
                break;
            case 3:
                System.out.println("Primavera");
                break;
            case 4 :
                System.out.println("Primavera");
                break;
            case 5 :
                System.out.println("Primavera");
                break;
            case 6 :
                System.out.println("Primavera");
                break;
            case 7 :
                System.out.println("Verano");
                break;
            case 8 :
                System.out.println("Verano");
                break;
            case 9 :
                System.out.println("Verano");
                break;
            case 10 :
                System.out.println("Otoño");
                break;
            case 11 :
                System.out.println("Otoño");
                break;
            case 12 :
                System.out.println("Invierno");
                break;
            default:
                System.out.println("Introduce un mes correcto");
        }
    }
}
