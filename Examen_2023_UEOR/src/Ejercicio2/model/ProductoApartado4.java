package Ejercicio2.model;

public abstract class ProductoApartado4 implements Descuento {

    private double precio;

    public ProductoApartado4() {
    }

   public abstract double calcularPreciofinal();

    public ProductoApartado4(double precio) {
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
