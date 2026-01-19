package com.example.clinica.controladores;

import com.example.clinica.modelos.Paciente;
import com.example.clinica.servicios.ServicioPaciente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/saludapi/v1/pacientes")
public class ControladorPaciente {

    //Inyectando la dependencia al servicio
    @Autowired
    ServicioPaciente servicio;

    //Por cada funcion del servicio
    //se programa una funcion en el controlador
    @PostMapping
    public ResponseEntity<Paciente>guardar(@RequestBody Paciente datos){
        Paciente respuestaDelApi=this.servicio.guardarPaciente(datos);
        return ResponseEntity.status(HttpStatus.OK).body(respuestaDelApi);
    }

}
