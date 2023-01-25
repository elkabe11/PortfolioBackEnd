
package com.portilioweb.portfolioWeb.repository;

import com.portilioweb.portfolioWeb.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends JpaRepository<Persona,Long>{
    
}
