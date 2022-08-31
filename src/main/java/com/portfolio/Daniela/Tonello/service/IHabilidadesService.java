
package com.portfolio.Daniela.Tonello.service;

import com.portfolio.Daniela.Tonello.model.Habilidades;
import java.util.List;


public interface IHabilidadesService {

    public void crearHabilidades(Habilidades hab);

    public List<Habilidades> verHabilidades();

    public Habilidades buscarHabilidades(long id);

    public void borrarHabilidades(Long id);

    public void actualizarHabilidades(Habilidades hab);
    
}