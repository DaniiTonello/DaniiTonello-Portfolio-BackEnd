
package com.portfolio.Daniela.Tonello.service;

import com.portfolio.Daniela.Tonello.model.Habilidades;
import com.portfolio.Daniela.Tonello.repository.HabilidadesRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HabilidadesService implements IHabilidadesService{
    
    @Autowired
    public HabilidadesRepository habRepo;
    
    @Override
    public List<Habilidades> verHabilidades() {
        return habRepo.findAll();
    }

    @Override
    public void crearHabilidades(Habilidades hab) {
        habRepo.save(hab);
    
    }

    @Override
    public void borrarHabilidades(Long id) {
        habRepo.deleteById(id);
    }

    @Override
    public void actualizarHabilidades(Habilidades hab) {
        habRepo.save(hab);
    }

    @Override
    public Habilidades buscarHabilidades(long id) {
        return habRepo.findById(id).orElse(null);
    }
}
