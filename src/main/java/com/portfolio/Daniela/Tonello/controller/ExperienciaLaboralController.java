package com.portfolio.Daniela.Tonello.controller;

import com.portfolio.Daniela.Tonello.model.ExperienciaLaboral;
import com.portfolio.Daniela.Tonello.service.IExperienciaLaboralService;
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

@RequestMapping("/experiencia-laboral")
@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class ExperienciaLaboralController {
    @Autowired
    private IExperienciaLaboralService expServ;
 
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/new")
    public void agregarExperienciaLaboral (@RequestBody ExperienciaLaboral exp) {
        expServ.crearExperienciaLaboral(exp);
    }
    @GetMapping ("/ver")
    @ResponseBody
    public List<ExperienciaLaboral> verExperienciaLaboral () {
        return expServ.verExperienciaLaboral();
    }
    
    @GetMapping("/buscar/{id}")
    @ResponseBody
    public ExperienciaLaboral buscarExperienciaLaboral(@PathVariable long id){
        return expServ.buscarExperienciaLaboral(id);
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping ("/delete/{id}")
    public void borrarExperienciaLaboral (@PathVariable Long id) {
        expServ.borrarExperienciaLaboral(id);
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping ("/actualizar")
    public void actualizarExperienciaLaboral (@RequestBody ExperienciaLaboral exp) {
        expServ.actualizarExperienciaLaboral(exp);
    }
}
