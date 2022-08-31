package com.portfolio.Daniela.Tonello.service;

import com.portfolio.Daniela.Tonello.model.Tecnologias;
import com.portfolio.Daniela.Tonello.repository.TecnologiasRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TecnologiasService implements ITecnologiasService{
    
    @Autowired
    public TecnologiasRepository tecnoRepo;
    
    
    @Override
    public List<Tecnologias> verTecnologias() {
        return tecnoRepo.findAll();
    }

    @Override
    public void crearTecnologias(Tecnologias tecno) {
        tecnoRepo.save(tecno);
    
    }

    @Override
    public void borrarTecnologias(Long id) {
        tecnoRepo.deleteById(id);
    }

    @Override
    public Tecnologias buscarTecnologias(Long id) {
        return tecnoRepo.findById(id).orElse(null);
    }

    @Override
    public void actualizarTecnologias(Tecnologias tecno) {
        tecnoRepo.save(tecno);
    }
}
