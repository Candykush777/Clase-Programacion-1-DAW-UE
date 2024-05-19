package Ejercicio5_CentroMatriculados;

import java.util.ArrayList;

public class Colegio {

    private ArrayList<Alumno>listaAlumnos;
    private int contadorMatriculas;

    public Colegio() {
        this.listaAlumnos = new ArrayList<>();
    }

    public void listarAlumnos(Alumno alumno){

        listaAlumnos.add(alumno);
    }

    public void darAlta(Alumno alumno) {


       alumno.setnMatricula(contadorMatriculas++);
       listaAlumnos.add(alumno);
        System.out.println("Alumno añadido correctamente ");


    }

    public void calificarAlumno(int nMatricula,double calificacion){



       for (Alumno alumno : listaAlumnos){

           if (alumno.getnMatricula() ==nMatricula){
               alumno.setCalificacion(calificacion);
               System.out.println("Alumno calificado correctamente ");




    }}}

    public ArrayList<Alumno> getListaAlumnos() {
        return listaAlumnos;
    }

    public void setListaAlumnos(ArrayList<Alumno> listaAlumnos) {
        this.listaAlumnos = listaAlumnos;
    }

    public int getContadorMatriculas() {
        return contadorMatriculas;
    }

    public void setContadorMatriculas(int contadorMatriculas) {
        this.contadorMatriculas = contadorMatriculas;
    }
}
