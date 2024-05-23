package Ejercicio1;

import java.util.Scanner;

public class Formulario {


    public static void main(String[] args) throws TipoDatoIncorrectoException {

        Scanner scanner = new Scanner(System.in);
        String nombre = "";
        String apellido = "";
        String dni = "";
        String email = "";

        boolean salir = false;
        int option;

        try {
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

                        for (char c : nombre.toCharArray()) {

                            if (!Character.isLetter(c)) {


                                throw new TipoDatoIncorrectoException("Error solo letras ");

                            }
                        }

                        break;
                    case 2:

                        System.out.println("Rellena tus apellidos : ");

                        apellido = scanner.nextLine();
                        for(char c :nombre.toCharArray()){




                        if (!Character.isLetter(c)) {


                            throw new TipoDatoIncorrectoException("Error solo letras ");

                        }}


                        break;
                    case 3:

                        System.out.println("Rellena tu DNI : ");

                        dni = scanner.nextLine();



                        if (dni.length()!= 9) {

                            throw new LongitudDNINoValidaException("Error longitud");
                        }

                        char ultimoCaracter = dni.charAt(dni.length() - 1);
                        if (!Character.isLetter(ultimoCaracter)) {
                            throw new TipoDatoIncorrectoException("Error: el último carácter debe ser una letra");
                        }for (int i = 0; i < dni.length() - 1; i++) {
                        if (!Character.isDigit(dni.charAt(i))) {
                            throw new NumeracionContieneLetrasException("Error: los primeros 8 caracteres deben ser dígitos");
                        }
                    }


                        break;
                    case 4:

                        System.out.println("Rellena tu email : ");

                        email = scanner.nextLine();

                        String cadena = "correo@example.com";

                        if (!email.contains("@") || !email.contains(".")) {
                            throw new EmailIncorrectoException("Error: La cadena debe contener '@' y '.'");
                        }



                        break;
                    case 5:

                        if (nombre.isEmpty() || apellido.isEmpty() || dni.isEmpty() || email.isEmpty()) {

                            System.out.println("Rellena todos los campos para poder continuar ");

                        }else {
                            System.out.println("Nombre : " + nombre);
                            System.out.println("Apellido : " + apellido);
                            System.out.println("DNI " + dni);
                            System.out.println("Email : " + email);
                            salir = true;

                        }

                        break;
                    default:
                        System.out.println("Inserta una opcion válida");


                }
            } while (!salir);




        } catch (TipoDatoIncorrectoException e) {
            System.out.println("Error solo letras");
        } catch (LongitudDNINoValidaException e) {
            System.out.println("Error tamaño no valido");
            ;
        }catch (NumeracionContieneLetrasException e){
            System.out.println("Error: los primeros 8 caracteres deben ser dígitos");
        }catch (EmailIncorrectoException e){
            System.out.println("Error: La cadena debe contener '@' y '.'");
        }
    }
}




