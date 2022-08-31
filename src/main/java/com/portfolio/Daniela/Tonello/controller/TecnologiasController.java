package com.portfolio.Daniela.Tonello.controller;

import com.portfolio.Daniela.Tonello.model.Tecnologias;
import com.portfolio.Daniela.Tonello.service.ITecnologiasService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/tecnologias")
@CrossOrigin(origins = "https://portfolio-daniela-tonello.firebaseapp.com")
@RestController
public class TecnologiasController {
    
    @Autowired
    private ITecnologiasService tecServ;
 
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/new")
    public void agregarTecnologias (@RequestBody Tecnologias tec) {
        tecServ.crearTecnologias(tec);
    }
    
    @GetMapping ("/ver")
    @ResponseBody
    public List<Tecnologias> verTecnologias () {
        return tecServ.verTecnologias();
    }
    
    @GetMapping("/buscar/{id}")
    @ResponseBody
    public Tecnologias buscarTecnologias(@PathVariable long id){
        return tecServ.buscarTecnologias(id);
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping ("/delete/{id}")
    public void borrarTecnologias (@PathVariable Long id) {
        tecServ.borrarTecnologias(id);
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping ("/actualizar")
    public void actualizarTecnologias (@RequestBody Tecnologias tec) {
        tecServ.actualizarTecnologias(tec);
    }
}
