package EjerciciosPresencial;
import java.util.Scanner;
/*Realiza un programa que pinte la letra L por pantalla hecha con asteriscos. El programa pedirá la altura. El
palo horizontal de la L tendrá una longitud de la mitad (división entera entre 2) de la altura más uno.*/
public class Ejercicio5 { //me complico demasiado,me ha llevado mucho tiempo con arays, el ejercicio 5 bis es el bueno...
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Introduce altura  : ");
        int altura= scanner.nextInt();
        int base=altura/2+1;//hay que poner +1 xq sino cuenta el 1er * de la altura y da 1 menos ¡¡
char[][]array=new char[altura][base];
// espacios en blanco, sino se hace esto sale un simbolom raro
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {
                array[i][j] = ' ';
            }}
//Rellenar altura
        for (int i = 0; i < altura - 1; i++) {
            array[i][0] = '*';
        }
        // Rellenar base
        for (int j = 0; j < base; j++) {
            array[altura - 1][j] = '*';
        }
        // Mostrar la letra L
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }}












