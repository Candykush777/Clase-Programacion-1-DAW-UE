package Tema4_Arrays_Base;

import java.util.Arrays;

public class Repaso_Norepetir {

    public static void main(String[] args) {
        int[] numeros = new int[10];
        generarNumerosAleatoriosSinRepetir(numeros);
        System.out.println(Arrays.toString(numeros));
    }

    public static void generarNumerosAleatoriosSinRepetir(int[] numeros) {
        for (int i = 0; i < numeros.length; i++) {
            int aleatorio;
            boolean repetido;
            do {
                aleatorio = (int) (Math.random() * 100) + 1;
                repetido = false;
                // Verificar si el número generado ya existe en el array
                for (int j = 0; j < i; j++) {
                    if (numeros[j] == aleatorio) {
                        repetido = true;
                        break;
                    }
                }
            } while (repetido);
            numeros[i] = aleatorio;
        }
    }
}

