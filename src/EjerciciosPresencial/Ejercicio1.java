package EjerciciosPresencial;

import java.util.Scanner;

//Escribe un programa que calcule el volumen de un cono según la fórmula V = (π * r^2 * h)/3
//Nota: para calcular r^2 podemos utilizar Math.pow(r, 2);
public class Ejercicio1 {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);


        System.out.println("Introdece la altura : ");

        double altura;
        altura= scanner.nextDouble();

        System.out.println("Introduce el radio : ");

        double radio= scanner.nextDouble();

        double volumen;
        volumen=(Math.PI *Math.pow(radio,2)*altura)/3;

        System.out.printf("%.2f" ,volumen);

    }


}
