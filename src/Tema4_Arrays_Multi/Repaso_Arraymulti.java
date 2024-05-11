package Tema4_Arrays_Multi;

/* Rellenar con numeros aleatorios un array multi de 3x3 de manera aleatoria,
 sin que se repitan los numeros del 1 al 20 */

import java.util.Arrays;
import java.util.Scanner;

public class Repaso_Arraymulti {

    public static void main(String[] args) {
        Scanner Scanner =new Scanner(System.in);

        int [][] arraymulti=new int[3][3];
        int aleatorio;
        boolean [] numerosUtilizados=new boolean[21];//rastrear
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

            do {
                aleatorio = (int) (Math.random() * 20) + 1;
            }while (numerosUtilizados[aleatorio]);
            arraymulti[i][j]=aleatorio;
            numerosUtilizados[aleatorio]=true;
            }

        }
        for (int[] fila : arraymulti) {
            System.out.println(Arrays.toString(fila));
        }
    }
}
