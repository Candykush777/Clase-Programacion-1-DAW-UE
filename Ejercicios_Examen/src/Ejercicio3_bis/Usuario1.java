package Ejercicio3_bis;

/*a.	Usuario:
i.	tendrá como características un nombre, correo y contraseña
ii.	tendrá como métodos un mostrarDatos que sacará por consola todos los datos del usuario además de los constructores que consideres necesarios*/

public class Usuario1 {

    private String nombre;
    private String correo;
    private String contrasenia;

    public Usuario1() {
    }

    public Usuario1(String nombre, String correo, String contrasenia) {
        this.nombre = nombre;
        this.correo = correo;
        this.contrasenia = contrasenia;
    }

    public void mostrarDatos(){



        System.out.println("Nombre : " +getNombre());
        System.out.println("Correo : " +getCorreo());
        System.out.println("Contraseña : " +getContrasenia());
    }

    @Override
    public String toString() {
        return "Usuario1{" +
                "nombre='" + nombre + '\'' +
                ", correo='" + correo + '\'' +
                ", contrasenia='" + contrasenia + '\'' +
                '}';
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
