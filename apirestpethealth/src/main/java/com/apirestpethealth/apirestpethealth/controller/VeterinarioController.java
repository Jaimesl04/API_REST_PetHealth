package com.apirestpethealth.apirestpethealth.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apirestpethealth.apirestpethealth.entities.Veterinario;
import com.apirestpethealth.apirestpethealth.services.VeterinarioService;

@RestController
@RequestMapping("/apirestpethealth/veterinarios")
public class VeterinarioController {

    @Autowired
    public VeterinarioService service;
    
}
