package com.smartcity.semaforo.Controller;

import com.smartcity.semaforo.model.Cruzamento;
import com.smartcity.semaforo.service.CruzamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/cruzamentos")
public class CruzamentoController {

    @Autowired
    private CruzamentoService cruzamentoService;

    // Criar um novo cruzamento
    @PostMapping
    public Cruzamento criarCruzamento(@RequestBody Cruzamento cruzamento) {
        return cruzamentoService.criarCruzamento(cruzamento);
    }

    // Atualizar cruzamento por ID
    @PutMapping("/{id}")
    public Cruzamento atualizarCruzamento(@PathVariable String id, @RequestBody Cruzamento cruzamento) {
        return cruzamentoService.atualizarCruzamento(id, cruzamento);
    }

    // Buscar todos os cruzamentos
    @GetMapping
    public List<Cruzamento> listarCruzamentos() {
        return cruzamentoService.buscarTodos();
    }

    // Buscar cruzamento por ID
    @GetMapping("/{id}")
    public Optional<Cruzamento> buscarPorId(@PathVariable String id) {
        return cruzamentoService.buscarPorId(id);
    }

    // Deletar um cruzamento
    @DeleteMapping("/{id}")
    public void deletarCruzamento(@PathVariable String id) {
        cruzamentoService.deletarCruzamento(id);
    }
}
