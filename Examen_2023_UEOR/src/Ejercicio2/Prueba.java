package Ejercicio2;

import java.util.ArrayList;

public class Prueba {

    public static void main(String[] args) {


        TelefonoMovilApartado1 telefono1 = new TelefonoMovilApartado1("510", "Nokia", 128, 350, 20);
        TelefonoMovilApartado1 telefono2 = new TelefonoMovilApartado1("C7", "Samsung", 258, 450, 10);
        TelefonoMovilApartado1 telefono3 = new TelefonoMovilApartado1("I3", "Apple", 128, 700, 30);

        System.out.println(telefono1.toString());
        System.out.println(telefono2.toString());
        System.out.println(telefono3.toString());
        ArrayList<ProductoApartado2> productos = new ArrayList<>();
        productos.add(new TelefonoMovilApartado5(500, "iPhone 12", "Apple", 128, 10));
        productos.add(new TelefonoMovilApartado5(300, "Galaxy S20", "Samsung", 256, 5));


        boolean soniguales = (telefono1.equals(telefono2) && telefono2.equals(telefono3) && telefono3.equals(telefono1));

        if (soniguales) {

            System.out.println("Los teléfonos son iguales");
        } else {

            System.out.println("Los teléfonos no son iguales ");
        }

        for (ProductoApartado2 producto: productos){

            System.out.println(producto.toString());
            System.out.println("Precio final " +producto.calcularPrecioFinal());

        }




        }

    }

