import java.util.Scanner;

public class OtrasOperaciones_Reverse_Acentos {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Dar vuelta a String con reverse, seria igual para una palabra que para una frase.

        String palabra = "Eduardo";

        String reversed = new StringBuilder(palabra).reverse().toString();

        System.out.println("El reverso es : " + reversed);

        //Cambiar una letra por otra

        String replaced = palabra.replace('o', 'X');

        System.out.println("La nueva palabra es " + replaced);

        //Poner acentos a todas las letras, solo deja vocales

        palabra = palabra.replace('E', 'É').replace('u', 'ú')
                .replace('a', 'á').replace('o', 'ó');

        System.out.println("Acentos en todas las vocales " + palabra);

        //comparar Strings

        String str1 = "Hola";
        String str2 = "Hola";
        boolean isEqual = true;



        if (str1.equals(str2)) {

            System.out.println("Son iguales ");
        } else {
            System.out.println("No son iguales");
        }

        //Verificar si un caracter e sun digito

        char c = '5';
        boolean isDigit = true; // Devuelve true

        if (Character.isDigit(c)) {
            System.out.println("Es un digito");
        } else {
            System.out.println("No es un digito");

        }
        String frase = "Hola Eduardo 777";

        // Verificar si cada carácter es un dígito o una letra
        for (char letra : frase.toCharArray()) {
            if (Character.isDigit(letra)) {
                System.out.println("'" + letra + "' es un dígito.");
            } else if (Character.isLetter(letra)) {
                System.out.println("'" + letra + "' es una letra.");
            } else {
                System.out.println("'" + letra + "' no es ni un dígito ni una letra.");
            }
        }

        String str = "";
        boolean isEmpty = str.isEmpty();  // Devuelve true, podriamos hacer lo mismo de antes de if else,
        // este sirve para el DNI

        String Edu = "Hola Eduardo";
        String upper = Edu.toUpperCase();  // Devuelve "HOLA MUNDO"
        String lower = Edu.toLowerCase();  // Devuelve "hola mundo"

        System.out.println("Mayusculas : " +upper);
        System.out.println("minusculas : " +lower);

        String Eduardo = "   Hola Eduardo   ";
        String trimmed = str.trim();  // Devuelve "Hola Eduardo"




    }
}
