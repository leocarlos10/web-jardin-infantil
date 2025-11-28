package com.jardininfantil.web_institucional.controller;

import com.jardininfantil.web_institucional.dto.common.Response;
import com.jardininfantil.web_institucional.dto.pago.PagoRequest;
import com.jardininfantil.web_institucional.dto.pago.PagoResponse;
import com.jardininfantil.web_institucional.service.PagoService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/pagos")
public class PagoController {

    private final PagoService pagoService;

    public PagoController(PagoService pagoService) {
        this.pagoService = pagoService;
    }

    @PostMapping
    public ResponseEntity<Response<PagoResponse>> registrarPago(@Valid @RequestBody PagoRequest request) {
        PagoResponse pago = pagoService.registrarPago(request);
        Response<PagoResponse> response = Response.<PagoResponse>builder()
                .responseCode(HttpStatus.CREATED.value())
                .responseMessage("Pago registrado exitosamente")
                .data(pago)
                .build();
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Response<PagoResponse>> obtenerPago(@PathVariable Long id) {
        PagoResponse pago = pagoService.obtenerPago(id);
        Response<PagoResponse> response = Response.<PagoResponse>builder()
                .responseCode(HttpStatus.OK.value())
                .responseMessage("Pago encontrado")
                .data(pago)
                .build();
        return ResponseEntity.ok(response);
    }

    @GetMapping("/matricula/{matriculaId}")
    public ResponseEntity<Response<List<PagoResponse>>> listarPagosPorMatricula(@PathVariable Long matriculaId) {
        List<PagoResponse> pagos = pagoService.listarPagosPorMatricula(matriculaId);
        Response<List<PagoResponse>> response = Response.<List<PagoResponse>>builder()
                .responseCode(HttpStatus.OK.value())
                .responseMessage("Historial de pagos obtenido")
                .data(pagos)
                .build();
        return ResponseEntity.ok(response);
    }

    @GetMapping
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<Response<List<PagoResponse>>> listarTodosPagos() {
        List<PagoResponse> pagos = pagoService.listarTodosPagos();
        Response<List<PagoResponse>> response = Response.<List<PagoResponse>>builder()
                .responseCode(HttpStatus.OK.value())
                .responseMessage("Lista de pagos obtenida")
                .data(pagos)
                .build();
        return ResponseEntity.ok(response);
    }

    @PutMapping("/{id}/verificar")
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<Response<PagoResponse>> verificarPago(@PathVariable Long id) {
        PagoResponse pago = pagoService.verificarPago(id);
        Response<PagoResponse> response = Response.<PagoResponse>builder()
                .responseCode(HttpStatus.OK.value())
                .responseMessage("Pago verificado exitosamente")
                .data(pago)
                .build();
        return ResponseEntity.ok(response);
    }

    @PutMapping("/{id}/rechazar")
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<Response<PagoResponse>> rechazarPago(@PathVariable Long id) {
        PagoResponse pago = pagoService.rechazarPago(id);
        Response<PagoResponse> response = Response.<PagoResponse>builder()
                .responseCode(HttpStatus.OK.value())
                .responseMessage("Pago rechazado")
                .data(pago)
                .build();
        return ResponseEntity.ok(response);
    }
}
