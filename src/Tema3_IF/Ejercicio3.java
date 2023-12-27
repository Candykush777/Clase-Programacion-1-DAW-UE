package Tema3_IF;

public class Ejercicio3 {
    /*3. Léase un número entero. Se comprobará si dicho número es o no múltiplo de 20, y también se comprobará
    si está o no entre -100 y 100. En la salida se mostrará uno de los siguientes menasajes:
    1. “Es múltiplo de 20 y está entre -100 y 100”.
    2. “Es múltiplo de 20 y no está entre -100 y 100”.
    3. “No es múltiplo de 20 y está entre -100 y 100”-
    4. “No es múltiplo de 20 y no está entre -100 y 100”.
    - * Un número es múltiplo de otro cuando su resto es igual a 0 **
    */
    public static void main(String[] args) {
        int numeroentero = 177;

        if ((numeroentero % 20) == 0) {

            if (numeroentero >= -100 && numeroentero <= 100) {
                System.out.println("Es múltiplo  y está en rango");
            } else {
                System.out.println("El múltiplo y no está en el rango");}

        } else {

            if (numeroentero >= -100 && numeroentero <= 100){
                System.out.println("El número no es multiplo y está en el rango");
            } else {
                System.out.println("El número no es múltiplo y no está en el rango");
            }

        }
    }
}
