/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7;

import Entidad.Persona;

/**
 *
 * @author Winsl
 */
public class Guia7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Persona pers1=new Persona();
        Persona pers2=new Persona("Fulano");
        Persona pers3=new Persona(35,1.85);
        Persona pers4=new Persona(75.6,35000000);
        System.out.println("Edad: "+pers3.getEdad()+""
                + "\nAltura: "+pers3.getAltura());
    }
}
