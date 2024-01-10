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
            if (array[i] % 2 == 0) {
                array[i]++;
            } else if (array[i] % 2 != 0)
                array[i]--;
        }
        System.out.println(Arrays.toString(array));
        //Duplicar los valores positivos menores que 5
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 5 && array[i] >= 0) {
                array[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(array));
        //Sumar a cada valor un valor entero aleatorio entre -5 y 5.
        for (int i = 0; i < array.length; i++) {

            int numerosaleatorios = (int) (Math.random() * 11) - 5;
            array[i] += numerosaleatorios;
        }
        System.out.println(Arrays.toString(array));
        // Mover los datos una posición hacia la derecha (el primero pasa al segundo, el
        //segundo al tercero, ..., y el último al primero).
        int rotaDrecha = array[array.length - 1];
        for (int i = array.length - 1; i > 0; i--) {
            array[i] = array[i - 1];
        }
        array[0] = rotaDrecha;
        System.out.println(Arrays.toString(array));
        //Intercambiar el primero con el segundo, el tercero con el cuarto, ..., el penúltimo con el último.

        for (int i = 0; i < array.length - 1; i += 2) {
            int intercambios = array[i];
            array[i] = array[i + 1];
            array[i + 1] = intercambios;
        }
        System.out.println(Arrays.toString(array));
        // Invertir el array
        for (int i = 0; i < array.length / 2; i++) {
            int invertir = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = invertir;

        }System.out.println(Arrays.toString(array));
        //Mostrar la posición del primer par y del último impar.
        int primerPar=0;
        int ultimaImpar=0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]%2==0){
                primerPar=i;
                break;
            }


        }
        for (int i = array.length - 1 ; i >=0; i--) {
            if (array[i] %2 !=0) {
                ultimaImpar=i;
                break;

            }

        }System.out.println("Primera posición del número par: " + primerPar);
        System.out.println("Última posición del número impar: " + ultimaImpar);


    }
}

