package Tema2;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {

        int segundosIniciales, segundos, minutos, horas, dias;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce el numero de los segundos: ");
        segundosIniciales = teclado.nextInt();

        minutos = segundosIniciales / 60;
        segundos = segundosIniciales % 60;
        horas = minutos / 60;


    }
}

