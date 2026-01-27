package com.example.clinica.controladores;

import com.example.clinica.modelos.Paciente;
import com.example.clinica.servicios.ServicioPaciente;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.ExampleObject;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/saludapi/v1/pacientes")
@Tag(name = "Controlador CRUD para los servicios web de pacientes")
public class ControladorPaciente {

    //Inyectando la dependencia al servicio
    @Autowired
    ServicioPaciente servicio;

    //Por cada funcion del servicio
    //se programa una funcion en el controlador
    @PostMapping
    @Operation(summary = "Servicio para registrar un paciente en base de datos")
    @ApiResponses({
        @ApiResponse(responseCode = "200",description = "Paciente creado con exito",
            content = @Content(schema = @Schema(implementation = Paciente.class))
        ),
        @ApiResponse(responseCode = "400",description = "Datos invalidos en la peticion",
            content = @Content(mediaType = "application/json", 
            examples = @ExampleObject(value = """
                    {"mensaje":"revisa los campos ingresados"}
                    """)))
    })
    public ResponseEntity<Paciente>guardar(@RequestBody Paciente datos){
        Paciente respuestaDelApi=this.servicio.guardarPaciente(datos);
        return ResponseEntity.status(HttpStatus.OK).body(respuestaDelApi);
    }

    //llamemos al servicio para activar la busqueda de todos los pacientes
    @GetMapping
    public ResponseEntity<List<Paciente>>buscarTodos(){
         return ResponseEntity.status(HttpStatus.OK).body(this.servicio.buscarTodos());
    }

    //llamemos al servicio para activar la busqueda por ID
    @GetMapping(value = "/{id}")
    public ResponseEntity<Paciente>buscarPorId(@PathVariable Integer id){
        return ResponseEntity.status(HttpStatus.OK).body(this.servicio.buscarPorId(id));
    }
    

}
