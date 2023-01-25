
package com.portilioweb.portfolioWeb.model;

import jakarta.persistence.Basic;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;



@Getter @Setter
@Entity
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO )
    private Long id;
    @Basic
    private String nombre;
    private String apellido;
    private String domicilio;
    private int edad;
    private String telefono;
    private String email;
    private String sobre_mi;
    private String img_url;

    public Persona() {
    }

    public Persona(Long id, String nombre, String apellido, String domicilio, int edad, String telefono, String email, String sobre_mi, String img_url) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.domicilio = domicilio;
        this.edad = edad;
        this.telefono = telefono;
        this.email = email;
        this.sobre_mi = sobre_mi;
        this.img_url = img_url;
    }
   
    
}

