
package com.portfolio.Daniela.Tonello.security.service;

import com.portfolio.Daniela.Tonello.security.entity.Rol;
import com.portfolio.Daniela.Tonello.security.enums.RolNombre;
import com.portfolio.Daniela.Tonello.security.repositoy.IRolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional
public class RolService {
    
    @Autowired
    IRolRepository rolRepository;

    public Optional<Rol> getByRolNombre(RolNombre rolNombre){
        return rolRepository.findByRolNombre(rolNombre);
    }

    public void save(Rol rol){
        rolRepository.save(rol);
    }
    
}
