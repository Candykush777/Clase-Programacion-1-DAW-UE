package Tema3_SWITCH;

import java.util.Scanner;

public class Ejercicio1 {

/*Escribe un programa en Java que solicite al usuario ingresar un número del 1 al 7
y muestre el día de la semana correspondiente utilizando una sentencia switch.
 */
        public static void main(String[] args) {
            int dia;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Introduzca un número del 1 al 7");
            dia = scanner.nextInt();
            switch (dia) {
                case 1: System.out.println("Lunes");break;
                case 2: System.out.println("Martes");break;
                case 3: System.out.println("Miercoles");break;
                case 4: System.out.println("Jueves");break;
                case 5: System.out.println("Viernes");break;
                case 6: System.out.println("Sábado");break;
                case 7: System.out.println("Domingo");break;
                default:
                    System.out.println("El dia introducido no es válido");
            }


        }
}
