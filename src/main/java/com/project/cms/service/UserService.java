package com.project.cms.service;

import com.project.cms.entities.Artigo;
import com.project.cms.entities.User;
import com.project.cms.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public List<User> buscarTodos(){
        return userRepository.findAll();
    }

    public User inserir(User user){
        User userNovo = userRepository.save(user);
        return userNovo;
    }

    public User atualizar(User user){
        return userRepository.save(user);
    }

    public void deletar(UUID id){
        User user = userRepository.findById(id).get();
        userRepository.delete(user);
    }
}
