package com.portfolio.Daniela.Tonello.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Persona {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombre;
    private String apellido;
    private String pais;
    private String provincia;
    private String acercaDe;
    private String imagen;
    
    public Persona(){
    }
    
    public Persona(Long id, String nombre, String apellido, String pais, String provincia,String acercaDe, String imagen) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.pais = pais;
        this.provincia = provincia;
        this.acercaDe = acercaDe;
        this.imagen = imagen;
    }
}
