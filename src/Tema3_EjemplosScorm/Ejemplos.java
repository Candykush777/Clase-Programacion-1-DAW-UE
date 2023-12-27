package Tema3_EjemplosScorm;

import java.util.Scanner;

public class Ejemplos {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer desde el celadon
        Scanner teclado = new Scanner(System.in);

        // Leer el número de alumnos de la clase
        System.out.print("Ingrese el número de alumnos de tu clase: ");
        int numeroAlumnos = teclado.nextInt();

        // Limpiar el buffer de la entrada para evitar problemas con nextLine()
        teclado.nextLine();

        // Leer tu nombre completo
        System.out.print("Ingrese tu nombre completo: ");
        String nombreCompleto = teclado.nextLine();

        // Leer la nota media en la ESO
        System.out.print("Ingrese tu nota media en la ESO: ");
        float notaMediaESO = teclado.nextFloat();

        // Cerrar el Scanner para liberar recursos
        teclado.close();

        // Mostrar los datos ingresados
        System.out.println("\nDatos ingresados:");
        System.out.println("Número de alumnos: " + numeroAlumnos);
        System.out.println("Nombre completo: " + nombreCompleto);
        System.out.println("Nota media en la ESO: " + notaMediaESO);
    }
}
