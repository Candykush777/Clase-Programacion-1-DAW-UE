package Tema4_Arrays_Multi;

public class PruebasNotion {

    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(String.format("La posición %d tiene asignado el valor %d", i, numeros[i]));
        }
    }
}
