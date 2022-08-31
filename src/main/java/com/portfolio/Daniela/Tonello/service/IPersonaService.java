
package com.portfolio.Daniela.Tonello.service;

import com.portfolio.Daniela.Tonello.model.Persona;
import java.util.List;



public interface IPersonaService {
    
    public List<Persona> verPersonas ();
    public void crearPersona (Persona pers);
    public void borrarPersona (Long id);
    public Persona buscarPersona (Long id);
    public void actualizarPersona(Persona pers);
    
}
