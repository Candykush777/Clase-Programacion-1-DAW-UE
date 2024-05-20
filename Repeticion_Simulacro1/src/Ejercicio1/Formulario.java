package Ejercicio1;

import java.util.Scanner;

public class Formulario {


    public static void main(String[] args) throws TipoDatoIncorrectoException {

        Scanner scanner = new Scanner(System.in);
        String nombre = "";
        String apellido = "";
        String dni = "";
        String email = "";


        int option;

try{
        do {
            System.out.println("Ingresa una opción : ");
            System.out.println();

            System.out.println("""
                    1.- Rellenar Nombre 
                    2.- Rellenar apellidos
                    3.- Rellenar DNI
                    4.- Rellenar email
                    5.- Finalizar""");

            option = scanner.nextInt();
            scanner.nextLine();


            switch (option) {

                case 1:

                    System.out.println("Rellena tu nombre : ");

                    nombre = scanner.nextLine();

                    if (!Character.isLetter(Integer.parseInt(nombre))) {


                       throw new TipoDatoIncorrectoException("Error solo letras ");

                    }


                    break;
                case 2:

                    System.out.println("Rellena tus apellidos : ");

                    apellido = scanner.nextLine();

                    if (!Character.isLetter(Integer.parseInt(nombre))) {


                         throw new TipoDatoIncorrectoException("Error solo letras ");

                    }


                    break;
                case 3:

                    System.out.println("Rellena tu DNI : ");

                    dni = scanner.nextLine();

                    if (dni.length() - 1 != 9) {

                        throw new LongitudDNINoValidaException("Error longitud");
                    }


                    break;
                case 4:

                    System.out.println("Rellena tu email : ");

                    email = scanner.nextLine();

                    break;
                case 5:

                   /* if (nombre.isEmpty()|| apellido.isEmpty()|| dni.isEmpty() || email.isEmpty()){

                        System.out.println("Rellena todos los campos para poder continuar ");
                    }*/

                    break;
                default:
                    System.out.println("Inserta una opcion válida");


            }
        } while (option != 5);
        if (nombre.isEmpty() || apellido.isEmpty() || dni.isEmpty() || email.isEmpty()) {

            System.out.println("Rellena todos los campos para poder continuar ");
            return;
        }
    System.out.println("Nombre : " +nombre);
    System.out.println("Apellido : " +apellido);
    System.out.println("DNI " +dni);
    System.out.println("Email : " +email);


    } catch (TipoDatoIncorrectoException e) {
    System.out.println("Error solo letras");
} catch (LongitudDNINoValidaException e) {
    System.out.println("Error tamaño no valido");;
}
    }}




