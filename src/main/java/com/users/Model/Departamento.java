package com.users.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "departamentosusuarios")
public class Departamento {

    @Id
    @Column(name = "iddeptousuarios")
    private Integer idDepto;

    @Column(name = "nombre")
    private String nombre;

    public Departamento() {
    }

    public Departamento(Integer idDepto, String nombre) {
        this.idDepto = idDepto;
        this.nombre = nombre;
    }

    public Integer getIdDepto() {
        return idDepto;
    }

    public void setIdDepto(Integer idDepto) {
        this.idDepto = idDepto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
