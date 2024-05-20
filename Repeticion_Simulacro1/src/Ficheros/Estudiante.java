package Ficheros;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Estudiante {

    private String nombre;
    private int edad;
    private double nota1,nota2,nota3;

    public Estudiante() {
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", nota1=" + nota1 +
                ", nota2=" + nota2 +
                ", nota3=" + nota3 +
                '}';
    }

    public Estudiante(String nombre, int edad, double nota1, double nota2, double nota3) {
        this.nombre = nombre;
        this.edad = edad;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public static ArrayList<Estudiante> leerEstudiantes(String nombreFichero) throws IOException {

        ArrayList<Estudiante>listaEstudiantes=new ArrayList<>();


        File file=new File(nombreFichero);
        FileReader fileReader=new FileReader(file);
        BufferedReader bufferedReader=new BufferedReader(fileReader);
String linea;
while ((linea = bufferedReader.readLine())!=null){
    String datos[]=linea.split(",");
    Estudiante estudiante=new Estudiante(datos[0],Integer.valueOf(datos[1]),Double.valueOf(datos[2]),Double.valueOf(datos[3]),Double.valueOf(datos[4]));
    listaEstudiantes.add(estudiante);
}



        return listaEstudiantes;
    }

    public static void main(String[] args) {

        try{

            ArrayList<Estudiante>list=leerEstudiantes(("Repeticion_Simulacro1/src/Ficheros/resources/estudiantes.txt"));
for(Estudiante item:list){
    System.out.println(item);
}
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
