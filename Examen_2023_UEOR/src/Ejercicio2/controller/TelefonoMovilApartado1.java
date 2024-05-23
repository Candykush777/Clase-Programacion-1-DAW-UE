package Ejercicio2.controller;

import Ejercicio2.model.ProductoApartado2;

import java.util.ArrayList;
import java.util.Objects;

public class TelefonoMovilApartado1 {

    private String modelo;
    private String marca;
    private int memoria;
    private double precio;
    private double descuento;
    private ArrayList<ProductoApartado2>listaProductos;

    public TelefonoMovilApartado1() {


    }


    public TelefonoMovilApartado1(String modelo, String marca, int memoria, double precio, double descuento) {
        this.modelo = modelo;
        this.marca = marca;
        this.memoria = memoria;
        this.precio = precio;
        this.descuento = descuento;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TelefonoMovilApartado1 that)) return false;
        return memoria == that.memoria && Double.compare(precio, that.precio) == 0 && Double.compare(descuento, that.descuento) == 0 && Objects.equals(modelo, that.modelo) && Objects.equals(marca, that.marca);
    }



    @Override
    public String toString() {
        return "TelefonoMovilApartado1 " +
                "modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", memoria=" + memoria +
                ", precio=" + precio +
                ", descuento=" + descuento +
                ' ';
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }
}
