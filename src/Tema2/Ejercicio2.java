package Tema2;

import java.util.Scanner;

public class Ejercicio2 {public static void main(String[] args) {
    //Ejercicio 2. Hágase un programa que lea 5 variables enteras y haga lo siguiente:
    //a) Las muestre en una línea separadas por un espacio.
    //b) Rote los valores hacia la izquierda (la primera variable tome el valor de la segunda; la segunda,
    // la de la tercera; la tercera, la de la cuarta; la cuarta, la de la quinta; y la quinta, la de la primera.
    //c) Se muestren de nuevo el valor de las cinco variables de la misma forma que en el apartado a).
    Scanner n = new Scanner(System.in);
    //int es para numeros enteros, con decimales seria double
    System.out.println("numero1");
    int numero1 = n.nextInt();
    System.out.println("numero2");
    int numero2 = n.nextInt();
    System.out.println("numero3");
    int numero3 = n.nextInt();
    System.out.println("numero4");
    int numero4 = n.nextInt();
    System.out.println("numero5");
    int numero5 = n.nextInt();
    // a)
    System.out.println(numero1+" "+numero2+" "+numero3+" "+numero4+" "+numero5);
    //b)
    //1 2 3 4 5
    //2 3 4 5 1
    int aux = numero1;
    numero1=numero2;
    numero2=numero3;
    numero3=numero4;
    numero4=numero5;
    numero5=aux;
    System.out.println(numero1+" "+numero2+" "+numero3+" "+numero4+" "+numero5);
    //c)
    //1 2 3 4 5
    //2 3 4 5 1
    //1 2 3 4 5 (que movida)
    aux = numero5;
    numero5=numero4;
    numero4=numero3;
    numero3=numero2;
    numero2=numero1;
    numero1=aux;


    System.out.println(numero1+" "+numero2+" "+numero3+" "+numero4+" "+numero5);




}
}

