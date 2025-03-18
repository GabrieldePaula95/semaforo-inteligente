package com.smartcity.semaforo.Controller;

import com.smartcity.semaforo.model.Alerta;
import com.smartcity.semaforo.service.AlertaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/semaforos/alertas")
public class AlertaController {

    @Autowired
    private AlertaService alertaService;

    // Criar um novo alerta
    @PostMapping
    public Alerta criarAlerta(@RequestBody Alerta alerta) {
        return alertaService.criarAlerta(alerta.getMessage());
    }

    @PutMapping("/{id}")
    public Alerta atualizarAlerta(@PathVariable String id, @RequestBody Alerta alerta) {
        return alertaService.atualizarAlerta(id, alerta);
    }

    // Buscar todos os alertas
    @GetMapping
    public List<Alerta> listarAlertas() {
        return alertaService.buscarTodos();
    }

    // Buscar um alerta por ID
    @GetMapping("/{id}")
    public Optional<Alerta> buscarPorId(@PathVariable String id) {
        return alertaService.buscarPorId(id);
    }

    // Deletar um alerta por ID
    @DeleteMapping("/{id}")
    public void deletarAlerta(@PathVariable String id) {
        alertaService.deletarAlerta(id);
    }
}
