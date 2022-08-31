package com.portfolio.Daniela.Tonello.controller;

import com.portfolio.Daniela.Tonello.model.Educacion;
import com.portfolio.Daniela.Tonello.service.IEducacionService;
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

@RequestMapping("/educacion")
@CrossOrigin(origins = "https://portfolio-daniela-tonello.firebaseapp.com")
@RestController
public class EducacionController {
    @Autowired
    private IEducacionService eduServ;
 
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/new")
    public void agregarEducacion (@RequestBody Educacion edu) {
        eduServ.crearEducacion(edu);
    }
    @GetMapping ("/ver")
    @ResponseBody
    public List<Educacion> verEducacion () {
        return eduServ.verEducacion();

    }
    
    @GetMapping("/buscar/{id}")
    @ResponseBody
    public Educacion buscarEducacion(@PathVariable long id){
        return eduServ.buscarEducacion(id);
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping ("/delete/{id}")
    public void borrarEducacion (@PathVariable Long id) {
        eduServ.borrarEducacion(id);
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping ("/actualizar")
    public void actualizarEducacion (@RequestBody Educacion edu) {
        eduServ.actualizarEducacion(edu);
    }
}
