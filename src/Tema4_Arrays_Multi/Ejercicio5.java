package Tema4_Arrays_Multi;

import java.util.Arrays;
import java.util.Scanner;

/*1. OperacionesArray) Crear un array con 10 posiciones y asígnale números enteros entre 0 y 9,
ambos inclusive (de forma automática). Se mostrarán los datos separados por una coma y un espacio.
 Una vez hecho esto se modificará el array  de la manera indicada en cada apartado, y se mostrará de nuevo.

- Incrementar en 1 los valores pares y en -1 los impares.
- Duplicar los valores positivos menores que 5
- Sumar a cada valor un valor entero aleatorio entre -5 y 5.
- Mover los datos una posición hacia la derecha (el primero pasa al segundo, el
segundo al tercero, ..., y el último al primero).
- Intercambiar el primero con el segundo, el tercero con el cuarto, ..., el penúltimo con el último.
- Invertir el array
- Mostrar la posición del primer par y del último impar.
Hay que hacer todo de golpe, pero opcionalmente se puede hacer un menú que indique cada una de las opciones */
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            int numerosaleatorios = (int) (Math.random() * 10);
            array[i] = numerosaleatorios;
        }
        System.out.println(Arrays.toString(array));
        //Incrementar en 1 los valores pares y en -1 los impares.
        for (int i = 0; i < array.length; i++) {
            if (array[i]%2==0);
            array[i]++;
            System.out.println(Arrays.toString(array));
        }

        }

    }

