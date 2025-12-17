package com.apirestpethealth.apirestpethealth.services;
import java.util.Optional;
import com.apirestpethealth.apirestpethealth.entities.Cita;

public interface CitaService {

    public Iterable<Cita> findAll();

    public Optional<Cita> findById(int id);

    public Cita save(Cita cita);

    public void deleteById(int id);

}