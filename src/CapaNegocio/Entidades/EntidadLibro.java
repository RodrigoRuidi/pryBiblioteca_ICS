package CapaNegocio.Entidades;

/**
 *
 * @author Rodrigo Ruidias
 */
public class EntidadLibro {

    private String isbn, titulo;
    private int fechapub, edicion, codigoedi, codigoare, numejemplar;
    
    public EntidadLibro(){
        
    }

    public EntidadLibro(String isbn, String titulo, int fechapub, int edicion, int codigoedi, int codigoare, int numejemplar) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.fechapub = fechapub;
        this.edicion = edicion;
        this.codigoedi = codigoedi;
        this.codigoare = codigoare;
        this.numejemplar = numejemplar;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getFechapub() {
        return fechapub;
    }

    public void setFechapub(int fechapub) {
        this.fechapub = fechapub;
    }

    public int getEdicion() {
        return edicion;
    }

    public void setEdicion(int edicion) {
        this.edicion = edicion;
    }

    public int getCodigoedi() {
        return codigoedi;
    }

    public void setCodigoedi(int codigoedi) {
        this.codigoedi = codigoedi;
    }

    public int getCodigoare() {
        return codigoare;
    }

    public void setCodigoare(int codigoare) {
        this.codigoare = codigoare;
    }

    public int getNumejemplar() {
        return numejemplar;
    }

    public void setNumejemplar(int numejemplar) {
        this.numejemplar = numejemplar;
    }
    
    @Override
    public String toString(){
        return titulo;
    }

}
