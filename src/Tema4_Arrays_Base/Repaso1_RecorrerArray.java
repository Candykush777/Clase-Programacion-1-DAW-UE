package Tema4_Arrays_Base;

import java.util.Arrays;

public class Repaso1_RecorrerArray {

    public static void main(String[] args) {
        int[] numeros = new int[10];
        int aleatorio;
        for (int i = 0; i < numeros.length; i++) {

            aleatorio = (int) (Math.random() * 100) + 1;
            numeros[i]=aleatorio;

        }

            System.out.println(Arrays.toString(numeros));

    }
}
