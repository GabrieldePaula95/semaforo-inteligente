package com.smartcity.semaforo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.Date;

@Document(collection = "gestores_trafego")
public class GestorTrafego {

    @Id
    private String id;
    private String nome;
    private String ramal;
    private Date dataCadastro;

    // Construtor, Getters e Setters
    public GestorTrafego() {}

    public GestorTrafego(String nome, String ramal, Date dataCadastro) {
        this.nome = nome;
        this.ramal = ramal;
        this.dataCadastro = dataCadastro;
    }

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

    public String getRamal() {
        return ramal;
    }

    public void setRamal(String ramal) {
        this.ramal = ramal;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }
}
