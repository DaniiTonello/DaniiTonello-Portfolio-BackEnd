package com.portfolio.Daniela.Tonello.controller;

import com.portfolio.Daniela.Tonello.model.Proyectos;
import com.portfolio.Daniela.Tonello.service.IProyectosService;
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

@RequestMapping("/proyectos")
@CrossOrigin(origins = "https://portfolio-daniela-tonello.web.app")
@RestController
public class ProyectosController {
    
    @Autowired
    private IProyectosService proyServ;
 
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/new")
    public void agregarProyectos (@RequestBody Proyectos proy) {
        proyServ.crearProyectos(proy);
    }
    @GetMapping ("/ver")
    @ResponseBody
    public List<Proyectos> verProyectos () {
        return proyServ.verProyectos();
    }
    
    @GetMapping("/buscar/{id}")
    @ResponseBody
    public Proyectos buscarProyectos(@PathVariable long id){
        return proyServ.buscarProyectos(id);
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping ("/delete/{id}")
    public void borrarProyectos (@PathVariable Long id) {
        proyServ.borrarProyectos(id);
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping ("/actualizar")
    public void actualizarProyectos (@RequestBody Proyectos proy) {
        proyServ.actualizarProyectos(proy);
    }
}
