package Ejercicio2.controller;

import Ejercicio2.model.ProductoApartado2;

public class TelefonoMovilApartado2 extends ProductoApartado2 {

    private String modelo;
    private String marca;
    private int memoria;
    private double descuento;

    public TelefonoMovilApartado2() {
    }

    @Override
    public double calcularPrecioFinal() {
        return 0;
    }


    public TelefonoMovilApartado2(double precio, String modelo, String marca, int memoria, double descuento) {
        super(precio);
        this.modelo = modelo;
        this.marca = marca;
        this.memoria = memoria;
        this.descuento = descuento;
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
