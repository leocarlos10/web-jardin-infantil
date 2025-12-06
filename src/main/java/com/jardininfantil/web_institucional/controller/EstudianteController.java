package com.jardininfantil.web_institucional.controller;

import com.jardininfantil.web_institucional.dto.common.Response;
import com.jardininfantil.web_institucional.dto.estudiante.EstudianteRequest;
import com.jardininfantil.web_institucional.dto.estudiante.EstudianteResponse;
import com.jardininfantil.web_institucional.service.EstudianteService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/estudiantes")
public class EstudianteController {

    private final EstudianteService estudianteService;

    public EstudianteController(EstudianteService estudianteService) {
        this.estudianteService = estudianteService;
    }

    @PostMapping
    public ResponseEntity<Response<EstudianteResponse>> crearEstudiante(
        @Valid @RequestBody EstudianteRequest request, 
         Authentication authentication
    ) {
        EstudianteResponse estudiante = estudianteService.crearEstudiante(request ,authentication);
        Response<EstudianteResponse> response = Response.<EstudianteResponse>builder()
                .responseCode(HttpStatus.CREATED.value())
                .responseMessage("Estudiante creado exitosamente")
                .data(estudiante)
                .build();
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Response<EstudianteResponse>> obtenerEstudiante(@PathVariable Long id) {
        EstudianteResponse estudiante = estudianteService.obtenerEstudiante(id);
        Response<EstudianteResponse> response = Response.<EstudianteResponse>builder()
                .responseCode(HttpStatus.OK.value())
                .responseMessage("Estudiante encontrado")
                .data(estudiante)
                .build();
        return ResponseEntity.ok(response);
    }

    @GetMapping
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<Response<List<EstudianteResponse>>> listarTodosEstudiantes() {
        List<EstudianteResponse> estudiantes = estudianteService.listarTodosEstudiantes();
        Response<List<EstudianteResponse>> response = Response.<List<EstudianteResponse>>builder()
                .responseCode(HttpStatus.OK.value())
                .responseMessage("Lista de estudiantes obtenida")
                .data(estudiantes)
                .build();
        return ResponseEntity.ok(response);
    }

    @GetMapping("/acudiente/{acudienteId}")
    public ResponseEntity<Response<List<EstudianteResponse>>> listarEstudiantesPorAcudiente(
            @PathVariable Long acudienteId) {
        List<EstudianteResponse> estudiantes = estudianteService.listarEstudiantesPorAcudiente(acudienteId);
        Response<List<EstudianteResponse>> response = Response.<List<EstudianteResponse>>builder()
                .responseCode(HttpStatus.OK.value())
                .responseMessage("Estudiantes del acudiente obtenidos")
                .data(estudiantes)
                .build();
        return ResponseEntity.ok(response);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Response<EstudianteResponse>> actualizarEstudiante(
            @PathVariable Long id,
            @Valid @RequestBody EstudianteRequest request) {
        EstudianteResponse estudiante = estudianteService.actualizarEstudiante(id, request);
        Response<EstudianteResponse> response = Response.<EstudianteResponse>builder()
                .responseCode(HttpStatus.OK.value())
                .responseMessage("Estudiante actualizado exitosamente")
                .data(estudiante)
                .build();
        return ResponseEntity.ok(response);
    }

    @DeleteMapping("/{id}")
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<Response<Void>> eliminarEstudiante(@PathVariable Long id) {
        estudianteService.eliminarEstudiante(id);
        Response<Void> response = Response.<Void>builder()
                .responseCode(HttpStatus.OK.value())
                .responseMessage("Estudiante eliminado exitosamente")
                .build();
        return ResponseEntity.ok(response);
    }
}
