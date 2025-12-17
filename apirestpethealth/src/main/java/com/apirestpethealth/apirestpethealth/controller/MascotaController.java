package com.apirestpethealth.apirestpethealth.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apirestpethealth.apirestpethealth.entities.Mascota;
import com.apirestpethealth.apirestpethealth.services.MascotaService;

@RestController
@RequestMapping("/apirestpethealth/mascotas")
public class MascotaController {

    @Autowired
    public MascotaService mascotaService;
    
}
