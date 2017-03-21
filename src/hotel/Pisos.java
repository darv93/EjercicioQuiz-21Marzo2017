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
public class Pisos {
    
    private int numero_piso;
    private int cantidad_hab;
    private Habitaciones[] habitaciones = new Habitaciones[cantidad_hab];
    
    
    public Pisos (Habitaciones[] b){
        this.cantidad_hab=b.length;
        this.habitaciones=b;
    }
    
    public int habitaciones_piso(){
        return this.cantidad_hab;
    }
    
    public Habitaciones getHabitacion(int a){
        return this.habitaciones[a];
    }
    
}
