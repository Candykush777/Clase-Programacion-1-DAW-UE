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
public class Alumno {

    private String nombre;
    private int nota;

    public Alumno() {
    }

    public Alumno(String nombre, int nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }
}
