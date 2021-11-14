package CapaNegocio.Entidades;

/**
 *
 * @author Rodrigo Ruidias
 */
public class EntidadArea {

    private int codigoare;
    private String nombre;
    private Boolean vigencia;

    public EntidadArea() {

    }

    public EntidadArea(int codigoare, String nombre, Boolean vigencia) {
        this.codigoare = codigoare;
        this.nombre = nombre;
        this.vigencia = vigencia;
    }

    public int getCodigoare() {
        return codigoare;
    }

    public void setCodigoare(int codigoare) {
        this.codigoare = codigoare;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Boolean getVigencia() {
        return vigencia;
    }

    public void setVigencia(Boolean vigencia) {
        this.vigencia = vigencia;
    }

    @Override
    public String toString() {
        return nombre;
    }

}
