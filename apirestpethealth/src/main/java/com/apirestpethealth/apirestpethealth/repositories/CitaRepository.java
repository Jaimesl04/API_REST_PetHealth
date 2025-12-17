package com.apirestpethealth.apirestpethealth.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.apirestpethealth.apirestpethealth.entities.Cita;

public interface CitaRepository extends JpaRepository<Cita, Integer> {
    
}
