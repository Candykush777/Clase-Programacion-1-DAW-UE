package Tema4_Arrays_Multi;

import java.util.Collections;
import java.util.Scanner;

/*4. (PosicionesArray) Crea una aplicación que:
    - pida por teclado la longitud de un array
    - cree el array de enteros de la longitud introducida
    - pida al usuario que introduzca todos los datos del array
    - mueva una posición todos los elementos. el elemento de la posición 0 pasa a la posición 1 y
    así sucesivamente. El elemento que está en la última posición pasa a la primera
    - realizar la tarea anterior pero al contrario. El elemento que está en la
    primera posición pasa a la última y así sucesivamente*/
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca longitud del array : ");
        int[] array = new int[scanner.nextInt()];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Introduzca datos del array : " + (i + 1) + " ");
            array[i] = scanner.nextInt();
        }
        //Mostrar el array para ver que está bien
        System.out.println("El contenido del array es :");
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            System.out.print(" " + array[i]);

        }
        System.out.println();
        System.out.println("-----------");
        //array rota derecha
        int auxUltimoElemento = array[array.length - 1];
        for (int i = array.length - 1; i > 0; i--) {
            array[i] = array[i - 1];
        }
        array[0] = auxUltimoElemento;
        System.out.println("El contenido del array después de rotar derecha : ");
        System.out.println();
        for (int elemento : array) {
            System.out.print(elemento + " ");
        }
        System.out.println();
        //rotar a la izquierda
        int auxPrimerelemento = array[0];
        for (int i = 0; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }
        array[array.length - 1]=auxPrimerelemento;
        System.out.println("El contenido del array despues de rotar izquierda : ");
        System.out.println();
        for (int elemento : array){
            System.out.print(elemento + " ");
        }
    }
}
