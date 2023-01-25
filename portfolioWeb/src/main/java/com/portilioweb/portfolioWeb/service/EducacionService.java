
package com.portilioweb.portfolioWeb.service;

import com.portilioweb.portfolioWeb.model.Educacion;
import com.portilioweb.portfolioWeb.repository.EducacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;


public class EducacionService implements IEducacionService{
    
    @Autowired
    EducacionRepository eduRepo;
    
    @Override
    public List<Educacion> verEducacion() {
        return eduRepo.findAll();
    }

    @Override
    public void crearEducacion(Educacion edu) {
        eduRepo.save(edu);
    }

    @Override
    public void borrarEducacion(Long id) {
        eduRepo.deleteById(id);
    }

    @Override
    public Educacion buscarEducacion(Long id) {
        return eduRepo.findById(id).orElse(null);
    }

    @Override
    public void modificarEducacion(Educacion edu) {
        eduRepo.save(edu);
    }
    
}
