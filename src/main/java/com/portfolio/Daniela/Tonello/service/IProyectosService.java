package com.portfolio.Daniela.Tonello.service;

import com.portfolio.Daniela.Tonello.model.Proyectos;
import java.util.List;


public interface IProyectosService {
    
    public List<Proyectos> verProyectos ();
    public void crearProyectos (Proyectos proy);
    public void borrarProyectos (Long id);
    public Proyectos buscarProyectos (Long id);
    public void actualizarProyectos(Proyectos proy);
}
