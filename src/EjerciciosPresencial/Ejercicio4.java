package EjerciciosPresencial;
import java.util.Scanner;
/*Implementa el juego piedra, papel y tijera. Primero, el usuario 1 introduce su jugada y luego el usuario 2. Si
alguno de los usuarios introduce una opción incorrecta, el programa deberá mostrar un mensaje de error.*/
public class Ejercicio4 {
    static String jugador1 = " ";
    static String jugador2 = " ";
    static public String[] jugadas = new String[]{"Piedra", "Papel", "Tijera"};
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Introducir jugada Jugador1 : ");
        jugador1 = scanner.next();
        System.out.println("Introducir jugada Jugador2 : ");
        jugador2 = scanner.next();
        normas();
        empate();
        juego();
    }
    public static void normas() {
        if (!jugador1.equalsIgnoreCase("Piedra") && !jugador1.equalsIgnoreCase("Papel")
                && !jugador1.equalsIgnoreCase("Tijera")) {
            System.out.println("Error de juego, introduce la pàlabra correctamente");
        }
    }
    public static void empate() {
        if (jugador1.equalsIgnoreCase("Piedra") && jugador2.equalsIgnoreCase("Piedra")
                && jugador1.equalsIgnoreCase("Tijera") && jugador2.equalsIgnoreCase
                ("Tijera") && jugador1.equalsIgnoreCase("Papel") && jugador2.equalsIgnoreCase("Papel")){
            System.out.println("----------------------");
        System.out.println("El resultado es empate");}

    }
    public static void juego() {
        if ((jugador1.equalsIgnoreCase("Piedra") && jugador2.equalsIgnoreCase("Papel")) ||
                (jugador1.equalsIgnoreCase("Tijera") && jugador2.equalsIgnoreCase("Piedra")) ||
                (jugador1.equalsIgnoreCase("Papel") && jugador2.equalsIgnoreCase("Tijera"))) {
            System.out.println("Gana jugador 2");
        } else if ((jugador1.equalsIgnoreCase("Papel") && jugador2.equalsIgnoreCase("Piedra")) ||
                (jugador1.equalsIgnoreCase("Piedra") && jugador2.equalsIgnoreCase("Tijera")) ||
                (jugador1.equalsIgnoreCase("Tijera") && jugador2.equalsIgnoreCase("Papel"))) {
            System.out.println("Gana jugador 1");
        }
    }
}



    
