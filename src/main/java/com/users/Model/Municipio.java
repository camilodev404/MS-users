package com.users.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "municipiosusuarios")
public class Municipio {

    @Id
    @Column(name = "idmunicipiousuarios")
    private String idMunicipio;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "iddeptousuarios")
    private String idDepto;

    public Municipio(String idMunicipio, String nombre, String idDepto) {
        this.idMunicipio = idMunicipio;
        this.nombre = nombre;
        this.idDepto = idDepto;
    }

    public Municipio() {
    }

    public String getIdMunicipio() {
        return idMunicipio;
    }

    public void setIdMunicipio(String idMunicipio) {
        this.idMunicipio = idMunicipio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdDepto() {
        return idDepto;
    }

    public void setIdDepto(String idDepto) {
        this.idDepto = idDepto;
    }
}
