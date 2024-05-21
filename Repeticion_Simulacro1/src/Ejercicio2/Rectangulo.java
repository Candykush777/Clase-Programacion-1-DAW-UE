package Ejercicio2;

import java.util.Objects;

public class Rectangulo extends Figura2D{

    private int lBase;

    private int lAltura;


    public Rectangulo() {

    }

    public Rectangulo(String nombre, int lBase, int lAltura) {
        super(nombre);
        this.lBase = lBase;
        this.lAltura = lAltura;
    }

    public int getlBase() {
        return lBase;
    }

    public int getlAltura() {
        return lAltura;
    }

    @Override
    public double calcularPerimetro() {
        return lAltura+lBase;
    }

    @Override
    public String toString() {
        return "Rectangulo{" + "nombre " +super.toString() +
                "lBase=" + lBase +
                ", lAltura=" + lAltura +
                '}';
    }

    @Override
    public void mostrarDatos() {

        System.out.println("Nombre " +getNombre() +" Perimetro : "+calcularPerimetro());;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Rectangulo that)) return false;
        if (!super.equals(o)) return false;
        return lBase == that.lBase && lAltura == that.lAltura;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), lBase, lAltura);
    }
}
