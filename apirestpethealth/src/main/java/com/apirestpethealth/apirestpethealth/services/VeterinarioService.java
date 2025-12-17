package com.apirestpethealth.apirestpethealth.services;
import java.util.Optional;
import com.apirestpethealth.apirestpethealth.entities.Veterinario;

public interface VeterinarioService {

    public Iterable<Veterinario> findAll();

    public Optional<Veterinario> findById(int id);

    public Veterinario save(Veterinario veterinario);

    public void deleteById(int id);

}
