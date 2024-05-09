package Tema3_WHILE;

/*Generar números aleatorios entre 0 y 1000 hasta obtener un cero (momento en el cual el programa terminará),
y contabilizar cuántos de ellos son pares. Al final del programa se mostrará cuantos pares se han obtenido*/
public class Repaso1 {

    public static void main(String[] args) {

        int pares = 0;
        int aleatorio;

        do {
            aleatorio = (int) (Math.random() * 1001);

            if (aleatorio % 2 == 0) {
                System.out.println(aleatorio);
                pares++;


            }
        } while (aleatorio != 0);
        System.out.println("Los numeros pares son " + pares);
    }
}
