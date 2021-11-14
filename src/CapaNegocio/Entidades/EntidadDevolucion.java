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
public class EntidadDevolucion {
    
    private int codigodev, codigopre;
    private String fechadev;
    private Boolean estadopag;
    private Double  montopag;
    
    public EntidadDevolucion(){
        
    }

    public EntidadDevolucion(int codigodev, int codigopre, String fechadev, Boolean estadopag, Double montopag) {
        this.codigodev = codigodev;
        this.codigopre = codigopre;
        this.fechadev = fechadev;
        this.estadopag = estadopag;
        this.montopag = montopag;
    }

    public int getCodigodev() {
        return codigodev;
    }

    public void setCodigodev(int codigodev) {
        this.codigodev = codigodev;
    }

    public int getCodigopre() {
        return codigopre;
    }

    public void setCodigopre(int codigopre) {
        this.codigopre = codigopre;
    }

    public String getFechadev() {
        return fechadev;
    }

    public void setFechadev(String fechadev) {
        this.fechadev = fechadev;
    }

    public Boolean getEstadopag() {
        return estadopag;
    }

    public void setEstadopag(Boolean estadopag) {
        this.estadopag = estadopag;
    }

    public Double getMontopag() {
        return montopag;
    }

    public void setMontopag(Double montopag) {
        this.montopag = montopag;
    }
    
    
    
}
