package com.smartcity.semaforo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "semaforos")
public class Semaforo {

    @Id
    private String id;
    private String localizacao;
    private boolean veiculoPresente;
    private int tempoVerde; // Tempo do sinal verde em segundos

    // Construtor, Getters e Setters
    public Semaforo() {}

    public Semaforo(String localizacao, boolean veiculoPresente, int tempoVerde) {
        this.localizacao = localizacao;
        this.veiculoPresente = veiculoPresente;
        this.tempoVerde = tempoVerde;
    }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getLocalizacao() { return localizacao; }
    public void setLocalizacao(String localizacao) { this.localizacao = localizacao; }

    public boolean isVeiculoPresente() { return veiculoPresente; }
    public void setVeiculoPresente(boolean veiculoPresente) { this.veiculoPresente = veiculoPresente; }

    public int getTempoVerde() { return tempoVerde; }
    public void setTempoVerde(int tempoVerde) { this.tempoVerde = tempoVerde; }
}
