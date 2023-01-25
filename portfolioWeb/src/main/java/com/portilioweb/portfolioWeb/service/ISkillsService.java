
package com.portilioweb.portfolioWeb.service;

import com.portilioweb.portfolioWeb.model.Skills;
import java.util.List;

public interface ISkillsService {
    
    
    public List<Skills> verSkills(); 
    public void crearSkill(Skills skill);
    public void modificarSkill(Skills skill);
    public void borrarSkill (Long id);
    public Skills buscarSkill (Long id); 
}
