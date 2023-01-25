
package com.portilioweb.portfolioWeb.repository;

import com.portilioweb.portfolioWeb.model.Proyecto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProyectoRepository extends JpaRepository<Proyecto,Long>{
    
}
