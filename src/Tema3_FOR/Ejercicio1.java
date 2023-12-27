package Tema3_FOR;

import java.util.Scanner;

public class Ejercicio1 {
    /*Se leerá el número de temperaturas a introducir (de ser 0 o negativo se establecerá a 10).
 Obténgase la media con dos decimales de las temperaturas inroducidas por consola. (TemperaturasIntroducidas)
 Meter 10 temperaturas, luego que te haga la media , a las 10 que termine el bucle for
 */
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Cuantas temperaturas vas a meter");
            int nTemperaturas = scanner.nextInt();
            double sumatorio = 0.0;
            for (int i = 0; i < nTemperaturas; i++) {
                System.out.println("Por favor introduce la temperatura");
                int temperatura = scanner.nextInt();
                if (temperatura<1){
                    temperatura = 10;
                }
                sumatorio +=temperatura;
            }
            System.out.printf("La media de las temperaturas es de %.2f",sumatorio/nTemperaturas);

        }

}
