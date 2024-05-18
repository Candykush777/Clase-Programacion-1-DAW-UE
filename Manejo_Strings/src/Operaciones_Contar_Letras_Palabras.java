import java.util.Scanner;

public class Operaciones_Contar_Letras_Palabras {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        //contar caracteres

        String palabra = "hola Mundo";

        int contarPalabra = palabra.length();

        System.out.println(contarPalabra); // 10 contando espacio

        //contar solo letras
        int contarLetra = 0;

        for (int i = 0; i < palabra.length(); i++) {
            if (Character.isLetter(palabra.charAt(i))) {

                contarLetra++;
            }

        }
        System.out.println(contarLetra); //9 contando solo letras

        String frase = "Quiero aprobar ejercicio DNI en mi examen";//la maner amás rapida es meterlo en un array,
        // sino hay que hacer for, boolean y variables.


        String[] words = frase.trim().split("\\s+"); // lo va hacer de una manera mas robusta
        int contador = words.length;

        System.out.println("Cantidad de palabras (usando \\s+): " + contador);

        // manera mas simple peor solo descuenta esapcios de 1 hueco

        // Dividir usando un solo espacio
        String[] word = frase.split(" ");
        int contador2 = words.length;

        System.out.println("Cantidad de palabras (usando un solo espacio): " + contador2);


        String comas = "uno,dos,tres,cuatro";

        // Dividir usando comas y sacar palabras, luego contador para letras
        String[] parts = comas.split(",");
        for (String part : parts) {
            System.out.println(part);

        }
        int wordCount = parts.length;
        System.out.println("Cantidad de palabras: " + wordCount);

        String str = "uno.dos;tres:cuatro";

        // Dividir usando cualquier carácter no alfanumérico y sacar palabras, luego mcontador para letras
        String[] alfa = str.split("\\W+");
        for (String part : parts) {
            System.out.println(part);
        }
        int wordCount2 = parts.length;
        System.out.println("Cantidad de palabras: " + wordCount2);

        int letterCount = 0;
        for (String part : parts) {
            letterCount += part.length();
        }

        System.out.println("Cantidad de letras: " + letterCount);





    }

    }




