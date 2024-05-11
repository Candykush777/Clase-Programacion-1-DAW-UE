package Ejercicio3_Aplicacion;

/*.	Usuario:
i.	tendrá como características un nombre, correo y contraseña
ii.	tendrá como métodos un mostrarDatos que sacará por consola todos
los datos del usuario además de los constructores que consideres necesarios*/

public class Usuario {

    private String nombre;
    private String correo;
    private String contrasenia;

    public Usuario() {
    }

    public Usuario(String nombre, String correo, String contrasenia) {
        this.nombre = nombre;
        this.correo = correo;
        this.contrasenia = contrasenia;
    }

    public void mostarDatos(){

        System.out.println("El nombre es : " +getNombre());
        System.out.println("el correo es : " +getCorreo());
        System.out.println("La contraseña es : " +getContrasenia());
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }
}
