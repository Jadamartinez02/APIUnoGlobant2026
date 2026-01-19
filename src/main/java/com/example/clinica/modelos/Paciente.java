package com.example.clinica.modelos;

import jakarta.persistence.*;

import java.time.LocalDate;
@Entity
@Table (name="paciente")
public class Paciente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(length = 50, nullable = false)
    private String nombreCompleto;
    @Column(length = 50, nullable = false)
    private Integer documentoIdentidad;
    @Column(length = 50, nullable = false)
    private LocalDate fechaNacimiento;
    @Column(length = 50, nullable = false)
    private String sexo;
    @Column(length = 50, nullable = false)
    private String direccion;
    @Column(length = 50, nullable = false)
    private String telefono;
    @Column(length = 50, nullable = false)
    private String correoElectronico;
    @Column(length = 50, nullable = false)
    private String estadoCivil;
    @Column(length = 50, nullable = false)
    private String ocupacion;

    @OneToOne
    @JoinColumn(name = "historia_clinica_id")
    private HistoriaClinica historiaClinica;


    public Paciente() {
    }

    public Paciente(Integer id, String nombreCompleto, Integer documentoIdentidad, LocalDate fechaNacimiento, String sexo, String direccion, String telefono, String correoElectronico, String estadoCivil, String ocupacion) {
        this.id = id;
        this.nombreCompleto = nombreCompleto;
        this.documentoIdentidad = documentoIdentidad;
        this.fechaNacimiento = fechaNacimiento;
        this.sexo = sexo;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correoElectronico = correoElectronico;
        this.estadoCivil = estadoCivil;
        this.ocupacion = ocupacion;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public Integer getDocumentoIdentidad() {
        return documentoIdentidad;
    }

    public void setDocumentoIdentidad(Integer documentoIdentidad) {
        this.documentoIdentidad = documentoIdentidad;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }
}
