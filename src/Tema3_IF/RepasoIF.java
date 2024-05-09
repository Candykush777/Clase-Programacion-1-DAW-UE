package Tema3_IF;

/*3. Pedir por teclado un entero y guardarlo en una variable llamada a. Comprobar los siguientes casos:
    1. Si es menor que 10 imprimir:
        1. Si es menor que 0 imprimir el mensaje "negativo"
        2. Si es menor que 10 imprimir el mensaje "un dígito"
    2. Si es menor que 99 imprimir el mensaje "dos dígitos"
    3. Si es mayor que 99 imprimir el mensaje "tres dígitos"*/

import java.util.Scanner;

public class RepasoIF {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Introduce un número entero : ");
        int a= scanner.nextInt();

        if (a <0){

            System.out.println("negativo");
        }
        else if (a<10) {
            System.out.println("un digito");

        } else if (a<99) {
            System.out.println("dos digitos");

        }
        else {
            System.out.println("Tres digitos");
        }
    }
}
