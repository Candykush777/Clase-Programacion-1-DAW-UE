package Tema3_IF;

import java.util.Scanner;

public class Ejercicio6 {
    /*Introducir tres enteros entre -100 y 100. De cumplir los tres números la condición del rango,
se obtendrá la suma de sus inversos (1/número ). En el caso de no estar alguno de los numeros en
el rango se mostrará el mensaje “Alguno de los números no está entre -100 y 100”. No se sumará el
inverso de aquellos valores que sean 0. Por ejemplo, se introducen los enteros 20, -4 y 100, y se
muestra el valor 1/20 + 1/-4 + 1/100 = -0.19000. */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce Numero1");
        double numero1 = scanner.nextDouble();
        System.out.println("Introduce Numero2");
        double numero2 = scanner.nextDouble();
        System.out.println("Introduce Numero3");
        double numero3 = scanner.nextDouble();

        if (numero1 > 100 || numero2 > 100 || numero3 > 100 || numero1 < -100 || numero2 < -100 || numero3 < -100) {

            System.out.println("alguno de los numeros no está en el rango");
        } else {
            ;


            double suma = 1 / numero1 + 1 / numero2 + 1 / numero3;


            System.out.println("La suma del inverso es...");
            System.out.println(1 / numero1 + 1 / numero2 + 1 / numero3);
        }


    }
}
