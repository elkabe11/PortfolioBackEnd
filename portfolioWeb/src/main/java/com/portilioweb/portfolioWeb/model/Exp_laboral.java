
package com.portilioweb.portfolioWeb.model;

import jakarta.persistence.Basic;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;


@Entity
@Getter @Setter
public class Exp_laboral {
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Basic
    private String puesto;
    private String lugar;
    private String descripcion;

    public Exp_laboral() {
    }

    public Exp_laboral(Long id, String puesto, String lugar, String descripcion) {
        this.id = id;
        this.puesto = puesto;
        this.lugar = lugar;
        this.descripcion = descripcion;
    }
    
    

}
