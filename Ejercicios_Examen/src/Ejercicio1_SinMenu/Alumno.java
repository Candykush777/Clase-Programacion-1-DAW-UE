package Ejercicio1_SinMenu;

import java.util.Arrays;
import java.util.Scanner;

/*1.	Realizar un programa que pida por teclado las 20 notas de todos los alumnos de una clase
y las guarde dentro de una colección. (Puede ser array o arraylist) Al finalizar, imprimir por pantalla los siguientes datos:
a.	La nota más alta obtenida
b.	La nota más baja obtenida
c.	La cantidad de aprobados
d.	La cantidad de suspensos
e.	La nota media
*/
public class Alumno {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] notas = new int[20];


        for (int i = 0; i < 20; i++) {

            System.out.println("Introduce 20 notas de los alumnos  " + (i + 1) + " : ");
            int nota = scanner.nextInt();
            scanner.nextLine();


            if (nota > 10 || nota < 0) {
                System.out.println("Introduce una nota correcta en el rango 0-10 incluidos");
                break;
            } else {
                notas[i] = nota;
            }
        }
        System.out.println("\nLas notas son : ");
        System.out.println();
        System.out.println(Arrays.toString(notas));
        System.out.println();
        System.out.println("-----------------------------");
        System.out.println();
        Arrays.sort(notas);
        System.out.println(Arrays.toString(notas));
        System.out.println();
        System.out.println("Nota mas alta obtenida : " + notas[19]);
        System.out.println("Nota mas baja obtenida : " + notas[0]);

        int aprobados = 0;
        int suspensos = 0;

        for (int i = 0; i < 20; i++) {
            if (notas[i] >= 5) {
                notas[i] = aprobados;


                aprobados++;

            } else {
                suspensos++;
            }


        }
        System.out.println("\nCantidad de aprobados : " + aprobados);
        System.out.println("\nCantidad de suspensos : " + suspensos);

//Nota media
        int suma = 0;
        double media = 0.0;
        for (int i = 0; i < notas.length; i++) {

            suma += notas[i];

            media = (double) suma / notas.length;

        }

        System.out.println("\nLa media es : " + media);

    }
}
