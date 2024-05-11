package Ejercicio3_Aplicacion;

/*3.	Desarrolla una aplicación que permita simular el juncionamiento de un sistema de login. Para ello crea las siguientes clases

a.	Usuario:
i.	tendrá como características un nombre, correo y contraseña
ii.	tendrá como métodos un mostrarDatos que sacará por consola todos los datos del usuario además de los constructores que consideres necesarios
b.	Sistema:
i.	Tendrá como características una lista de usarios. Esta lista se inicializará en el constructor por defecto
ii.	Tendrá como métodos los siguientes
1.	darAltaUsuario: pedirá por parámetro un usuario y lo meterá dentro de la lista
2.	loginUsuario: retornará un booleano indicando si el usuario está o no dentro de la lista
c.	Entrada: la cual tendrá las siguientes ejecuciones dentro de un método main
i.	Crea una instancia de sistema
ii.	Crea 3 usuarios con los datos que tú quieras (introducidos manualmente)
iii.	Da de alta los usuarios en el sistema
iv.	Muestra los datos de todos los usuarios
v.	Intenta hacer login en el sistema con un correo y contraseña que no esté en el sistema. Se deberá mostrar un mensaje de aviso indicando del resultado
vi.	Intenta hacer login en el sistema con un correo y contraseña que si esté en el sistema. Se deberá mostrar un mensaje de aviso indicando del resultado
*/

import java.util.Scanner;

public class Entrada {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);


        Sistema sistema=new Sistema();

        Usuario usuario1=new Usuario("Edu","edu@gmail.com","Two2");
        Usuario usuario2=new Usuario("Maria","maria@gmail.com","One1");
        Usuario usuario3=new Usuario("Juan","juan@gmail.com","Four4");

        System.out.println("Dar de alta usuarios : ");
        sistema.daraltaUsuario(usuario1);
        sistema.daraltaUsuario(usuario2);
        sistema.daraltaUsuario(usuario3);

        usuario1.mostarDatos();
        usuario2.mostarDatos();
        usuario3.mostarDatos();

        sistema.loginAltaUsuario(usuario1);

        Usuario usuario=new Usuario("Manu","manu@gmail.com","Five5");
        if (sistema.loginAltaUsuario(usuario)){
            System.out.println("El usuario esta en el sistema");
    }else{
            System.out.println("El usuario no esta en el sistema");
        }
}}
