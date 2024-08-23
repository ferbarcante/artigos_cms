package com.project.cms.service;

import com.project.cms.entities.Artigo;
import com.project.cms.repository.ArtigoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ArtigoService {

    @Autowired
    ArtigoRepository artigoRepository;

    public List<Artigo> buscarTodos(){
        return artigoRepository.findAll();
    }

    public Artigo inserir(Artigo artigo){
        Artigo artigoNovo = artigoRepository.save(artigo);
        return artigoNovo;
    }

    public Artigo atualizar(Artigo artigo){
        return artigoRepository.save(artigo);
    }

    public void deletar(UUID id){
        Artigo artigo = artigoRepository.findById(id).get();
        artigoRepository.delete(artigo);
    }
}
