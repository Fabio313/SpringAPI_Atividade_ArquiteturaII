package org.example.model.dto;

import java.util.List;

public class AtividadeDTO {
    private String name;
    private String RA; 
    private List<String> respostas;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRA() {
        return RA;
    }

    public void setRA(String RA) {
        this.RA = RA;
    }

    public List<String> getRespostas() {
        return respostas;
    }

    public void setRespostas(List<String> respostas) {
        this.respostas = respostas;
    }
}
