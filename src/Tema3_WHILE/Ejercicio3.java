package Tema3_WHILE;

public class Ejercicio3 {

    /*Generar números enteros aleatorios entre 0 y 100
hasta obtener el 0. El programa mostrará cada uno de los
datos generadosy obtendrá el mayor de los números generados. (MayorNumero)*/


    public static void main(String[] args) {
        int numeromax = 0;

        int aleatorio;

        do {
            aleatorio = (int) (Math.random() * 101);
            System.out.println(aleatorio);
            if (aleatorio > numeromax) {
                numeromax = aleatorio;
            }


        } while (aleatorio != 0);
        System.out.println("Mayor número aleatorio " + numeromax);

    }
}




