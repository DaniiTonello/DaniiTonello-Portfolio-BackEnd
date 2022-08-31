package com.portfolio.Daniela.Tonello.service;

import com.portfolio.Daniela.Tonello.model.Educacion;
import java.util.List;


public interface IEducacionService {
    
    public List<Educacion> verEducacion ();
    public void crearEducacion (Educacion edu);
    public void borrarEducacion (Long id);
    public Educacion buscarEducacion (Long id);
    public void actualizarEducacion(Educacion edu);
}
