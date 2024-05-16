package Ejercicio2;

import java.util.ArrayList;

public abstract class ProductoApartado2  {

    private double precio;



    public ProductoApartado2() {

    }



    public ProductoApartado2(double precio) {
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public abstract double calcularPrecioFinal();
}
