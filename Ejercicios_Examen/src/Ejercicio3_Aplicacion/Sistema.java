package Ejercicio3_Aplicacion;
/*Sistema:
i.	Tendrá como características una lista de usarios. Esta lista se inicializará en el constructor por defecto
ii.	Tendrá como métodos los siguientes
1.	darAltaUsuario: pedirá por parámetro un usuario y lo meterá dentro de la lista
2.	loginUsuario: retornará un booleano indicando si el usuario está o no dentro de la lista*/

import java.util.ArrayList;
import java.util.Scanner;

public class Sistema {
    Scanner scanner = new Scanner(System.in);
    private ArrayList<Usuario> listaUsuarios;

    public Sistema() {
        this.listaUsuarios = new ArrayList<>();
    }

    public void daraltaUsuario(Usuario usuario) {
        listaUsuarios.add(usuario);

    }

    public boolean loginAltaUsuario(Usuario usuario) {
        boolean encontrado = false;

        for (Usuario item : listaUsuarios) {


            if (item.getCorreo().equals(usuario.getCorreo()) && item.getContrasenia().equals(usuario.getContrasenia())) {

                encontrado = true;

                break;
            }
        }
        return encontrado;
    }
}












