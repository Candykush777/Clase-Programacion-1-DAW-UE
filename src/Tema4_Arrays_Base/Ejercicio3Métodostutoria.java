package Tema4_Arrays_Base;

import java.util.Scanner;

/*3. Escribe un programa que lea 10 números por teclado, los guarde en un array y que luego los muestre:
    - en orden inverso, es decir, el primero que se introduce es el último en mostrarse
    - en orden normal, es decir, el primero que se muestra es el primero que se ha introducido*/
public class Ejercicio3Métodostutoria {


    public static void leerDieznumeros(int[] array, Scanner scanner) {

//no me deja poner la longitud del array [10] como en el ejercicio normal
        //no me pide nada por consola , está igual que el sin metodos
        for (int i = 0; i < 10; i++) {
            System.out.println("Introduce numero  " + (i + 1) + ":");
            array[i] = scanner.nextInt();
            System.out.println("Mostrar contenido del array : ");


//ahora quiero mostra el contenido pero se me fastidia lo demás ....

        }
    }

    public static void mostrarInverso(int[] array, Scanner scanner) {
        for (int i = array.length -1; i >=0; i--) {
            System.out.println("Mostrar contenido del array : ");

        }

    }

    public static void mostrarNormal(int[] array, Scanner scanner) {
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
// tenia que llamar al método desde aquí :-))
        //ahora se me queda en rojo numeros, voy  aver si es por el array[10]
        int[] numeros = new int[10]; //efectivamente , pero antes no me dejaba ponerlo ??
        leerDieznumeros(numeros, scanner);//no entiendo bien lo d enumeros aqui y array arriba , es por valores
        for (int item : numeros) {
            System.out.print(item + " ");}//ya lo he conseguido poniendolo aqui, y me lo imprime, xq ponia array, y arriba hay array y aqui numeros
            mostrarInverso(numeros, scanner);// es que donde he puesto yo numeros ???
        for (int item : numeros) {
            System.out.print(item + " ");}
        }

    }



