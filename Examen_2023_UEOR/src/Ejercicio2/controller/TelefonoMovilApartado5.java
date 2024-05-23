package Ejercicio2.controller;

import Ejercicio2.model.ProductoApartado2;

public class TelefonoMovilApartado5 extends ProductoApartado2 {

    private String modelo;
    private String marca;
    private int memoria;
    private double descuento;



    public TelefonoMovilApartado5() {
    }

    public TelefonoMovilApartado5(double precio, String modelo, String marca, int memoria, double descuento) {
        super(precio);
        this.modelo = modelo;
        this.marca = marca;
        this.memoria = memoria;
        this.descuento = descuento;
    }

    @Override
    public String toString() {
        return "TelefonoMovilApartado5{" +
                "modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", memoria=" + memoria +
                ", descuento=" + descuento +
                '}';
    }

    @Override
    public double calcularPrecioFinal() {
        double descuentoEnEuros = (getPrecio() * getDescuento()) / 100.0;
        return getPrecio() - descuentoEnEuros;
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



    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }
}
