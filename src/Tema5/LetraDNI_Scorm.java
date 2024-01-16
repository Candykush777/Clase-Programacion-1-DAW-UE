package Tema5;

import java.util.Scanner;

/*Calcular la letra del DNI

 - Como sabes, tu DNI incluye una serie de números y una letra al final. Esa letra no es aleatoria;
 hay una fórmula que la calcula. Para ello, se divide el número del DNI entre 23 y, en función del
 resto obtenido (que, lógicamente, estará entre 0 y 22), se asigna la letra correspondiente.
 Las equivalencias entre el resto y la letra las tienes en la siguiente tabla:
 */
public class LetraDNI_Scorm {
    public static char generarLetra(int numeroDNI) {
        char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B',

                'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        int indiceBusqueda=numeroDNI%23;
        return letras[indiceBusqueda];
    }
    public static boolean validarLetra(int numeroDNI, char letra) {
        char letraCalculada = generarLetra(numeroDNI);
        return letra == letraCalculada;}

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el nº de tu DNI : ");
        int dni =scanner.nextInt();
        char tuLetra=generarLetra(dni);
        System.out.println("La letra del DNI es la " +tuLetra);

        System.out.println("Introduce la letra de tu DNI : ");
        char letraUsuario = scanner.next().charAt(0);

        boolean esLetraCorrecta = validarLetra(dni, letraUsuario);

        if (esLetraCorrecta) {
            System.out.println("La letra introducida es correcta.");
        } else {
            System.out.println("La letra introducida no es correcta.");
        }
    }

    }




