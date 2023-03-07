package com.niji.lille.portailLille.controller;

import com.niji.lille.portailLille.entity.Idee;
import com.niji.lille.portailLille.servcie.IdeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/idees")
public class IdeeController {

    private final IdeeService ideeService;

    public IdeeController(IdeeService ideeService) {
        this.ideeService = ideeService;
    }

    @GetMapping("")
    public List<Idee> findAll() {
        return ideeService.findAll();
    }

    @PostMapping("")
    public Idee save(@RequestBody Idee entity) {
        return ideeService.save(entity);
    }

    @GetMapping("{id}")
    public Idee findById(@PathVariable String id) {
        return ideeService.findById(id);
    }


    @DeleteMapping("{id}")
    public void deleteById(String id) {
        ideeService.deleteById(id);
    }

}
