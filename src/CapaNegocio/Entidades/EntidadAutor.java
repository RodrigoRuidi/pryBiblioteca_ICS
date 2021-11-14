package CapaNegocio.Entidades;

/**
 *
 * @author Rodrigo Ruidias
 */
public class EntidadAutor {

    private int codigoaut;
    private String nombre, apellidos;

    public EntidadAutor() {

    }

    public String toString() {
        return nombre + " " + apellidos;
    }

    public EntidadAutor(String nombre, String apellidos) {
        this.codigoaut = 0;
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    public EntidadAutor(int codigoaut, String nombre, String apellidos) {
        this.codigoaut = codigoaut;
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    public int getCodigoaut() {
        return codigoaut;
    }

    public void setCodigoaut(int codigoaut) {
        this.codigoaut = codigoaut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

}
