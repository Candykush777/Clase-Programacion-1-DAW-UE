package Tema5;

import java.util.Scanner;

public class Tablero_Ajedrez {
    public static void generarTablero() {

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (i % 2 == 0) {
                    if (j % 2 != 0) {
                        System.out.print(" N ");
                    } else {
                        System.out.print(" B ");
                    }
                } else {
                    if (j % 2 != 0) {

                        System.out.print(" B ");
                    } else {
                        System.out.print(" N ");

                    }
                }

            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        generarTablero();
    }
}

