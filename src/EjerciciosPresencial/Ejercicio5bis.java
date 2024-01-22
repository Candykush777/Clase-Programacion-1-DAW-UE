package EjerciciosPresencial;
/*Realiza un programa que pinte la letra L por pantalla hecha con asteriscos. El programa pedirá la altura. El
palo horizontal de la L tendrá una longitud de la mitad (división entera entre 2) de la altura más uno.*/

import java.util.Scanner;

public class Ejercicio5bis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce la altura: ");
        int altura = scanner.nextInt();
        int base = (altura / 2)+1;
        for (int i = 0; i < altura -1; i++) {
            System.out.print("*\n");
        }
        for (int i = 0; i < base; i++) {
            System.out.print("* ");
        }
    }
}







