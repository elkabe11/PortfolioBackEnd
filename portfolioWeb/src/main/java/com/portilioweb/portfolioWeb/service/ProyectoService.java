
package com.portilioweb.portfolioWeb.service;

import com.portilioweb.portfolioWeb.model.Proyecto;
import com.portilioweb.portfolioWeb.repository.ProyectoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProyectoService implements IProyectoService{
    
    @Autowired
    ProyectoRepository proyRepo;
    
    @Override
    public List<Proyecto> verProyecto() {
        return proyRepo.findAll();
    }

    @Override
    public void crearProyecto(Proyecto proyec) {
        proyRepo.save(proyec);
    }

    @Override
    public void borrarProyecto(Long id) {
        proyRepo.deleteById(id);
    }

    @Override
    public Proyecto buscarProyecto(Long id) {
        return proyRepo.findById(id).orElse(null);
    }

    @Override
    public void modificarProyecto(Proyecto proyec) {
        proyRepo.save(proyec);
    }
    
}
