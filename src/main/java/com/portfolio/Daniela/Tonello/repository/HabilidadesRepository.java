
package com.portfolio.Daniela.Tonello.repository;

import com.portfolio.Daniela.Tonello.model.Habilidades;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HabilidadesRepository extends JpaRepository<Habilidades, Long>{
    
}
