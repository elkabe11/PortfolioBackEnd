
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
public class Skills {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Basic
    private String skill;
    private int porcentaje;

    public Skills() {
    }

    public Skills(Long id, String skill, int porcentaje) {
        this.id = id;
        this.skill = skill;
        this.porcentaje = porcentaje;
    }
    
    
}
