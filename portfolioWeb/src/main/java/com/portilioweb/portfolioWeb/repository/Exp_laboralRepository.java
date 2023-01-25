
package com.portilioweb.portfolioWeb.repository;

import com.portilioweb.portfolioWeb.model.Exp_laboral;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Exp_laboralRepository extends JpaRepository<Exp_laboral,Long>{
    
}
