package Ejercicio5_CentroMatriculados;

public class Alumno {

    private String nombre;
    private String apellido;
    private double calificacion;
    private String DNI;
    private int nMatricula;

    public Alumno() {
    }

    public Alumno(String nombre, String apellido, double calificacion, String DNI, int nMatricula) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.calificacion = calificacion;
        this.DNI = DNI;
        this.nMatricula = nMatricula;
    }

    public Alumno(String nombre, String apellido, String DNI) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
this.calificacion=0.0;
this.nMatricula=0;
    }

    @Override
    public String toString() {
        return "Alumno " +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", calificacion=" + calificacion +
                ", DNI='" + DNI + '\'' +
                ", nMatricula=" + nMatricula +
                ' ';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public int getnMatricula() {
        return nMatricula;
    }

    public void setnMatricula(int nMatricula) {
        this.nMatricula = nMatricula;
    }
}
