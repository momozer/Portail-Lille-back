package com.niji.lille.portailLille.controller;

import com.niji.lille.portailLille.servcie.IdeeService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/idees")
public class IdeeController {

    private final IdeeService ideeService;

    public IdeeController(IdeeService ideeService) {
        this.ideeService = ideeService;
    }


}
