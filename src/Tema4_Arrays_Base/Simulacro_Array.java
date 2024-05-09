package Tema4_Arrays_Base;

import java.util.Arrays;
import java.util.Scanner;

/*
2.	Crea un programa que realice las siguientes acciones:

a.	Pida al usuario 5 números entre el 1 y el 10 (1)
b.	Cree un array de 5 números aleatorios entre el 1 y el 10 que no sean repetidos (1.5)
c.	Muestra por consola la cantidad de aciertos que ha obtenido el usuario (1)

*/
public class Simulacro_Array {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arraynumeros = new int[5];


        for (int i = 0; i < 5; i++) {


            System.out.println("Introduce  " + (i + 1) + ": ");
            int numeros = scanner.nextInt();

            arraynumeros[i] = numeros;
            System.out.println("Resultado del array");
            System.out.println(Arrays.toString(arraynumeros));

        }
        //ahora queremos que no se repita
        System.out.println("-------------------------------");
        System.out.println();
        int[] array = new int[5];
        for (int i = 0; i < 5; i++) {
            int aleatorio;
            boolean repetido;
            do {

                aleatorio = (int) (Math.random() * 10) + 1;
                repetido = false;


                for (int j = 0; j < i; j++) {

                    if (array[j] == aleatorio)
                        repetido = true;
                    break;
                }
            } while (repetido);
            array[i] = aleatorio;
        }
        System.out.println("Resultado del array aleatorio");
        System.out.println(Arrays.toString(array));
        //cantidad de aciertos

        int aciertos =0;
        for (int i = 0; i < 5; i++) {
            if(array[i]==arraynumeros[i]){
                aciertos++;
            }

        }
        System.out.println("Cantidad de aciertos : " +aciertos);
    }
}
