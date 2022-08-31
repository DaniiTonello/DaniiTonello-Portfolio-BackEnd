package com.portfolio.Daniela.Tonello.repository;

import com.portfolio.Daniela.Tonello.model.Tecnologias;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TecnologiasRepository extends JpaRepository<Tecnologias, Long>{
    
}
