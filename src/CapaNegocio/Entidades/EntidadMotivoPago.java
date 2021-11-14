/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaNegocio.Entidades;

/**
 *
 * @author Rodrigo Ruidias
 */
public class EntidadMotivoPago {

    private int codigomot;
    private String descripcion;
    private Boolean estado;

    public EntidadMotivoPago() {

    }

    public EntidadMotivoPago(int codigomot, String descripcion, Boolean estado) {
        this.codigomot = codigomot;
        this.descripcion = descripcion;
        this.estado = estado;
    }

    public int getCodigomot() {
        return codigomot;
    }

    public void setCodigomot(int codigomot) {
        this.codigomot = codigomot;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return descripcion;
    }

}
