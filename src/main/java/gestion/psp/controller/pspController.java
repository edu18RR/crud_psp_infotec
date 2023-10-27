package gestion.psp.controller;

import gestion.psp.dto.pspDto;
import gestion.psp.entity.psp;
import gestion.psp.service.pspService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.HashMap;

@RestController
@RequestMapping("/api/psp_actividades")
public class pspController {

    @Autowired
    private pspService pspService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<psp> consulta() {
        return pspService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> consultaPorID(@PathVariable Long id) {
        psp psp = pspService.findById(id);
        if (psp != null) {
            return new ResponseEntity<>(psp, HttpStatus.OK);
        } else {
            return new ResponseEntity<>("El registro con el ID " + id + " no existe", HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
        Map<String, Object> response = new HashMap<>();
        psp pspDelete = pspService.findById(id);
        if (pspDelete == null) {
            response.put("mensaje", "El registro con ID " + id + " no existe en la base de datos");
            return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
        }

        pspService.delete(id);
        response.put("mensaje", "Registro eliminado con éxito");
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<?> create(@RequestBody pspDto pspDto) {
        psp pspCreated = pspService.createPSP(pspDto);
        if (pspCreated != null) {
            Map<String, Object> response = new HashMap<>();
            response.put("mensaje", "Registro creado con éxito");
            response.put("registro", pspCreated);
            return new ResponseEntity<>(response, HttpStatus.CREATED);
        } else {
            return new ResponseEntity<>("Error al crear el registro", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updatePSP(@PathVariable Long id, @RequestBody pspDto pspDto) {
        psp pspUpdated = pspService.updatePSP(id, pspDto);
        if (pspUpdated != null) {
            Map<String, Object> response = new HashMap<>();
            response.put("mensaje", "Registro actualizado con éxito");
            response.put("registro", pspUpdated);
            return new ResponseEntity<>(response, HttpStatus.OK);
        } else {
            return new ResponseEntity<>("Error al actualizar el registro", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}