package com.portfolio.Daniela.Tonello.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Proyectos {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String proyecto;
    private String descripcion;
    private String empresa;
    private String duracion;
    private String tecnologias;
    private String imagenProyecto;
    private String linkProyecto;
    
    public Proyectos() {
    }
    
    public Proyectos(Long id, String proyecto, String descripcion, String empresa, String duracion, String tecnologias, String imagenProyecto, String linkProyecto) {
        this.id = id;
        this.proyecto = proyecto;
        this.descripcion = descripcion;
        this.empresa = empresa;
        this.duracion = duracion;
        this.tecnologias = tecnologias;
        this.imagenProyecto = imagenProyecto;
        this.linkProyecto = linkProyecto;
    }
}
