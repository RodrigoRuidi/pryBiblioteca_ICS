package CapaNegocio.Entidades;

/**
 *
 * @author Rodrigo Ruidias
 */
public class EntidadAutoria {

    private String isbn;
    private int codigoaut;

    public EntidadAutoria() {

    }

    public EntidadAutoria(String isbn, int codigoaut) {
        this.isbn = isbn;
        this.codigoaut = codigoaut;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getCodigoaut() {
        return codigoaut;
    }

    public void setCodigoaut(int codigoaut) {
        this.codigoaut = codigoaut;
    }

}
