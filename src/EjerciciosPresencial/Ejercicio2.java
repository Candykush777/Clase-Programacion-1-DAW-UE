package EjerciciosPresencial;

import java.util.Calendar;


public class Ejercicio2 {


    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();
        calendar.get(Calendar.HOUR_OF_DAY);
        int hora = calendar.get(Calendar.HOUR_OF_DAY);

        saludos(hora);
    }


    public static void saludos(int hora) {

        if (hora >= 6 && hora <= 12) {
            System.out.println("Buenos Días");

        } else if (hora >= 13 && hora <= 20) {

            System.out.println("Buenas Tardes");
        } else if (hora >= 21 && hora >= 5) {

            System.out.println("Buenas Noches");
        }

    }

}





