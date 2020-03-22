/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectopersona.persona;

/**
 *
 * @author jose
 */
public class Persona {
    private String nombre;
    private  String CUI;

    public Persona(String nombre, String CUI) {
        this.nombre = nombre;
        this.CUI = CUI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCUI() {
        return CUI;
    }

    public void setCUI(String CUI) {
        this.CUI = CUI;
    }
    
public void imprimirDatos(){
    System.out.println("nombre: "+getNombre()+" CUI: "+getCUI());
}    
    
}
