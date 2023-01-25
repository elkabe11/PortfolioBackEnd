package com.portilioweb.portfolioWeb.service;

import com.portilioweb.portfolioWeb.model.Proyecto;
import java.util.List;


public interface IProyectoService {
   
    public List<Proyecto> verProyecto();
    public void crearProyecto(Proyecto proyec);
    public void modificarProyecto (Proyecto proyec);
    public void borrarProyecto(Long id);
    public Proyecto buscarProyecto(Long id);
}
