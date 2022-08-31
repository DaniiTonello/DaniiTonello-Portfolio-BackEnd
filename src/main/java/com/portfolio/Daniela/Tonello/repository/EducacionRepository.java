package com.portfolio.Daniela.Tonello.repository;

import com.portfolio.Daniela.Tonello.model.Educacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EducacionRepository extends JpaRepository<Educacion, Long> {
    
}
