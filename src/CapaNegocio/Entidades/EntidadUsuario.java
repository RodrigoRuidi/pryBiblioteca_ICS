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
public class EntidadUsuario {

    private int codigousu;
    private String nombreusu, contrasena, nombrecompleto, cargo, preguntasec, respuesta;
    private Boolean estado;

    public EntidadUsuario() {

    }

    public EntidadUsuario(int codigousu, String nombreusu, String contrasena, String nombrecompleto, String cargo, String preguntasec, String respuesta, Boolean estado) {
        this.codigousu = codigousu;
        this.nombreusu = nombreusu;
        this.contrasena = contrasena;
        this.nombrecompleto = nombrecompleto;
        this.cargo = cargo;
        this.preguntasec = preguntasec;
        this.respuesta = respuesta;
        this.estado = estado;
    }

    public int getCodigousu() {
        return codigousu;
    }

    public void setCodigousu(int codigousu) {
        this.codigousu = codigousu;
    }

    public String getNombreusu() {
        return nombreusu;
    }

    public void setNombreusu(String nombreusu) {
        this.nombreusu = nombreusu;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getNombrecompleto() {
        return nombrecompleto;
    }

    public void setNombrecompleto(String nombrecompleto) {
        this.nombrecompleto = nombrecompleto;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getPreguntasec() {
        return preguntasec;
    }

    public void setPreguntasec(String preguntasec) {
        this.preguntasec = preguntasec;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

}
