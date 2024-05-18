package Ejercicio7_Strings;

import java.util.Scanner;

public class Palabras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce una palabra sin acentos:");

        String palabra = scanner.nextLine();

        //a.	Si su longitud es menor de 4, transformar todas sus letras en mayúsculas

        if (palabra.length() < 4) {

            String upper = palabra.toUpperCase();


            System.out.println("Transformar en mayusculas " + upper);


        }

        //b.	Si su longitud es mayor igual que 4 pero menor que 8, transformar sus letras en minúsculas

        if (palabra.length() >= 4 && palabra.length() < 8) {

            String lower = palabra.toLowerCase();

            System.out.println("Transformar en minusculas " + lower);
        }

        //c.	Si su longitud es mayor igual que 8 pero menor que 11, todas las vocales deberán estar acentuadas

        if (palabra.length() >= 8 && palabra.length() < 11) {
            String replaced = palabra
                    .replace('a', 'á')
                    .replace('e', 'é')
                    .replace('i', 'í')
                    .replace('o', 'ó')
                    .replace('u', 'ú')
                    .replace('A', 'Á')
                    .replace('E', 'É')
                    .replace('I', 'Í')
                    .replace('O', 'Ó')
                    .replace('U', 'Ú');
            System.out.println("Acentos en todas las vocales : " + replaced);

            //d.	Si la longitud es mayor igual a 11 se deberá dar la vuelta a la palabra
        } else if(palabra.length()>=11) {

            String reserse = new StringBuilder(palabra).reverse().toString();

            System.out.println("La palabra al revés : "  +reserse);

        }else
            System.out.println("La longitud de la palabra no cumple con los requisitos.");

        scanner.close();

    }







}






