
package com.portilioweb.portfolioWeb.model;

import jakarta.persistence.Basic;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

@Getter @Setter 
@Entity
public class Educacion {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Basic
    private String titulo;
    private String lugar;
    private String fecha_inic; 
    private String fecha_fin;

    public Educacion() {
    }

    public Educacion(Long id, String titulo, String lugar, String fecha_inic, String fecha_fin) {
        this.id = id;
        this.titulo = titulo;
        this.lugar = lugar;
        this.fecha_inic = fecha_inic;
        this.fecha_fin = fecha_fin;
    }
    
    
    
    
}
