package CapaNegocio.Entidades;

/**
 *
 * @author Rodrigo Ruidias
 */
public class EntidadAutor {

    private int codigoaut;
    private String nombre, apellidos;
    private Boolean estado;

    public EntidadAutor() {

    }

    public String toString() {
        return nombre + " " + apellidos;
    }

    public EntidadAutor(int codigoaut, String nombre, String apellidos, Boolean estado) {
        this.codigoaut = codigoaut;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.estado = estado;
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

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    

}
