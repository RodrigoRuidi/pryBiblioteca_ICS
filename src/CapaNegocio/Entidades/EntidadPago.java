/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaNegocio.Entidades;

import java.util.Date;

/**
 *
 * @author Rodrigo Ruidias
 */
public class EntidadPago {

    private int numeropag, codigomot, codigopre;
    private String fechapag;
    private Double montopag;
    private String descripcion;

    public EntidadPago() {

    }

    public EntidadPago(int numeropag, int codigomot, int codigopre, String fechapag, Double montopag, String descripcion) {
        this.numeropag = numeropag;
        this.codigomot = codigomot;
        this.codigopre = codigopre;
        this.fechapag = fechapag;
        this.montopag = montopag;
        this.descripcion = descripcion;
    }

    public int getNumeropag() {
        return numeropag;
    }

    public void setNumeropag(int numeropag) {
        this.numeropag = numeropag;
    }

    public int getCodigomot() {
        return codigomot;
    }

    public void setCodigomot(int codigomot) {
        this.codigomot = codigomot;
    }

    public int getCodigopre() {
        return codigopre;
    }

    public void setCodigopre(int codigopre) {
        this.codigopre = codigopre;
    }

    public String getFechapag() {
        return fechapag;
    }

    public void setFechapag(String fechapag) {
        this.fechapag = fechapag;
    }

    public Double getMontopag() {
        return montopag;
    }

    public void setMontopag(Double montopag) {
        this.montopag = montopag;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}
