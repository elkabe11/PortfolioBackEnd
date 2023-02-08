
package com.portilioweb.portfolioWeb.controller;

import com.portilioweb.portfolioWeb.model.Educacion;
import com.portilioweb.portfolioWeb.model.Exp_laboral;
import com.portilioweb.portfolioWeb.model.Persona;
import com.portilioweb.portfolioWeb.model.Proyecto;
import com.portilioweb.portfolioWeb.model.Skills;
import com.portilioweb.portfolioWeb.service.IEducacionService;
import com.portilioweb.portfolioWeb.service.IExp_laboralService;
import com.portilioweb.portfolioWeb.service.IPersonaService;
import com.portilioweb.portfolioWeb.service.IProyectoService;
import com.portilioweb.portfolioWeb.service.ISkillsService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @Autowired
    private IEducacionService eduServ;
    @Autowired
    private IPersonaService persoServ;
    @Autowired
    private IExp_laboralService expServ;
    @Autowired
    private IProyectoService proyServ;
    @Autowired
    private ISkillsService skillServ;
    
    //////////////Persona//////////////
    @PostMapping ("/crear/persona")
    public void agregarPersona (@RequestBody Persona pers){
        persoServ.crearPersona(pers);
    }
    
    @GetMapping ("/ver/personas")
    @ResponseBody
    public List<Persona> verPersona(){
       return persoServ.verPersona();
    }
    
    @GetMapping ("/borrar/persona")
    public void borrarPersona (@RequestParam Long id){
        persoServ.borrarPersona(id);
    }
    
    @PutMapping ("/modificar/persona")
    public void modificarPersona(@RequestBody Persona pers){
        persoServ.modificarPersona(pers);
    }
    
    //////////////Educacion//////////////
    @PostMapping ("/crear/educacion")
    public void agregarEducacion (@RequestBody Educacion edu){
        eduServ.crearEducacion(edu);
    }
    
    @GetMapping ("/ver/educacion")
    @ResponseBody
    public List<Educacion> verEducacion(){
       return eduServ.verEducacion();
    }
    
    @GetMapping ("/borrar/educacion")
    public void borrarEducacion (@RequestParam Long id){
        eduServ.borrarEducacion(id);
    }
    
    @PutMapping ("/modificar/educacion")
    public void modificarEducacion(@RequestBody Educacion edu){
        eduServ.modificarEducacion(edu);
    } 
    
    //////////////Experiencia Laboral//////////////
    
    @PostMapping ("/crear/exp_laboral")
    public void agregarExp_laboral (@RequestBody Exp_laboral exp){
        expServ.crearExp_laboral(exp);
    }
    
    @GetMapping ("/ver/exp_laboral")
    @ResponseBody
    public List<Exp_laboral> verExp_laboral(){
       return expServ.verExp_laboral();
    }
    
    @GetMapping ("/borrar/exp_laboral")
    public void borrarExp_laboral (@RequestParam Long id){
        expServ.borrarExp_laboral(id);
    }
    
    @PutMapping ("/modificar/exp_laboral")
    public void modificarExp_laboral(@RequestBody Exp_laboral exp){
        expServ.modificarExp_laboral(exp);
    }
    
    //////////////Proyecto//////////////
    @PostMapping ("/crear/proyecto")
    public void agregarPoyecto (@RequestBody Proyecto proy){
        proyServ.crearProyecto(proy);
    }
    
    @GetMapping ("/ver/proyecto")
    @ResponseBody
    public List<Proyecto> verProyecto(){
       return proyServ.verProyecto();
    }
    
    @GetMapping ("/borrar/proyecto")
    public void borrarProyecto (@RequestParam Long id){
        proyServ.borrarProyecto(id);
    }
    
    @PutMapping ("/modificar/proyecto")
    public void modificarProyecto(@RequestBody Proyecto proy){
        proyServ.modificarProyecto(proy);
    }
    
    //////////////Skills//////////////
    @PostMapping ("/crear/skill")
    public void agregarSkill (@RequestBody Skills skill){
        skillServ.crearSkill(skill);
    }
    
    @GetMapping ("/ver/skill")
    @ResponseBody
    public List<Skills> verSkill(){
       return skillServ.verSkills();
    }
    
    @GetMapping ("/borrar/skill")
    public void borrarSkill (@RequestParam Long id){
        skillServ.borrarSkill(id);
    }
    
    @PutMapping ("/modificar/skill")
    public void modificarSkill(@RequestBody Skills skill){
        skillServ.modificarSkill(skill);
    }
    
}
