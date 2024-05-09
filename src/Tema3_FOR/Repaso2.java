package Tema3_FOR;

import java.util.Scanner;

/*Generar 100 números aleatorios entre 1 y 1000
 ambos incluisve, mostrar cada número generado y contabilizar cuántos de ellos son pares.
*/
public class Repaso2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int par = 0;

        for (int i = 0; i < 100; i++) {
            int numeros = (int) (Math.random() * 1000) + 1;
            System.out.println("Muestra todos los numero : " + numeros);
            if (numeros % 2 == 0) {
                par++;
            }


        }
        System.out.println("La suma de los numeros pares es : " + par);
    }
}
