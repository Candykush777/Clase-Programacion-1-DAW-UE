package Ejercicio1_Arraylist_Modificado;

/*1.	Realizar un programa que pida por teclado las 5 notas co sus 5 nombres de todos los alumnos de una clase
y las guarde dentro de una colección. Crea la clase alumno con nombre y nota, la clase clase para meterlos dentro de la lista de clase
(arraylist) Al finalizar, imprimir por pantalla los siguientes datos:

a.	La nota más alta obtenida
b.	La nota más baja obtenida
c.	La cantidad de aprobados
d.	La cantidad de suspensos
e.	La nota media
*/

import java.util.Scanner;

public class Entrada {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        Clase clase=new Clase();

        for (int i = 0; i < 5; i++) {

            System.out.println("Ingrese el nombre del alumno " +(i+1) + " : ");

            String nombre= scanner.nextLine();


            System.out.println("Ingrese la nota del alumno " +(i+1) + " : ");

            int nota= scanner.nextInt();
            scanner.nextLine();

            clase.anadirAlumnos(new Alumno(nombre,nota));



        }
        System.out.println("\nLos alumnos de clase y sus notas : ");
        clase.mostrarDatosClase();
        System.out.println("\nLa nota mas alta : " +clase.notaMasAlta());

        System.out.println("\nLa nota mas baja : " +clase.notaMAsBaja());

        System.out.println("\nCantidad de aprobados : " +clase.cantidadAprobados());

        System.out.println("\nCantidad de suspensos : " +clase.cantidadSuspensos());

        System.out.println("\nLa nota media es : " +clase.media());


    }
}
