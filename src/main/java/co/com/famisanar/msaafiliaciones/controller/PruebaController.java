package co.com.famisanar.msaafiliaciones.controller;

import co.com.famisanar.msaafiliaciones.model.Prueba;
import co.com.famisanar.msaafiliaciones.service.PruebaService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/v1/pruebas")
@Tag(name = "PRUEBAS", description = "Pruebas de microservicio")
public class PruebaController {

    @Autowired
    private PruebaService pruebaService;

    @GetMapping
    @Operation(summary = "Consulta de todas las pruebas")
    public ResponseEntity<List<Prueba>> getPruebas() {
        return ResponseEntity.ok(pruebaService.getPruebas());
    }
}
