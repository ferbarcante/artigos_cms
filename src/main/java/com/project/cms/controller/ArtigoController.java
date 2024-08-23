package com.project.cms.controller;

import com.project.cms.entities.Artigo;
import com.project.cms.entities.User;
import com.project.cms.service.ArtigoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/artigos")
public class ArtigoController {

    @Autowired
    ArtigoService artigoService;

    @GetMapping("/")
    public List<Artigo> buscarTodos(){
        return artigoService.buscarTodos();
    }

    @PostMapping("/")
    public Artigo inserir(@RequestBody Artigo artigo){
        return artigoService.inserir(artigo);
    }

    @PutMapping("/")
    public Artigo atualizar(@RequestBody Artigo artigo){
        return artigoService.atualizar(artigo);
    }

    @DeleteMapping("/{id}")
    public void excluir(@PathVariable("id") UUID id){
        artigoService.deletar(id);
    }
}
