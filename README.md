# 🏥 Clínica Spring Boot - Insignares Gaviria

Este proyecto es una aplicación desarrollada en **Java + Spring Boot** ☕, diseñada para gestionar información de pacientes, médicos y sus respectivas historias clínicas y tarjetas profesionales.

---

## 📦 Tecnologías Utilizadas

- ✅ Java 17+
- ✅ Spring Boot
- ✅ JPA (Hibernate) 🗃️
- ✅ H2 / MySQL (configurable) 🛢️
- ✅ Maven como gestor de dependencias
- ✅ Jakarta Persistence API
- ✅ IDE recomendado: IntelliJ IDEA o Eclipse

---

## 🗂️ Estructura del Proyecto


---

## 📋 Descripción de las Entidades

### 👨‍⚕️ Medico
- `nombreCompleto`, `especialidad`, `universidad`
- Relación: `@OneToOne` con `TarjetaProfesional`

### 🧾 TarjetaProfesional
- Contiene detalles como: `numeroTarjeta`, `fechaExpedicion`, `entidad`, `estado`
- Relación inversa `@OneToOne` con `Medico`

### 🧑‍💼 Paciente
- Atributos personales: `nombreCompleto`, `documentoIdentidad`, `sexo`, `ocupación`, etc.
- Relación: `@OneToOne` con `HistoriaClinica`

### 📖 HistoriaClinica
- Información médica del paciente: `grupoSanguineo`, `alergias`, `estadoActual`, etc.
- Relación inversa `@OneToOne` con `Paciente`

---

## ▶️ Cómo Ejecutar el Proyecto

1. Clona este repositorio:

```bash
git clone https://github.com/tuusuario/clinica-spring-boot.git
cd clinica-spring-boot
