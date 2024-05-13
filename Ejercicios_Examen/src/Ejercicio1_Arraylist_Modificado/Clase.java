package Ejercicio1_Arraylist_Modificado;

import java.util.ArrayList;

public class Clase {

    private ArrayList<Alumno> listaClase;

    public Clase() {
        this.listaClase = new ArrayList<>();
    }

    public void anadirAlumnos(Alumno alumno) {
        listaClase.add(alumno);
    }

    public void mostrarDatosClase() {

        for (Alumno alumno : listaClase) {
            System.out.println("Nombre : " + alumno.getNombre() + " , Nota : " + alumno.getNota());
        }

    }

    public String notaMasAlta() {

        int notaMasalta = Integer.MIN_VALUE;
        String nombre = "";

        for (Alumno alumno : listaClase) {
            if (alumno.getNota() > notaMasalta) {
                notaMasalta = alumno.getNota();
                nombre = alumno.getNombre();
            }
        }
        return "Nombre : " + nombre + ", Nota : " + notaMasalta;

    }

    public int notaMAsBaja() {


        int notaMasBaja = Integer.MAX_VALUE;

        for (Alumno alumno : listaClase) {
            if (alumno.getNota() < notaMasBaja) {
                notaMasBaja = alumno.getNota();
            }
        }

        return notaMasBaja;
    }

    public int cantidadAprobados() {


        int aprobados = 0;
        for (Alumno alumno : listaClase) {
            if (alumno.getNota() >= 5) {

                aprobados++;
            }
        }
        return aprobados;


    }

    public int cantidadSuspensos() {


        int suspensos = 0;
        for (Alumno alumnos : listaClase) {
            if (alumnos.getNota() < 5) {

                suspensos++;
            }
        }

        return suspensos;
    }

    public double media() {


        int suma = 0;
        for (Alumno alumno : listaClase) {
            suma += alumno.getNota();

        }


        return (double) suma / listaClase.size();
    }


    public ArrayList<Alumno> getListaClase() {
        return listaClase;
    }

    public void setListaClase(ArrayList<Alumno> listaClase) {
        this.listaClase = listaClase;
    }
}
