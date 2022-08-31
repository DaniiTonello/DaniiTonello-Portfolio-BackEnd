package com.portfolio.Daniela.Tonello.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class ExperienciaLaboral {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String puesto;
    private String duracion;
    private String ubicacion;
    private String empresa;
    private String descripcion;
    
    public ExperienciaLaboral() {
    }
    
    public ExperienciaLaboral(Long id, String puesto, String duracion, String descripcion, String ubicacion, String empresa) {
        this.id = id;
        this.puesto = puesto;
        this.duracion = duracion;
        this.descripcion = descripcion;
        this.ubicacion = ubicacion;
        this.empresa = empresa;
    }
}
