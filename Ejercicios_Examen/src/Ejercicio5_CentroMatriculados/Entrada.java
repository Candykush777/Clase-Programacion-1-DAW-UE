package Ejercicio5_CentroMatriculados;

import java.util.Scanner;

public class Entrada {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        Alumno alumno1 =new Alumno("Eduardo","Afan","52997904Q");
        Alumno alumno2 =new Alumno("Juan","Perez","52996504Q");
        Alumno alumno3 =new Alumno("Maria","Garcia","52007904Q");
        Alumno alumno4 =new Alumno("Alex","Martin","52991204Q");


        Colegio colegio=new Colegio();

        colegio.darAlta(alumno1);
        colegio.darAlta(alumno2);
        colegio.darAlta(alumno3);
        colegio.darAlta(alumno4);

       // System.out.println(alumno1.toString());

        colegio.calificarAlumno(1,8);
        colegio.calificarAlumno(2,7);
        colegio.calificarAlumno(3,5);
        colegio.calificarAlumno(4,4);

        System.out.println("Detalles de los alumnos:");
        for (Alumno alumno : colegio.getListaAlumnos()) {
            System.out.println(alumno.toString());
        }




    }
}
