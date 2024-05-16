package Ejercicio1;

import java.util.Scanner;

public class Formulario {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String dni = "";
        String nombre = "";
        String apellidos = "";


        int option;
        System.out.println("Introduce una opcion");
        System.out.println();

        try {
            do {
                System.out.println("""
                        1.- Rellenar Nombre
                        2.- Rellenar apellidos
                        3.- Rellenar DNI
                        4.- Finalizar""");


                option = scanner.nextInt();
                scanner.nextLine();
                switch (option) {

                    case 1:
                        System.out.println("Rellena tu nombre : ");

                        nombre = scanner.nextLine();

                        break;
                    case 2:
                        System.out.println("Rellena tus apellidos : ");
                        apellidos = scanner.nextLine();
                        break;


                    case 3:
                        System.out.println("Rellena tu DNI : ");

                        dni = scanner.nextLine();
                        if (dni.length() != 9) {
                            throw new LongitudDNINoValidadException("Error tamaño ");

                        }
                        if (!Character.isLetter(dni.charAt(dni.length() - 1))) {
                            throw new UltimoDigitoNoLetraException("Error último dígito");
                        }


                        break;
                    case 4:

                        if (nombre.isEmpty() || apellidos.isEmpty() || dni.isEmpty()) {

                            System.out.println("Tienes que rellenar todos los datos ");


                            option = 1;
                        } else
                            break;
                    default:
                        System.out.println("Opcion no valida");
                }


            } while (option != 4);
            {
                System.out.println("Hasta luego");
            }
            System.out.println("Resumen datos introducidos : ");
            System.out.println("-------------------------");
            System.out.println("\nNombre : " + nombre);
            System.out.println("\nApellidos : " + apellidos);
            System.out.println("\nDNI : " + dni);


        } catch (LongitudDNINoValidadException e) {
            System.out.println(e.getMessage());

        } catch (UltimoDigitoNoLetraException e) {
            System.out.println(e.getMessage());

        }
    }
}
