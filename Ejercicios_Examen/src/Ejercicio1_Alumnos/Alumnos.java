package Ejercicio1_Alumnos;

/*1.	Realizar un programa que pida por teclado las 20 notas de todos los alumnos de una clase
y las guarde dentro de una colección. (Puede ser array o arraylist) Al finalizar, imprimir por pantalla los siguientes datos:
a.	La nota más alta obtenida
b.	La nota más baja obtenida
c.	La cantidad de aprobados
d.	La cantidad de suspensos
e.	La nota media
*/

import org.w3c.dom.ls.LSOutput;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Alumnos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] notas = new int[20];

        int opcion;
        int nota = 0;

        do {

            System.out.println("""
                    1.- Introduce 20 notas de los alumnos
                    2.- Imprimir nota mas alta
                    3.- Imprimir la nota mas baja obtenida
                    4.- Imprimir la cantidad de aprobados 
                    5.- Imprimir la cantidad de suspensos
                    6.- Imrpimir la nota media
                    7.- Salir del programa""");

            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:


                    for (int i = 0; i < 20; i++) {
                        System.out.println("Introduce nota  " + (i + 1) + ": ");

                        nota = scanner.nextInt();
                        if (nota > 10 || nota < 0) {
                            System.out.println("nota no valida ");
                            break;

                        } else {
                            notas[i] = nota;

                            System.out.println(Arrays.toString(notas));
                        }
                    }
                    break;

                case 2:
                    Arrays.sort(notas);
                    System.out.println(Arrays.toString(notas));
                    System.out.println(notas[19]);

                    break;

                case 3:
                    Arrays.sort(notas);
                    System.out.println(Arrays.toString(notas));
                    System.out.println(notas[0]);


                    break;

                case 4:
                    int aprobados = 0;
                {
                    for (int i = 0; i < notas.length; i++) {
                        if (notas[i] >= 5) {
                            notas[i] = aprobados;
                            aprobados++;

                        }
                    }System.out.println("Numero aprobados " + aprobados);
                }

                break;



                case 5:

                    int suspensos = 0;
                {
                    for (int i = 0; i < notas.length; i++) {
                        if (notas[i] < 5) {
                            notas[i] = suspensos;
                            suspensos++;

                        }
                    }System.out.println("Numero suspensos " + suspensos);
                }

                    break;

                case 6:

                    int suma=0;

                    for (int i = 0; i < notas.length; i++) {

                        suma+=(notas[i]);

                    }
                    double media=(double)(suma/notas.length);



                    System.out.println("Nota media "+media);
                    break;

                default:
                    System.out.println("Opcion erronea");


            }

        }
        while (opcion != 7);
        System.out.println("Hasta luego ");
    }
}



