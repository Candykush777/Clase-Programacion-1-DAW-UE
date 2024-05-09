package Tema4_Arrays_Base;

/*2.	Crea un programa que realice las siguientes acciones:

a.	Pida al usuario 5 letras entre la a y la z
b.	Cree un array de 5 letras aleatorios entre la a y la z que no sean repetidos (1.5)
c.	Muestra por consola la cantidad de aciertos que ha obtenido el usuario (1)

 */

import java.util.Arrays;
import java.util.Scanner;

public class Simulcaro_Array_Letras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[] letras = new char[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Introduce letras " + (i + 1) + ": ");
            char letra = scanner.nextLine().charAt(0);
            letras[i] = letra;
        }

        System.out.println(Arrays.toString(letras));

        System.out.println("--------------");

        char[] letras2 = new char[5];

        for (int i = 0; i < 5; i++) {
            int aleatorio;
            boolean repetido;
            do {
                aleatorio = (int) (Math.random() * 26);//abecedario 26 letras , sin ANSI
                repetido = false;


                for (int j = 0; j < i; j++) {

                    if (letras2[j] == (char) ('a' + aleatorio)) {
                        repetido = true;
                        break;
                    }
                }}
                while (repetido) ;
                letras2[i] = (char) ('a' + aleatorio);
            char letraAleatoria=(char)('a' + aleatorio);
            letras2[i]=letraAleatoria;

        }

        System.out.println(Arrays.toString(letras2));
        int acierto=0;

        for (int i = 0; i < 5; i++) {
            if(letras[i]==letras2[i]){

                acierto++;
            }

        }
        System.out.println("Cantidad de aciertos : " +acierto);
    }
}
