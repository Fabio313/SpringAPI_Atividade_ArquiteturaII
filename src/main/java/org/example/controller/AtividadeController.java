package org.example.controller;

import org.example.constant.Constant;
import org.example.model.Atividade;
import org.example.model.dto.AtividadeDTO;
import org.example.service.AtividadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.HttpClientErrorException;

import java.util.List;
import java.util.Optional;

@RestController
public class AtividadeController {

    @Autowired
    private AtividadeService atividadeService;

    @PostMapping(Constant.API_CLIENT)
    public void save (@RequestBody AtividadeDTO atividadeDTO){
        atividadeService.save(new Atividade(atividadeDTO));
    }

    @GetMapping(Constant.API_CLIENT)
    public List<Atividade> findAll(){
        return atividadeService.findAll();
    }

    @PutMapping(Constant.API_CLIENT)
    public ResponseEntity<Void> update(@RequestBody Atividade Atividade){
        if (Atividade.get_id().isEmpty() || Atividade.get_id() == null){
            return ResponseEntity.badRequest().build();
        }
        atividadeService.save(Atividade);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping(Constant.API_CLIENT + "/{id}")
    public void deleteById(@PathVariable("id") String id){
        atividadeService.deleteById(id);
    }

    @GetMapping(Constant.API_CLIENT + "/{id}")
    public Optional<Atividade> findById(@PathVariable String id){
        return atividadeService.findById(id);
    }
}