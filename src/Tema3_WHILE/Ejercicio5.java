package Tema3_WHILE;

import java.util.Scanner;

/*Crea un programa que genere un número aleatorio (entre 0 y 20) de entrada y lo guarde en una variable.
 El sistema irá pidiendo números al usuario hasta que coincida con el aleatorio generado
  (en caso de no coincidir mostrará el mensaje "Lo siento, intentalo de nuevo").
  Cuando coincida el sistema deberá mostar el mensaje
  "Enhorabuena, has acertado el número en 5 intentos" (Adivina)
 */
public class Ejercicio5 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int numero;
            int aleatorio = (int) (Math.random()*21);
            System.out.println(aleatorio);

        }

}
