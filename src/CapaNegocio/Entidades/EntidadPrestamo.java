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
public class EntidadPrestamo {

    private int codigopre;
    private Boolean estado, estadomora, estadomulta;
    private String fechapre, dnilector;

    public EntidadPrestamo(){
        
    }

    public EntidadPrestamo(int codigopre, Boolean estado, Boolean estadomora, Boolean estadomulta, String fechapre, String dnilector) {
        this.codigopre = codigopre;
        this.estado = estado;
        this.estadomora = estadomora;
        this.estadomulta = estadomulta;
        this.fechapre = fechapre;
        this.dnilector = dnilector;
    }

    public int getCodigopre() {
        return codigopre;
    }

    public void setCodigopre(int codigopre) {
        this.codigopre = codigopre;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public Boolean getEstadomora() {
        return estadomora;
    }

    public void setEstadomora(Boolean estadomora) {
        this.estadomora = estadomora;
    }

    public Boolean getEstadomulta() {
        return estadomulta;
    }

    public void setEstadomulta(Boolean estadomulta) {
        this.estadomulta = estadomulta;
    }

    public String getFechapre() {
        return fechapre;
    }

    public void setFechapre(String fechapre) {
        this.fechapre = fechapre;
    }

    public String getDnilector() {
        return dnilector;
    }

    public void setDnilector(String dnilector) {
        this.dnilector = dnilector;
    }

    

}
