package Ejercicio1bis;

import Ejercicio1bis.util.*;

import java.util.Scanner;

public class Formulario {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        int option;

        String nombre = null;
        String apellido = null;
        String dni = null;
        String email = null;
        String ciudad = null;
        String pueblo = null;
        String reversed = null;
        String palabra = null;
        String acentos = null;

        boolean salir = false;

        try {
            do {
                System.out.println("Elige una opcion : ");
                System.out.println();
                System.out.println("1.- Rellenar nombre ");
                System.out.println("2.- Rellenar apellidos ");
                System.out.println("3.- Rellenar DNI ");
                System.out.println("4.- Rellenar email");
                System.out.println("5.- Sacar el nombre con mayusculas");
                System.out.println("6.- Sacar el nombre con minusculas ");
                System.out.println("7.- Darle la vuelta al nombre ");
                System.out.println("8.- Poner acento a tu nombre ");
                System.out.println("9.- Finalizar ");

                option = scanner.nextInt();
                scanner.nextLine(); //Lom uso para consumir el salto de linea, sino da problemas y sale el menu

                switch (option) {

                    case 1:
                        System.out.println("Introduce tu nombre ");

                        nombre = scanner.nextLine();

                        for (char c : nombre.toCharArray()) {
                            if (!Character.isLetter(c)) {

                                throw new SolosePuedenLetrasExcepcion("Error solo letras ");
                            }


                        }


                        break;
                    case 2:

                        System.out.println("Introduce tu apellido ");

                        apellido = scanner.nextLine();

                        for (char c : nombre.toCharArray()) {

                            if (!Character.isLetter(c)) {

                                throw new SolosePuedenLetrasExcepcion("Error solo letras ");
                            }
                        }


                        break;

                    case 3:

                        System.out.println("Introduce tu DNI ");

                        dni = scanner.nextLine();

                        if (dni.length() != 9) {

                            throw new LongitudDNINoValidaException("Error longitud DNI");
                        }

                        char ultimoCaracter = dni.charAt(dni.length() - 1);
                        if (!Character.isLetter(ultimoCaracter)) {

                            throw new TipodeDatoIncorrecto("No es una letra el caracter 9");


                        }
                        for (int i = 0; i < dni.length() - 1; i++) {
                            if (!Character.isDigit(dni.charAt(i))) {

                                throw new NumeracionExcepcionDNI("LA numeración nmo e correcta");
                            }

                        }


                        break;

                    case 4:

                        System.out.println("Introduce tu email : ");

                        email = scanner.nextLine();

                        if (!email.contains("@") || !email.contains(".")) {

                            throw new EmailExcepcion("Email incorrecto ");
                        }


                        break;


                    case 5:

                        System.out.println("Introduce tu ciudad  y la pondremos en M : ");

                        ciudad = scanner.nextLine();

                        ciudad = ciudad.toUpperCase();


                        break;


                    case 6:
                        System.out.println("Introduce pueblo en M y la pondremos en minusculas");


                        pueblo = scanner.nextLine();
                        pueblo = pueblo.toLowerCase();
                        break;


                    case 7:

                        System.out.println("Vamos a darle la vuelta a tu nombre ");

                        palabra = scanner.nextLine();

                        reversed = new StringBuilder(palabra)
                                .reverse().toString();


                        break;

                    case 8:

                        System.out.println("Poner acento a tu nombre : ");

                        acentos = scanner.nextLine();

                        acentos = acentos.replace("a", "á")
                                .replace("e", "é")
                                .replace("i", "í")
                                .replace("o", "ó")
                                .replace("u", "ú");


                        break;


                    case 9:
                        if (nombre == null || apellido == null || dni == null) {

                            System.out.println("Tienes que rellenar los apartados");

                        } else {
                            System.out.println("Estos son los datos del registro : ");
                            System.out.println("El nombre es : " + nombre);
                            System.out.println("Los apellidos son   : " + apellido);
                            System.out.println("El DNI es  : " + dni);
                            System.out.println("Tu ciudad es " + ciudad);
                            System.out.println("Tu pueblo es " + pueblo);
                            System.out.println("El reverso es : " + reversed);
                            System.out.println("Tu nombre con acentos es : " + acentos);

                            salir = true;
                        }

                        break;

                    default:
                        System.out.println("Inserta una opcion valida");
                }


            } while (!salir);


        } catch (SolosePuedenLetrasExcepcion e) {
            System.out.println("Error solo letras ");
        } catch (LongitudDNINoValidaException e) {
            System.out.println("Error longitud DNI");
        } catch (TipodeDatoIncorrecto e) {
            System.out.println("No es una letra el caracter 9");
        } catch (NumeracionExcepcionDNI e) {

            System.out.println("La numeracion no es correcta");
        } catch (EmailExcepcion e) {
            System.out.println("Email incorrecto");

        }


    }
}
