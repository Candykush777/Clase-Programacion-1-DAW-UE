package Tema2;

import java.util.Scanner;

public class Ejercicio1 {   //String almacenar datos que se puedan representar en forma de texto.
    //Es una función principal en Java para ejecutar una clase, como una aplicación de consola.
    //¿Cuál es exactamente el uso de String [] args en Java? - Quora. El propósito es guardar los parámetros de invocación desde la línea de comandos.
    // Y al recorrer el arreglo puedes recuperar esos parámetros y determinar que hacer. Esto solo es posible en el método MAIN de tu aplicación.
    public static void main(String[] args) {
        //nos permite obtener la entrada de datos primitivos.
        Scanner t = new Scanner(System.in);
        //La clase System tiene un miembro dato denominado in que es una instancia de la clase InputStream que representa al teclado
        // o flujo de entrada estándar. Sin embrago, el miembro out de la clase System es un objeto de la clase PrintStream,
        // que imprime texto en la pantalla (la salida estándar).
        String nombre;
        System.out.println("captura nombre");
        //el control no vuelve al método en el que se produjo la excepción, sino que la ejecución del programa continúa en el punto donde se haya capturado.
        nombre=t.nextLine();
        String calle;
        System.out.println("captura calle");
        calle=t.nextLine();
        String CP,ciudad;
        System.out.println("captura CP");
        CP =t.nextLine();
        System.out.println("captura ciudad");
        ciudad =t.nextLine();
        String Pais;
        System.out.println("captura Pais");
        Pais = t.nextLine();
    }


}

