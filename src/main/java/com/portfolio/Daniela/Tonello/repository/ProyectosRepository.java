package com.portfolio.Daniela.Tonello.repository;

import com.portfolio.Daniela.Tonello.model.Proyectos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProyectosRepository extends JpaRepository<Proyectos, Long> {
    
}
