
package com.portilioweb.portfolioWeb.service;

import com.portilioweb.portfolioWeb.model.Educacion;
import java.util.List;


public interface IEducacionService {

    public List<Educacion> verEducacion();
    public void crearEducacion(Educacion edu);
    public void modificarEducacion(Educacion edu);
    public void borrarEducacion(Long id);
    public Educacion buscarEducacion(Long id);
}
