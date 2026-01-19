package com.example.clinica.modelos;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Medico")
public class Medico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 50, nullable = false)
    private String direccionConsultorio;

    @Column(length = 50, nullable = false)
    private String universidad;

    @Column(length = 50, nullable = false)
    private String nombreCompleto;

    @Column(length = 50, nullable = false)
    private String especialidad;

    @Column(length = 50, nullable = false)
    private String telefono;

    @Column(length = 50, nullable = false)
    private Integer antiguedad;

    @Column(length = 50, nullable = false)
    private String direccion;

    @Column(length = 50, nullable = false)
    private String correoElectronico;

    @OneToOne
    @JoinColumn(name = "tarjeta_profesional_id", referencedColumnName = "id")
    private TarjetaProfesional tarjetaProfesional;

    // Constructores
    public Medico() {
    }

    public Medico(Integer id, String direccionConsultorio, String universidad, String nombreCompleto,
                  String especialidad, String telefono, Integer antiguedad, String direccion,
                  String correoElectronico, TarjetaProfesional tarjetaProfesional) {
        this.id = id;
        this.direccionConsultorio = direccionConsultorio;
        this.universidad = universidad;
        this.nombreCompleto = nombreCompleto;
        this.especialidad = especialidad;
        this.telefono = telefono;
        this.antiguedad = antiguedad;
        this.direccion = direccion;
        this.correoElectronico = correoElectronico;
        this.tarjetaProfesional = tarjetaProfesional;
    }

    // Getters y Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDireccionConsultorio() {
        return direccionConsultorio;
    }

    public void setDireccionConsultorio(String direccionConsultorio) {
        this.direccionConsultorio = direccionConsultorio;
    }

    public String getUniversidad() {
        return universidad;
    }

    public void setUniversidad(String universidad) {
        this.universidad = universidad;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Integer getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(Integer antiguedad) {
        this.antiguedad = antiguedad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public TarjetaProfesional getTarjetaProfesional() {
        return tarjetaProfesional;
    }

    public void setTarjetaProfesional(TarjetaProfesional tarjetaProfesional) {
        this.tarjetaProfesional = tarjetaProfesional;
    }
}
