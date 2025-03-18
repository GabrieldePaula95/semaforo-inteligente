package com.smartcity.semaforo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document(collection = "alertas")
public class Alerta {

    @Id
    private String id;
    private String message;
    private LocalDateTime dataHora;

    // Construtor vazio
    public Alerta() {}

    // Construtor completo
    public Alerta(String message, LocalDateTime dataHora) {
        this.message = message;
        this.dataHora = dataHora;
    }

    // Getters e Setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getMessage() { return message; }
    public void setMessage(String message) { this.message = message; }

    public LocalDateTime getDataHora() { return dataHora; }
    public void setDataHora(LocalDateTime dataHora) { this.dataHora = dataHora; }
}
