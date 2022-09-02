package com.portfolio.Daniela.Tonello.controller;

import com.portfolio.Daniela.Tonello.model.Persona;
import com.portfolio.Daniela.Tonello.service.IPersonaService;
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

@RequestMapping("/persona")
@CrossOrigin(origins = "https://portfolio-daniela-tonello.web.app")
@RestController
public class Controller {
    @Autowired
    private IPersonaService persoServ;
 
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/new")
    public void agregarPersona (@RequestBody Persona pers) {
        persoServ.crearPersona(pers);
    }
    @GetMapping ("/ver")
    @ResponseBody
    public List<Persona> verPersonas () {
        return persoServ.verPersonas();

    }
    
    @GetMapping("/buscar/{id}")
    @ResponseBody
    public Persona buscarExperiencia(@PathVariable long id){
        return persoServ.buscarPersona(id);
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping ("/delete/{id}")
    public void borrarPersona (@PathVariable Long id) {
        persoServ.borrarPersona(id);
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping ("/actualizar")
    public void actualizarPersona (@RequestBody Persona pers) {
        persoServ.actualizarPersona(pers);
    }

}