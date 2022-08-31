package com.portfolio.Daniela.Tonello.service;

import com.portfolio.Daniela.Tonello.model.ExperienciaLaboral;
import java.util.List;


public interface IExperienciaLaboralService {
    
    public List<ExperienciaLaboral> verExperienciaLaboral ();
    public void crearExperienciaLaboral (ExperienciaLaboral exp);
    public void borrarExperienciaLaboral (Long id);
    public ExperienciaLaboral buscarExperienciaLaboral (Long id);
    public void actualizarExperienciaLaboral(ExperienciaLaboral exp);
}
