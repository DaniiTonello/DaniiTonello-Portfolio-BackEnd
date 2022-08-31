
package com.portfolio.Daniela.Tonello.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Tecnologias {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String tecnologia;
    private String nivelExperiencia;
    
    public Tecnologias() {
    }
    
    public Tecnologias(Long id, String tecnologia, String nivelExperiencia) {
        this.id = id;
        this.tecnologia = tecnologia;
        this.nivelExperiencia = nivelExperiencia;
    }
}
