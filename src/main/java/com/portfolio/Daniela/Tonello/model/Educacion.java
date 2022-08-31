package com.portfolio.Daniela.Tonello.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Educacion {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String establecimiento;
    private String carrera;
    private String curso;
    private String duracion;
    
    public Educacion() {
    }
    
    public Educacion(Long id, String establecimiento, String carrera, String curso, String duracion) {
        this.id = id;
        this.establecimiento = establecimiento;
        this.carrera = carrera;
        this.curso = curso;
        this.duracion = duracion;
    }
}
