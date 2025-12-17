package com.apirestpethealth.apirestpethealth.services;

import java.util.Optional;
import com.apirestpethealth.apirestpethealth.entities.Mascota;

public interface MascotaService {

    public Iterable<Mascota> findAll();

    public Optional<Mascota> findById(int id);

    public Mascota save(Mascota mascota);

    public void deleteById(int id);

}
