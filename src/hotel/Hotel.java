/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel;

/**
 *
 * @author Estudiante
 */
public class Hotel {
    
    private int num_pisos;
    private Pisos[] piso = new Pisos[3];
    
    public Hotel(Pisos[] p){
        this.num_pisos=p.length;
        this.piso=p;
        
    
    }
}
