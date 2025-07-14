package EjercicioDNI_final;

import EjercicioDNI_final.util.SoloLetrasExcepcion;
import EjercicioDNI_final.util.TamanoIncorrectoExcepcion;
import EjercicioDNI_final.util.UltimoCaracterException;

import java.util.Scanner;

public class Formulario_dni {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String nombre=null;
        String apellidos=null;
        String dni=null;
        String email=null;


        int option;
        boolean salir=false;

        do {

            System.out.println("Elige una opcion del menu : ");
            System.out.println("1.- Rellenar nombre ");
            System.out.println("2.- Rellenar apellidos ");
            System.out.println("3.- Rellenar DNI ");
            System.out.println("4.- Rellenar email ");
            System.out.println("5.- Finalizar ");


            option= scanner.nextInt();
            scanner.nextLine(); // consumir linea

            switch (option){


                case 1:

                    System.out.println("Rellena tu nombre ");

                    nombre= scanner.nextLine();










                break;


                case 2 :
                    System.out.println("Rellena tu apellido ");







                    break;

                case 3:


                    System.out.println("Rellena tu DNI ");

                    dni= scanner.nextLine();














                    break;

                case 4:
                    System.out.println("Rellena tu email ");

                    email= scanner.nextLine();
                    break;


                case 5:
                    if(nombre == null || apellidos == null || dni == null || email == null ){

                        System.out.println("Te falta algún campo por rellenar");
                    }else {

                        System.out.println("Nombre : " +nombre);
                        System.out.println("Nombre : " +nombre);
                        System.out.println("Nombre : " +nombre);
                        System.out.println("Nombre : " +nombre);

                        salir=true;

                    }





                    break;


                default:
                    System.out.println("Eleción incorrecta ");

            }

        }while(!salir);



}
    }
