package EjerciciosPresencial;

import java.util.Scanner;

//Realiza un programa que calcule la nota que hace falta sacar en el segundo examen de la asignatura
//Programación para obtener la media deseada. Hay que tener en cuenta que la nota del primer examen
//cuenta el 40% y la del segundo examen un 60%.
public class Ejercicio3 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.printf("La segunda nota es : %.2f" ,calculaNota2());
    }
    public static double calculaNota2() {
        System.out.println("Introduce primera nota : ");
        double nota1 = scanner.nextDouble();
        System.out.println("Introduce la nota media deseada : ");
        double notaFinal= scanner.nextDouble();
        double nota2=(notaFinal-(nota1*0.40))/0.60;
        return nota2;
    }
}

