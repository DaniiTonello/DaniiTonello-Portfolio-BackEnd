
package com.portfolio.Daniela.Tonello.security.repositoy;

import com.portfolio.Daniela.Tonello.security.entity.Rol;
import com.portfolio.Daniela.Tonello.security.enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRolRepository extends JpaRepository<Rol, Integer>{
    Optional<Rol> findByRolNombre(RolNombre rolNombre);
}
