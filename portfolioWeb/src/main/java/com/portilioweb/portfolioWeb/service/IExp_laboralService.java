
package com.portilioweb.portfolioWeb.service;

import com.portilioweb.portfolioWeb.model.Exp_laboral;
import java.util.List;


public interface IExp_laboralService {
  
    
    public List<Exp_laboral> verExp_laboral();
    public void crearExp_laboral(Exp_laboral exp);
    public void modificarExp_laboral (Exp_laboral exp);
    public void borrarExp_laboral(Long id);
    public Exp_laboral buscarExp_laboral(Long id);
    
}
