package Tema5;

public class Tablero_Ajedrez_Arrays {
    public static void generarTablero() {
        char[][] tablero = new char[8][8];

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (i % 2 == 0) {
                    // Para filas pares
                    tablero[i][j] = (j % 2 != 0) ? 'N' : 'B';
                } else {
                    // Para filas impares
                    tablero[i][j] = (j % 2 != 0) ? 'B' : 'N';
                }
            }
        }

        // Imprimir el tablero
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(" " + tablero[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        generarTablero();
    }
}


