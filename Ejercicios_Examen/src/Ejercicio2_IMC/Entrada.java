package Ejercicio2_IMC;

/*2.	Realiza las siguientes acciones dentro de una misma clase:
a.	Una clase llamada Entrada que contenga un método main. Realiza las siguientes acciones dentro de la clase.

i.	Crea las siguientes variables: nombre, apellido, edad, altura, peso, sexo (M/F). Pon el tipo que consideres correcto.

ii.	Pide por consola cada uno de los datos anteriores y guárdalos en las variables.

iii.	Crea una variable llamada IMC

b.	Crea un método estático llamado calculoIMC el cual pida por parámetros el peso (en kg) y la altura (en m).
Este método retornará el valor obtenido en la siguiente fórmula peso
c.	En el método main, iguala el valor de la variable IMC al retorno del método creado en el punto anterior
d.	Imprime por consola un mensaje con el siguiente formato

“Hola Borja tu IMC teniendo en cuenta tu altura de 174cm y tu peso de 68kg, tiene un valor de 19,54
*/

import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        String nombre;
        String apellido;
        int edad;
        double altura;
        double peso;
        String sexo=" ";
        double IMC ;

        System.out.println("Introduce tu nombre : ");
        nombre=scanner.nextLine();
        System.out.println("Introduce tu apellido : ");
        apellido=scanner.nextLine();
        System.out.println("Introduce tu edad : ");
        edad= scanner.nextInt();
        scanner.nextLine();
        System.out.println("Introduce tu altura : ");
        altura=scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Introduce tu peso : ");
        peso=scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Introduce tu sexo M/F");
        sexo=scanner.nextLine();

        System.out.println("Nombre : " +nombre + " \nApellido : " +apellido + " \nEdad : " +edad + " \nAltura : " +altura +" \nPeso : " +peso + " \nSexo : " +sexo);


IMC=calculoIMC(peso,altura);



        System.out.println(" Hola " +nombre + " tu IMC  teniendo en cuenta tu altura " +altura + " Y tu peso de : " +peso  +" Es de : " +IMC);





    }


    public static double calculoIMC(double peso,double altura){

        double IMC =peso/(double)(Math.pow(altura,altura));

return IMC;

    }



}
