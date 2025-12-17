package com.apirestpethealth.apirestpethealth.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.apirestpethealth.apirestpethealth.entities.Veterinario;

public interface VeterinarioRepository extends JpaRepository<Veterinario, Integer> {

}
