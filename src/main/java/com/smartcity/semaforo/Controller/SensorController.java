package com.smartcity.semaforo.Controller;

import com.smartcity.semaforo.model.Sensor;
import com.smartcity.semaforo.service.SensorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/semaforos/sensores")
public class SensorController {

    @Autowired
    private SensorService sensorService;

    @PostMapping
    public Sensor criarSensor(@RequestBody Sensor sensor) {
        return sensorService.criarSensor(sensor.getCodigoSerie(), sensor.getUltimaManutencao());
    }

    @GetMapping
    public List<Sensor> listarSensores() {
        return sensorService.buscarTodos();
    }

    @GetMapping("/{id}")
    public Optional<Sensor> buscarPorId(@PathVariable String id) {
        return sensorService.buscarPorId(id);
    }

    @PutMapping("/{id}")
    public Sensor atualizarSensor(@PathVariable String id, @RequestBody Sensor sensor) {
        return sensorService.atualizarSensor(id, sensor.getCodigoSerie(), sensor.getUltimaManutencao());
    }

    @DeleteMapping("/{id}")
    public void deletarSensor(@PathVariable String id) {
        sensorService.deletarSensor(id);
    }
}
