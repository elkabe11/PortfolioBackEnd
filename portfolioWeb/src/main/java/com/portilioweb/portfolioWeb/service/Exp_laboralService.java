
package com.portilioweb.portfolioWeb.service;

import com.portilioweb.portfolioWeb.model.Educacion;
import com.portilioweb.portfolioWeb.model.Exp_laboral;
import com.portilioweb.portfolioWeb.repository.Exp_laboralRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Exp_laboralService implements IExp_laboralService{

    @Autowired
    Exp_laboralRepository expRepo;

    @Override
    public List<Exp_laboral> verExp_laboral() {
        return expRepo.findAll();
    }

    @Override
    public void crearExp_laboral(Exp_laboral exp) {
        expRepo.save(exp);
    }

    @Override
    public void borrarExp_laboral(Long id) {
        expRepo.deleteById(id);
    }

    @Override
    public Exp_laboral buscarExp_laboral(Long id) {
        return expRepo.findById(id).orElse(null);
    }

    @Override
    public void modificarExp_laboral(Exp_laboral exp) {
        expRepo.save(exp);
    }
    
   
}
