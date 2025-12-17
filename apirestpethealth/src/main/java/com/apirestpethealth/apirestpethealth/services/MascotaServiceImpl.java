package com.apirestpethealth.apirestpethealth.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apirestpethealth.apirestpethealth.entities.Mascota;
import com.apirestpethealth.apirestpethealth.repositories.MascotaRepository;

@Service
public class MascotaServiceImpl {

    @Autowired
    MascotaRepository mascotaRepository;
    
}
