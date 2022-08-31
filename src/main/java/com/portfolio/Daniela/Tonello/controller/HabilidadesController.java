
package com.portfolio.Daniela.Tonello.controller;

import com.portfolio.Daniela.Tonello.model.Habilidades;
import com.portfolio.Daniela.Tonello.service.IHabilidadesService;
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

@RequestMapping("/habilidades")
@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class HabilidadesController {
    @Autowired
    private IHabilidadesService habServ;
 
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/new")
    public void agregarHabilidades (@RequestBody Habilidades hab) {
        habServ.crearHabilidades(hab);
    }
    @GetMapping ("/ver")
    @ResponseBody
    public List<Habilidades> verHabilidades () {
        return habServ.verHabilidades();
    }
    
    @GetMapping("/buscar/{id}")
    @ResponseBody
    public Habilidades buscarHabilidades(@PathVariable long id){
        return habServ.buscarHabilidades(id);
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping ("/delete/{id}")
    public void borrarHabilidades (@PathVariable Long id) {
        habServ.borrarHabilidades(id);
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping ("/actualizar")
    public void actualizarHabilidades (@RequestBody Habilidades hab) {
        habServ.actualizarHabilidades(hab);
    }
}
