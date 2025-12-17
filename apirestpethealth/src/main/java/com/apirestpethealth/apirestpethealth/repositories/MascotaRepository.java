package com.apirestpethealth.apirestpethealth.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.apirestpethealth.apirestpethealth.entities.Mascota;

public interface MascotaRepository extends JpaRepository<Mascota, Integer> {
    
}
