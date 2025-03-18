package com.smartcity.semaforo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "cruzamentos")
public class Cruzamento {

    @Id
    private String id;
    private String nome;
    private String localizacao;
    private int vias;
    private String estadoSemaforo;  // Exemplo: "verde", "vermelho"
    private int nroVeiculosDetectados;
    private String dataCadastro;
    private String horaUltimaAtualizacao;
    private String sensores;  // Lista de sensores, pode ser uma string ou outra coleção dependendo do caso

    // Construtores
    public Cruzamento() {}

    public Cruzamento(String nome, String localizacao, int vias, String estadoSemaforo, int nroVeiculosDetectados, String dataCadastro, String horaUltimaAtualizacao, String sensores) {
        this.nome = nome;
        this.localizacao = localizacao;
        this.vias = vias;
        this.estadoSemaforo = estadoSemaforo;
        this.nroVeiculosDetectados = nroVeiculosDetectados;
        this.dataCadastro = dataCadastro;
        this.horaUltimaAtualizacao = horaUltimaAtualizacao;
        this.sensores = sensores;
    }

    // Getters e Setters

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public int getVias() {
        return vias;
    }

    public void setVias(int vias) {
        this.vias = vias;
    }

    public String getEstadoSemaforo() {
        return estadoSemaforo;
    }

    public void setEstadoSemaforo(String estadoSemaforo) {
        this.estadoSemaforo = estadoSemaforo;
    }

    public int getNroVeiculosDetectados() {
        return nroVeiculosDetectados;
    }

    public void setNroVeiculosDetectados(int nroVeiculosDetectados) {
        this.nroVeiculosDetectados = nroVeiculosDetectados;
    }

    public String getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(String dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public String getHoraUltimaAtualizacao() {
        return horaUltimaAtualizacao;
    }

    public void setHoraUltimaAtualizacao(String horaUltimaAtualizacao) {
        this.horaUltimaAtualizacao = horaUltimaAtualizacao;
    }

    public String getSensores() {
        return sensores;
    }

    public void setSensores(String sensores) {
        this.sensores = sensores;
    }
}
