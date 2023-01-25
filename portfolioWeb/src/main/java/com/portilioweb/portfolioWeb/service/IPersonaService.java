
package com.portilioweb.portfolioWeb.service;

import com.portilioweb.portfolioWeb.model.Persona;
import java.util.List;

public interface IPersonaService {
    public List<Persona> verPersona();
    public void crearPersona(Persona pers);
    public void modificarPersona(Persona pers);
    public void borrarPersona(Long id);
    public Persona buscarPersona(Long id);
}
