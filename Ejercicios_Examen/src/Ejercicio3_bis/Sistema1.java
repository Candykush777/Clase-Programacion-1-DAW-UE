package Ejercicio3_bis;

/*b.	Sistema:
i.	Tendrá como características una lista de usarios. Esta lista se inicializará en el constructor por defecto
ii.	Tendrá como métodos los siguientes
1.	darAltaUsuario: pedirá por parámetro un usuario y lo meterá dentro de la lista
2.	loginUsuario: retornará un booleano indicando si el usuario está o no dentro de la lista*/

import java.util.ArrayList;

public class Sistema1 {

    private ArrayList<Usuario1>listaUsuarios;

    public Sistema1() {
        this.listaUsuarios=new ArrayList<>();
    }

    public void darAltaUsuario(Usuario1 usuario){
        listaUsuarios.add(usuario);

    }
    public void mostrarLista(){

        for(Usuario1 usuario: listaUsuarios ){

            usuario.mostrarDatos();
        }

    }

  public boolean loginUsuario(String correo, String contrasenia){
        for(Usuario1 usuario:listaUsuarios){
            if(usuario.getCorreo().equals(correo)&&usuario.getContrasenia().equals(contrasenia)){

            System.out.println("El usuario está en el sistema");
            return true;
        }}


      System.out.println("El usuario no esta en el sistema");
      return false;
  }}



