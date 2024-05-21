package Ejercicio2;

import java.util.Objects;

public class Circulo extends Figura2D{


    private double radio;

    public Circulo() {
    }

    public Circulo(String nombre, int radio) {
        super(nombre);
        this.radio = radio;
    }

    public Circulo(String nombre,double perimetro) {

        super(nombre);
        perimetro=calcularPerimetro();
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    @Override
    public double calcularPerimetro() {


        return 2*Math.PI*radio ;
    }

    @Override
    public void mostrarDatos(){

        System.out.println("Nombre " +getNombre() +" Perimetro : "+calcularPerimetro());

    }

    @Override
    public String toString() {
        return "Circulo{" + "nombre " +super.toString()+
                "radio=" + radio +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Circulo circulo)) return false;
        if (!super.equals(o)) return false;
        return Double.compare(radio, circulo.radio) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), radio);
    }
}

