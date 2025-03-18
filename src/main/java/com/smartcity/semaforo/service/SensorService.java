package com.smartcity.semaforo.service;

import com.smartcity.semaforo.model.Sensor;
import com.smartcity.semaforo.repository.SensorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class SensorService {

    @Autowired
    private SensorRepository sensorRepository;

    public Sensor criarSensor(String codigoSerie, LocalDate ultimaManutencao) {
        Sensor sensor = new Sensor(codigoSerie, ultimaManutencao);
        return sensorRepository.save(sensor);
    }

    public List<Sensor> buscarTodos() {
        return sensorRepository.findAll();
    }

    public Optional<Sensor> buscarPorId(String id) {
        return sensorRepository.findById(id);
    }

    public Sensor atualizarSensor(String id, String codigoSerie, LocalDate ultimaManutencao) {
        Optional<Sensor> sensorOptional = sensorRepository.findById(id);
        if (sensorOptional.isPresent()) {
            Sensor sensor = sensorOptional.get();
            sensor.setCodigoSerie(codigoSerie);
            sensor.setUltimaManutencao(ultimaManutencao);
            return sensorRepository.save(sensor);
        }
        return null;
    }

    public void deletarSensor(String id) {
        sensorRepository.deleteById(id);
    }
}
