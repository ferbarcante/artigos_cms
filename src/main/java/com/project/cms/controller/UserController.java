package com.project.cms.controller;

import com.project.cms.entities.User;
import com.project.cms.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController

@RequestMapping("/users")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/")
    public List<User> buscarTodos(){
        return userService.buscarTodos();
    }

    @PostMapping("/")
    public User inserir(@RequestBody User user){
        return userService.inserir(user);
    }

    @PutMapping("/")
    public User atualizar(@RequestBody User user){
        return userService.atualizar(user);
    }

    @DeleteMapping("/{id}")
    public void excluir(@PathVariable("id") UUID id){
        userService.deletar(id);
    }
}
