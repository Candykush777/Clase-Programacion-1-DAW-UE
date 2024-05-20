package EjercicioDNI_OtraManera;

import EjercicioDNI_OtraManera.Util.*;

import java.util.Scanner;

public class Formulario_Do_While_Swich {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nombre = null;
        String apellidos = null;
        String dni = null;
        String email = null;
        boolean salir = false;

        do {
            System.out.println("Menú:");
            System.out.println("1. Rellenar nombre.");
            System.out.println("2. Rellenar apellidos.");
            System.out.println("3. Rellenar DNI.");
            System.out.println("4. Rellenar e-mail.");
            System.out.println("5. Finalizar.");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            try {
                switch (opcion) {
                    case 1:
                        System.out.print("Ingrese nombre: ");
                        nombre = scanner.nextLine();
                        validarSoloLetras(nombre);
                        break;
                    case 2:
                        System.out.print("Ingrese apellidos: ");
                        apellidos = scanner.nextLine();
                        validarSoloLetras(apellidos);
                        break;
                    case 3:
                        System.out.print("Ingrese DNI: ");
                        dni = scanner.nextLine();
                        validarDNI(dni);
                        break;
                    case 4:
                        System.out.print("Ingrese e-mail: ");
                        email = scanner.nextLine();
                        validarEmail(email);
                        break;
                    case 5:
                        if (nombre == null || apellidos == null || dni == null || email == null) {
                            System.out.println("Faltan datos por rellenar.");
                        } else {
                            System.out.println("Resumen:");
                            System.out.println("Nombre: " + nombre);
                            System.out.println("Apellidos: " + apellidos);
                            System.out.println("DNI: " + dni);
                            System.out.println("E-mail: " + email);
                            salir = true; // Termina el ciclo
                        }
                        break;
                    default:
                        System.out.println("Opción no válida. Intente nuevamente.");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        } while (!salir);
    }

    public static void validarSoloLetras(String input) throws TipoDatoIncorrectoException {
        for (char c : input.toCharArray()) {
            if (!Character.isLetter(c)) {
                throw new TipoDatoIncorrectoException("El campo solo puede contener letras.");
            }
        }
    }

    public static void validarDNI(String dni) throws LongitudDNINoValidaException, UltimoDigitoNoLetraException, NumeracionContieneLetrasException {
        if (dni.length() != 9) {
            throw new LongitudDNINoValidaException("La longitud del DNI debe ser de 9 caracteres.");
        }
        char ultimoCaracter = dni.charAt(dni.length() - 1);
        if (!Character.isLetter(ultimoCaracter)) {
            throw new UltimoDigitoNoLetraException("El último carácter del DNI debe ser una letra.");
        }
        String numeros = dni.substring(0, 8);
        for (char c : numeros.toCharArray()) {
            if (!Character.isDigit(c)) {
                throw new NumeracionContieneLetrasException("Los primeros 8 caracteres del DNI deben ser números.");
            }
        }
    }

    public static void validarEmail(String email) throws EmailIncorrectoException {
        if (!email.contains("@") || !email.contains(".")) {
            throw new EmailIncorrectoException("El e-mail debe contener un '@' y un '.'");
        }
    }
}

