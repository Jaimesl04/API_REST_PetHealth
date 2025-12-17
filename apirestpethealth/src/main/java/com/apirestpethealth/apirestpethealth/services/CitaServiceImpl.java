package com.apirestpethealth.apirestpethealth.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apirestpethealth.apirestpethealth.entities.Cita;
import com.apirestpethealth.apirestpethealth.repositories.CitaRepository;

@Service
public class CitaServiceImpl {

    @Autowired
    CitaRepository citaRepository;
    
}
