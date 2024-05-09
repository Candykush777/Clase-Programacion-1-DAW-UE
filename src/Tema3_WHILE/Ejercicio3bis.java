package Tema3_WHILE;
/*  /*Generar números enteros aleatorios entre 0 y 100
hasta obtener el 0. El programa mostrará cada uno de los
datos generadosy obtendrá el mayor de los números generados. (MayorNumero)*/

import java.util.Scanner;

public class Ejercicio3bis {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int numeroMaximo=0;
        int numeroAleatorio;
        do {
             numeroAleatorio=(int)(Math.random()*101);
            System.out.println(numeroAleatorio);
            if (numeroAleatorio>numeroMaximo){
                numeroMaximo=numeroAleatorio;

            }
        }while (numeroAleatorio !=0);
        System.out.println("El numero maximo es : " +numeroMaximo);

    }

}
