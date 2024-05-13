package Ejercicio3_bis;

/*/*3.	Desarrolla una aplicación que permita simular el juncionamiento de un sistema de login. Para ello crea las siguientes clases


c.	Entrada: la cual tendrá las siguientes ejecuciones dentro de un método main
i.	Crea una instancia de sistema
ii.	Crea 3 usuarios con los datos que tú quieras (introducidos manualmente)
iii.	Da de alta los usuarios en el sistema
iv.	Muestra los datos de todos los usuarios
v.	Intenta hacer login en el sistema con un correo y contraseña que no esté en el sistema. Se deberá mostrar un mensaje de aviso indicando del resultado
vi.	Intenta hacer login en el sistema con un correo y contraseña que si esté en el sistema. Se deberá mostrar un mensaje de aviso indicando del resultado
*/

public class Entrada1 {


    public static void main(String[] args) {


        Sistema1 sistema = new Sistema1();

        Usuario1 usuario1 = new Usuario1("Juan", "juan@gmail.com", "One1");
        Usuario1 usuario2 = new Usuario1("Edu", "edu@gmail.com", "Two2");
        Usuario1 usuario3 = new Usuario1("Alexa", "alexa@gmail.com", "Four4");

        sistema.darAltaUsuario(usuario2);
        sistema.darAltaUsuario(usuario1);
        sistema.darAltaUsuario(usuario3);


        sistema.mostrarLista();

        Usuario1 usuario4 = new Usuario1("Alicia", "alicia@gmail.com", "Five5");

        sistema.loginUsuario("alicia@gmail.com", "Five5");
        sistema.loginUsuario("alexa@gmail.com", "Four4");
    }

}
