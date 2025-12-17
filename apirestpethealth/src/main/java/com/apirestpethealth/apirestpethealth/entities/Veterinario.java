package com.apirestpethealth.apirestpethealth.entities;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "veterinario")
public class Veterinario {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_veterinario")
    private Integer idVeterinario;
    
    @Column(name = "nombre", length = 50)
    private String nombre;
    
    @Column(name = "especialidad", length = 50)
    private String especialidad;
    
    @Column(name = "telefono", length = 9)
    private String telefono;
    
    @Column(name = "email", length = 100)
    private String email;
    
    @Column(name = "horario_trabajo", length = 50)
    private String horarioTrabajo;
    
    @Enumerated(EnumType.STRING)
    @Column(name = "estado", columnDefinition = "ENUM('Activo','Inactivo') DEFAULT 'Activo'")
    private EstadoVeterinario estado;
    
    @OneToMany(mappedBy = "veterinario", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonManagedReference
    private List<Cita> citas = new ArrayList<>();
    
    public enum EstadoVeterinario {
        Activo, Inactivo
    }
    
    public Veterinario() {
        this.estado = EstadoVeterinario.Activo;
    }

    public Veterinario(Integer idVeterinario, String nombre, String especialidad, String telefono, String email,
            String horarioTrabajo, EstadoVeterinario estado) {
        this.idVeterinario = idVeterinario;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.telefono = telefono;
        this.email = email;
        this.horarioTrabajo = horarioTrabajo;
        this.estado = estado;
    }

    public Integer getIdVeterinario() {
        return idVeterinario;
    }

    public void setIdVeterinario(Integer idVeterinario) {
        this.idVeterinario = idVeterinario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHorarioTrabajo() {
        return horarioTrabajo;
    }

    public void setHorarioTrabajo(String horarioTrabajo) {
        this.horarioTrabajo = horarioTrabajo;
    }

    public EstadoVeterinario getEstado() {
        return estado;
    }

    public void setEstado(EstadoVeterinario estado) {
        this.estado = estado;
    }

    public List<Cita> getCitas() {
        return citas;
    }

    public void setCitas(List<Cita> citas) {
        this.citas = citas;
    }

    

}
