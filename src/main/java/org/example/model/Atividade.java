package org.example.model;

import org.example.model.dto.AtividadeDTO;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document
public class Atividade {

    @Id
    private String _id;
    private String name;
    private String RA;
    private List<String> respostas;

    public Atividade(AtividadeDTO atividadeDTO) {
        this.name = atividadeDTO.getName();
        this.RA = atividadeDTO.getRA();
        this.respostas = atividadeDTO.getRespostas();
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

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
