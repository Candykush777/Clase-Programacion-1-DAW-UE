package Tema4_Arrays_Multi;

import java.util.Scanner;

/*/*1. OperacionesArray) Crear un array con 10 posiciones y asígnale números enteros entre 0 y 9,
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
public class Ejercicio5Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            int numerosaleatorios = (int) (Math.random() * 10);
            array[i] = numerosaleatorios;
        }
        int option;

        do {
            System.out.println("1. Incrementar en 1 los valores pares y en -1 los impares ");
            System.out.println("2. Duplicar los valores positivos menores que 5 ");
            System.out.println("3. Sumar a cada valor un valor entero aleatorio entre -5 y 5. ");
            System.out.println("4. Mover los datos una posición hacia la derecha");
            System.out.println("5. Intercambiar el primero con el segundo, el tercero con el cuarto, ..., el penúltimo con el último. ");
            System.out.println("6. Invertir el array");
            System.out.println("7. Mostrar la posición del primer par y del último impar");
            System.out.println("8. Salir del programa");

            System.out.println("Elige una opción : ");
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    for (int i = 0; i < array.length; i++) {
                        if (array[i] % 2 == 0) {
                            array[i]++;
                        } else {
                            array[i]--;
                        }
                    }
                    break;

                case 2:
                    for (int i = 0; i < array.length; i++) {
                        if (array[i] < 5 && array[i] >= 0) {
                            array[i] *= 2;
                        }
                    }
                    break;

                case 3:
                    for (int i = 0; i < array.length; i++) {
                        int numerosaleatorios = (int) (Math.random() * 11) - 5;
                        array[i] += numerosaleatorios;
                    }
                    break;

                case 4:
                    int rotaDerecha = array[array.length - 1];
                    for (int i = array.length - 1; i > 0; i--) {
                        array[i] = array[i - 1];
                    }
                    array[0] = rotaDerecha;
                    break;

                case 5:
                    for (int i = 0; i < array.length - 1; i += 2) {
                        int intercambio = array[i];
                        array[i] = array[i + 1];
                        array[i + 1] = intercambio;
                    }
                    break;

                case 6:
                    for (int i = 0; i < array.length / 2; i++) {
                        int invertir = array[i];
                        array[i] = array[array.length - 1 - i];
                        array[array.length - 1 - i] = invertir;
                    }
                    break;

                case 7:
                    int primerPar = 0;
                    int ultimaImpar = 0;

                    for (int i = 0; i < array.length; i++) {
                        if (array[i] % 2 == 0) {
                            primerPar = i;
                            break;
                        }
                    }

                    for (int i = array.length - 1; i >= 0; i--) {
                        if (array[i] % 2 != 0) {
                            ultimaImpar = i;
                            break;
                        }
                    }

                    System.out.println("Posición del primer par: " + primerPar);
                    System.out.println("Posición del último impar: " + ultimaImpar);
                    break;
            }



        } while (option != 8);

        System.out.println("Sayonara Baby");


        scanner.close();
    }
}

