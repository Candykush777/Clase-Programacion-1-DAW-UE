package Tema4_Arrays_Base;

/* 2. Crear un programa que genere 30 números aleatorios entre 0 - 10 y los
guarde en un array. Una vez metidos, se deberá mostrar:
    - Numero de puntos obtenidos
    - Media de puntos obtenidos*/
public class Ejercicio2 {

    public static void main(String[] args) {
        int[] array = new int[30];
        double media = 0.0;
        int suma = 0;
        for (int i = 0; i < array.length; i++) {

            array[i] = (int) (Math.random() * 11);

            suma += array[i];

        }
        for (int item : array) {
            System.out.printf(item + " ");
        }
        System.out.println("\nSuma de los elementos: " + suma);
        System.out.printf("\nMedia de los elementos %.2f", (double) suma / array.length);

    }


}
