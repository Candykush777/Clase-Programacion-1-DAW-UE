package Tema3_WHILE;

import java.util.Scanner;

public class Dowhileimprimemenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        int contador = 0;
        int opcion = 0;
        do {
            System.out.println("Las opciones disponibles son:");
            System.out.println("1- Opcion 1");
            System.out.println("1- Opcion 2");
            System.out.println("1- Opcion 3");
            System.out.println("1- Opcion 4");
            System.out.println("5- Salir ");
            System.out.println("Que opción quieres hacer");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Seleciona la opcion 1 ");
                    break;
                case 2:
                    System.out.println("Seleciona la opcion 2 ");
                    break;
                case 3:
                    System.out.println("Seleciona la opcion 3 ");
                    break;
                case 4:
                    System.out.println("Seleciona la opcion 4 ");
                    break;

            }

        } while (opcion != 5);
        System.out.println("Terminando la ejecución");
    }
}
