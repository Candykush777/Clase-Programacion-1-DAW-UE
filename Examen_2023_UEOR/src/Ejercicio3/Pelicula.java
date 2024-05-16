package Ejercicio3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Pelicula {

    private String titulo;
    private String director;
    private double p1, p2, p3;

   static ArrayList<Pelicula>listaPeliculas;

    public Pelicula() {
        this.listaPeliculas=new ArrayList<>();
    }

    public Pelicula(String titulo, String director, double p1, double p2, double p3) {
        this.titulo = titulo;
        this.director = director;
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public double getP1() {
        return p1;
    }

    public void setP1(double p1) {
        this.p1 = p1;
    }

    public double getP2() {
        return p2;
    }

    public void setP2(double p2) {
        this.p2 = p2;
    }

    public double getP3() {
        return p3;
    }

    public void setP3(double p3) {
        this.p3 = p3;
    }

    @Override
    public String toString() {
        return "Pelicula{" +
                "titulo='" + titulo + '\'' +
                ", director='" + director + '\'' +
                ", p1=" + p1 +
                ", p2=" + p2 +
                ", p3=" + p3 +
                '}';
    }

    public double mediaPeliculas() {


        return (p1 + p2 + p3) / 3;
    }

    public void anadirPElicula(Pelicula pelicula){

        listaPeliculas.add(pelicula);

    }public static ArrayList<Pelicula> leerPeliculas(String nombreFichero) throws IOException {
        ArrayList<Pelicula> peliculas = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(nombreFichero))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");
                String titulo = datos[0].trim();
                String director = datos[1].trim();
                double p1 = Double.parseDouble(datos[2].trim());
                double p2 = Double.parseDouble(datos[3].trim());
                double p3 = Double.parseDouble(datos[4].trim());
                Pelicula pelicula = new Pelicula(titulo, director, p1, p2, p3);
                peliculas.add(pelicula);
            }
        }
        return peliculas;
    }

    public static void main(String[] args) {


        Pelicula pelicula=new Pelicula("Sin novedad en el frente","Edward Berger",7.2,5.6,8.3 );
        Pelicula pelicula1=new Pelicula("Los Fabelman","Steven Spielberg",3,6.5,7.8);

        Pelicula.listaPeliculas=new ArrayList<>();
        listaPeliculas.add(pelicula1);

        listaPeliculas.add(pelicula);

        for(Pelicula p :listaPeliculas){

            System.out.println("Titulo : " +p.getTitulo());
            System.out.println("Director : " +p.getDirector());
            System.out.println("Media de puntuacion : " + String.format("%.2f",p.mediaPeliculas()));
            System.out.println();
        }
        try {
            ArrayList<Pelicula> peliculas = leerPeliculas("Examen_2023_UEOR/src/Ejercicio3/resources/peliculas.txt");
            for (Pelicula p : peliculas) {
                System.out.println("Título: " + p.titulo);
                System.out.println("Director: " + p.director);
                System.out.println("Puntuación media: " + String.format("%.2f",p.mediaPeliculas()));
                System.out.println();
            }
        } catch (IOException e) {
            System.out.println("Error: No se pudo leer el archivo de películas.");
            e.printStackTrace();
        }
    }


    }


