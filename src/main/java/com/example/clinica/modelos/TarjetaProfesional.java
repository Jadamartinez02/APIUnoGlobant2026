package com.example.clinica.modelos;

import jakarta.persistence.*;

import java.time.LocalDate;
@Entity
@Table(name = "TarjetaProfesional")
public class TarjetaProfesional {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Integer id;
    @Column(length = 50, nullable = false)
   private String numeroTarjeta;
    @Column(length = 50, nullable = false)
   private String nombreTitular;
    @Column(length = 50, nullable = false)
   private LocalDate fechaExpedicion;
    @Column(length = 50, nullable = false)
   private LocalDate fechaVencimiento;
    @Column(length = 50, nullable = false)
   private Integer documentoIdentidad;
    @Column(length = 50, nullable = false)
   private  String profesion;
    @Column(length = 50, nullable = false)
   private  String especialidad;
    @Column(length = 50, nullable = false)
   private  String entidad;
    @Column(length = 50, nullable = false)
   private  Boolean estado;

    @OneToOne(mappedBy = "tarjetaProfesional")
    private Medico medico;



    public TarjetaProfesional() {
    }

    public TarjetaProfesional(Integer id, String numeroTarjeta, String nombreTitular, LocalDate fechaExpedicion, LocalDate fechaVencimiento, Integer documentoIdentidad, String profesion, String especialidad, String entidad, Boolean estado) {
        this.id = id;
        this.numeroTarjeta = numeroTarjeta;
        this.nombreTitular = nombreTitular;
        this.fechaExpedicion = fechaExpedicion;
        this.fechaVencimiento = fechaVencimiento;
        this.documentoIdentidad = documentoIdentidad;
        this.profesion = profesion;
        this.especialidad = especialidad;
        this.entidad = entidad;
        this.estado = estado;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public String getNombreTitular() {
        return nombreTitular;
    }

    public void setNombreTitular(String nombreTitular) {
        this.nombreTitular = nombreTitular;
    }

    public LocalDate getFechaExpedicion() {
        return fechaExpedicion;
    }

    public void setFechaExpedicion(LocalDate fechaExpedicion) {
        this.fechaExpedicion = fechaExpedicion;
    }

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(LocalDate fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public Integer getDocumentoIdentidad() {
        return documentoIdentidad;
    }

    public void setDocumentoIdentidad(Integer documentoIdentidad) {
        this.documentoIdentidad = documentoIdentidad;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getEntidad() {
        return entidad;
    }

    public void setEntidad(String entidad) {
        this.entidad = entidad;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
}
