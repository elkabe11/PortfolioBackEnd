
package com.portilioweb.portfolioWeb.repository;

import com.portilioweb.portfolioWeb.model.Skills;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SkillsRepository extends JpaRepository<Skills,Long>{
    
}
