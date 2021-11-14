package CapaNegocio.Entidades;

/**
 * 
 * @author Rodrigo Ruidias
 */
public class EntidadEditorial {

    private int codigoedi;
    private String nombre;
    private Boolean vigencia;
    
    public EntidadEditorial(){
        
    }

    public EntidadEditorial(int codigoedi, String nombre, Boolean vigencia) {
        this.codigoedi = codigoedi;
        this.nombre = nombre;
        this.vigencia = vigencia;
    }

    public int getCodigoedi() {
        return codigoedi;
    }

    public void setCodigoedi(int codigoedi) {
        this.codigoedi = codigoedi;
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
    public String toString(){
        return nombre;
    }
    
}
