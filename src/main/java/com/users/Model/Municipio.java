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
    private Integer idMunicipio;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "iddeptousuarios")
    private Integer idDepto;

    public Municipio(Integer idMunicipio, String nombre, Integer idDepto) {
        this.idMunicipio = idMunicipio;
        this.nombre = nombre;
        this.idDepto = idDepto;
    }

    public Municipio() {
    }

    public Integer getIdMunicipio() {
        return idMunicipio;
    }

    public void setIdMunicipio(Integer idMunicipio) {
        this.idMunicipio = idMunicipio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getIdDepto() {
        return idDepto;
    }

    public void setIdDepto(Integer idDepto) {
        this.idDepto = idDepto;
    }
}
