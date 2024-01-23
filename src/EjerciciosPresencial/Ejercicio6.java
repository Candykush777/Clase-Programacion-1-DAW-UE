package EjerciciosPresencial;

import java.util.Scanner;

/*Escribe un programa que calcule la media de un conjunto de números positivos introducidos por teclado. A
priori, el programa no sabe cuántos números se introducirán. El usuario indicará que ha terminado de
introducir los datos cuando meta un número negativo.*/
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double media = 0;
        double suma = 0;
        double cantidadNumeros = 0;
        System.out.println("Introduce números, cuando quierar parar introduce un número negativo : ");
        while (true) { //hará break cuandop s ecumpla la condición true, introducir un negativo
            int numeros = scanner.nextInt();
            if (numeros < 0) {
                break;
            }
            suma += numeros;
            cantidadNumeros++;
        }
        media = suma / cantidadNumeros;
        System.out.printf("Ma media del conjunto de números %.2f"  , media);
    }
}




