package com.smartcity.semaforo.Controller;

import com.smartcity.semaforo.model.Semaforo;
import com.smartcity.semaforo.service.SemaforoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/semaforos")
public class SemaforoController {

    @Autowired
    private SemaforoService service;

    @GetMapping
    public List<Semaforo> getAllSemaforos() {
        return service.getAllSemaforos();
    }

    @GetMapping("/{id}")
    public Optional<Semaforo> getSemaforoById(@PathVariable String id) {
        return service.getSemaforoById(id);
    }

    @PostMapping
    public Semaforo createSemaforo(@RequestBody Semaforo semaforo) {
        return service.createSemaforo(semaforo);
    }

    @PutMapping("/{id}")
    public Semaforo updateSemaforo(@PathVariable String id, @RequestBody Semaforo semaforo) {
        return service.updateSemaforo(id, semaforo);
    }

    @DeleteMapping("/{id}")
    public void deleteSemaforo(@PathVariable String id) {
        service.deleteSemaforo(id);
    }
}
