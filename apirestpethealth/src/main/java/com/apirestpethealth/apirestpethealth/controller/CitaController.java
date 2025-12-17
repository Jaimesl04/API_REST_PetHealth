package com.apirestpethealth.apirestpethealth.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apirestpethealth.apirestpethealth.entities.Cita;
import com.apirestpethealth.apirestpethealth.services.CitaService;

@RestController
@RequestMapping("/apirestpethealth/citas")
public class CitaController {

    @Autowired
    public CitaService citaService;
    
}
