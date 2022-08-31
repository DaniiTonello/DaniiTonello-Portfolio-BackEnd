package com.portfolio.Daniela.Tonello.service;

import com.portfolio.Daniela.Tonello.model.Proyectos;
import com.portfolio.Daniela.Tonello.repository.ProyectosRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProyectosService implements IProyectosService{
    
    @Autowired
    public ProyectosRepository proyRepo;
    
    
    @Override
    public List<Proyectos> verProyectos() {
        return proyRepo.findAll();
    }

    @Override
    public void crearProyectos(Proyectos proy) {
        proyRepo.save(proy);
    
    }

    @Override
    public void borrarProyectos(Long id) {
        proyRepo.deleteById(id);
    }

    @Override
    public Proyectos buscarProyectos(Long id) {
        return proyRepo.findById(id).orElse(null);
    }

    @Override
    public void actualizarProyectos(Proyectos proy) {
        proyRepo.save(proy);
    }
}
