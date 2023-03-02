package com.niji.lille.portailLille.controller;

import com.niji.lille.portailLille.entity.Users;
import com.niji.lille.portailLille.servcie.UserService;
import org.springframework.data.web.JsonPath;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/utilisateurs")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("")
    public List<Users> findAll() {
        return userService.findAll();
    }

    @PostMapping("")
    public Users save(@RequestBody Users entity) {
        return userService.save(entity);
    }

    @GetMapping("{id}")
    public Users findById(@PathVariable String id) {
        return userService.findById(id);
    }

    @GetMapping("{nom}")
    public List<Users> findByNom(@PathVariable String nom) {
        return userService.findByNom(nom);
    }

    @GetMapping("{prenom}")
    public List<Users> findByPrenom(@PathVariable String prenom) {
        return userService.findByPrenom(prenom);
    }

    @DeleteMapping("{id}")
    public void deleteById(@PathVariable String id) {
        userService.deleteById(id);
    }


}

