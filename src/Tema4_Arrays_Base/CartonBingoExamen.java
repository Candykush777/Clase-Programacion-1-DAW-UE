package Tema4_Arrays_Base;

/*
Generar un carton de bingo de 10 numeros aleatorios del 1 al 99 , que no se repitan,
sacar los numeros aleatoriamente y decir cuantos aciertos en 30 numeros sacados.

*/

import java.util.Arrays;
import java.util.Scanner;

public class CartonBingoExamen {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int carton[] = new int[10];

        for (int i = 0; i < 10; i++) {
            int aleatorio;
            boolean repetido;

            do {
                aleatorio = (int) (Math.random() * 99) + 1;
                repetido = false;
                for (int j = 0; j < 1; j++) {
                    if (carton[j] == aleatorio) {
                        repetido = true;
                        break;

                    }

                }


            } while (repetido);
            carton[i] = aleatorio;
        }
        System.out.println("Carton es : ");
        System.out.println(Arrays.toString(carton));

        System.out.println("Sacar numeros del bingo : ");
        int[] bingo = new int[99];

        for (int i = 0; i < 30; i++) {
            int numeroAleatorio;
            boolean repetido;
            do {
                numeroAleatorio = (int) (Math.random() * 99) + 1;
                repetido = false;
                for (int j = 0; j < i; j++) {

                    if (bingo[j] == numeroAleatorio)
                        repetido = true;
break;

                }

            } while (repetido);
            bingo[i] = numeroAleatorio;



        }

        System.out.println(Arrays.toString(bingo));
        int aciertos = 0;
        for (int i = 0; i < 30; i++) {
            for (int j = 0; j < 10; j++) {


                if (carton[j] == bingo[i]) ;
                aciertos++;
                break;
            }
        }
        System.out.println("Aciertos en 30 numeros sacados " + aciertos);

    }
}
