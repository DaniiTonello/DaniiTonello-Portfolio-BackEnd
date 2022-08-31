package com.portfolio.Daniela.Tonello.service;

import com.portfolio.Daniela.Tonello.model.Tecnologias;
import java.util.List;


public interface ITecnologiasService {
    
    public List<Tecnologias> verTecnologias ();
    
    public void crearTecnologias (Tecnologias tecno);
    
    public void borrarTecnologias (Long id);
    
    public Tecnologias buscarTecnologias (Long id);
    
    public void actualizarTecnologias(Tecnologias tecno);
}
