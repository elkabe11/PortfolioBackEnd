
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
public class Proyecto {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Basic
    private String nombre;
    private String descripcion;
    private String img_url;

    public Proyecto() {
    }

    public Proyecto(Long id, String nombre, String descripcion, String img_url) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.img_url = img_url;
    }
    
    
}
