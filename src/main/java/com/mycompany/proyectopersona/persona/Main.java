/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectopersona.persona;

import java.util.Scanner;

/**
 *
 * @author jose
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada=new Scanner(System.in);
        System.out.println("INGRESE NOMBRE: ");
        String name=entrada.nextLine();
        System.out.println("INGRESE CUI:");
        String cui=entrada.nextLine();
     Persona persona1=new Persona(name,cui);
        persona1.imprimirDatos();
    }
    
}
