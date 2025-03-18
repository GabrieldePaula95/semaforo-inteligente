package com.smartcity.semaforo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Document(collection = "sensores")
public class Sensor {

    @Id
    private String id;
    private String codigoSerie;
    private LocalDate ultimaManutencao;

    // Construtor padrão
    public Sensor() {}

    // Construtor completo
    public Sensor(String codigoSerie, LocalDate ultimaManutencao) {
        this.codigoSerie = codigoSerie;
        this.ultimaManutencao = ultimaManutencao;
    }

    // Getters e Setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getCodigoSerie() { return codigoSerie; }
    public void setCodigoSerie(String codigoSerie) { this.codigoSerie = codigoSerie; }

    public LocalDate getUltimaManutencao() { return ultimaManutencao; }
    public void setUltimaManutencao(LocalDate ultimaManutencao) { this.ultimaManutencao = ultimaManutencao; }
}
