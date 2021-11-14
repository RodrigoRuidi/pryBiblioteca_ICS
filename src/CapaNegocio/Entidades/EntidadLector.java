package CapaNegocio.Entidades;

import java.util.Date;

/**
 *
 * @author Rodrigo Ruidias
 */
public class EntidadLector {

    private String dnilector, nombre, apellidos, telefono, direccion, sexo;
    private Date fechanac;
    private Boolean vigencia;

    public EntidadLector() {

    }

    public EntidadLector(String dnilector, String nombre, String apellidos, String telefono, String direccion, String sexo, Date fechanac, Boolean vigencia) {
        this.dnilector = dnilector;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.direccion = direccion;
        this.sexo = sexo;
        this.fechanac = fechanac;
        this.vigencia = vigencia;
    }

    public String getDnilector() {
        return dnilector;
    }

    public void setDnilector(String dnilector) {
        this.dnilector = dnilector;
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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Date getFechanac() {
        return fechanac;
    }

    public void setFechanac(Date fechanac) {
        this.fechanac = fechanac;
    }

    public Boolean getVigencia() {
        return vigencia;
    }

    public void setVigencia(Boolean vigencia) {
        this.vigencia = vigencia;
    }
    
    public String toString() {
        return nombre + " " + apellidos;
    }

}
