package Tema3_EjemplosScorm;

import java.util.Scanner;

/*
Ponte a prueba 1
Crea un programa para leer por teclado
Tratemos de crear un programa que lea tres datos diferentes por teclado:
•         El número de alumnos de tu clase.
•         Tu nombre completo.
•         La nota media que obtuviste en la ESO.*/
public class Ponteaprueba1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Cuantos alumnos hay en tu clase : ");
        int numeroAlumnos = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nombre completo de el alumno : ");
        String nombreCompleto = scanner.nextLine();
        System.out.print("Nota media alumno : ");
        double notaMedia = scanner.nextDouble();
        System.out.println("\nLos datos finales son : ");
        System.out.println("" +numeroAlumnos);
        System.out.println("" +nombreCompleto);
        System.out.println("" +notaMedia);
    }

}
