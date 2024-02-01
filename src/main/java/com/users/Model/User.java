package com.users.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(name = "usuarios")
public class User {

    @Id
    @Column(name = "cedula")
    private String cedula;

    @Column(name = "tipodocumento")
    private String tipoDocumento;

    @Column(name = "correo")
    private String correo;

    @Column(name = "passw")
    private String password;

    @Column(name = "fechaexpe")
    private Date fechaExpe;

    @Column(name = "primernombre")
    private String primerNombre;

    @Column(name = "segundonombre")
    private String segundoNombre;

    @Column(name = "primerapellido")
    private String primerApellido;

    @Column(name = "segundoapellido")
    private String segundoApellido;

    @Column(name = "fechanacimi")
    private Date fechaNacimiento;

    @Column(name = "deptonacimi")
    private String deptoNacimi;

    @Column(name = "municipionacimi")
    private String municipioNacimi;

    @Column(name = "sexo")
    private String sexo;

    @Column(name = "mujercampesina")
    private Boolean mujerCampesina;

    @Column(name = "orientacionsex")
    private String orientacionSex;

    @Column(name = "reconocimiento")
    private String reconocimiento;

    @Column(name = "puebloindigena")
    private String puebloIndigena;

    @Column(name = "pueblorrom")
    private String puebloRrom;

    @Column(name = "tienelimitaciones")
    private Boolean tieneLimitaciones;

    @Column(name = "direccion")
    private String direccion;

    @Column(name = "idmunicipiousuarios")
    private Integer idMunicipio;

    @Column(name = "vereda")
    private String vereda;

    @Column(name = "corregimiento")
    private String corregimiento;

    @Column(name = "telefono")
    private String telefono;

    @Column(name = "estadocivil")
    private String estadoCivil;

    @Column(name = "cabezahogar")
    private Boolean cabezaHogar;

    @Column(name = "viveesposa")
    private Boolean viveEsposa;

    @Column(name = "viveconesposa")
    private Boolean viveConEsposa;

    @Column(name = "seseparo")
    private Boolean seSeparo;

    @Column(name = "cuentaconsociedad")
    private Boolean cuentaConSociedad;

    @Column(name = "conflictos")
    private String conflictos;

    @Column(name = "limitaciones")
    private String limitaciones;

    @Column(name = "ocupaciones")
    private String ocupaciones;

    public User() {
    }

    public User(String cedula, String tipoDocumento, String correo, String password, String primerNombre, String primerApellido) {
        this.cedula = cedula;
        this.tipoDocumento = tipoDocumento;
        this.correo = correo;
        this.password = password;
        this.primerNombre = primerNombre;
        this.primerApellido = primerApellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getFechaExpe() {
        return fechaExpe;
    }

    public void setFechaExpe(Date fechaExpe) {
        this.fechaExpe = fechaExpe;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getSegundoNombre() {
        return segundoNombre;
    }

    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getDeptoNacimi() {
        return deptoNacimi;
    }

    public void setDeptoNacimi(String deptoNacimi) {
        this.deptoNacimi = deptoNacimi;
    }

    public String getMunicipioNacimi() {
        return municipioNacimi;
    }

    public void setMunicipioNacimi(String municipioNacimi) {
        this.municipioNacimi = municipioNacimi;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Boolean getMujerCampesina() {
        return mujerCampesina;
    }

    public void setMujerCampesina(Boolean mujerCampesina) {
        this.mujerCampesina = mujerCampesina;
    }

    public String getOrientacionSex() {
        return orientacionSex;
    }

    public void setOrientacionSex(String orientacionSex) {
        this.orientacionSex = orientacionSex;
    }

    public String getReconocimiento() {
        return reconocimiento;
    }

    public void setReconocimiento(String reconocimiento) {
        this.reconocimiento = reconocimiento;
    }

    public String getPuebloIndigena() {
        return puebloIndigena;
    }

    public void setPuebloIndigena(String puebloIndigena) {
        this.puebloIndigena = puebloIndigena;
    }

    public String getPuebloRrom() {
        return puebloRrom;
    }

    public void setPuebloRrom(String puebloRrom) {
        this.puebloRrom = puebloRrom;
    }

    public Boolean getTieneLimitaciones() {
        return tieneLimitaciones;
    }

    public void setTieneLimitaciones(Boolean tieneLimitaciones) {
        this.tieneLimitaciones = tieneLimitaciones;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Integer getIdMunicipio() {
        return idMunicipio;
    }

    public void setIdMunicipio(Integer idMunicipio) {
        this.idMunicipio = idMunicipio;
    }

    public String getVereda() {
        return vereda;
    }

    public void setVereda(String vereda) {
        this.vereda = vereda;
    }

    public String getCorregimiento() {
        return corregimiento;
    }

    public void setCorregimiento(String corregimiento) {
        this.corregimiento = corregimiento;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public Boolean getCabezaHogar() {
        return cabezaHogar;
    }

    public void setCabezaHogar(Boolean cabezaHogar) {
        this.cabezaHogar = cabezaHogar;
    }

    public Boolean getViveEsposa() {
        return viveEsposa;
    }

    public void setViveEsposa(Boolean viveEsposa) {
        this.viveEsposa = viveEsposa;
    }

    public Boolean getViveConEsposa() {
        return viveConEsposa;
    }

    public void setViveConEsposa(Boolean viveConEsposa) {
        this.viveConEsposa = viveConEsposa;
    }

    public Boolean getSeSeparo() {
        return seSeparo;
    }

    public void setSeSeparo(Boolean seSeparo) {
        this.seSeparo = seSeparo;
    }

    public Boolean getCuentaConSociedad() {
        return cuentaConSociedad;
    }

    public void setCuentaConSociedad(Boolean cuentaConSociedad) {
        this.cuentaConSociedad = cuentaConSociedad;
    }

    public String getConflictos() {
        return conflictos;
    }

    public void setConflictos(String conflictos) {
        this.conflictos = conflictos;
    }

    public String getLimitaciones() {
        return limitaciones;
    }

    public void setLimitaciones(String limitaciones) {
        this.limitaciones = limitaciones;
    }

    public String getOcupaciones() {
        return ocupaciones;
    }

    public void setOcupaciones(String ocupaciones) {
        this.ocupaciones = ocupaciones;
    }
}
