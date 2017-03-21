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
public class Habitaciones {
    
    private int numero_hab;
    private int numero_ocupantes;
    private double alquiler;
   
    
    public Habitaciones(int num_hab,int num_ocupantes,double alquiler){
        this.numero_hab=num_hab;
        this.alquiler=alquiler;
        this.numero_ocupantes=num_ocupantes;
    }
    
    public void setNumero_Hab(int a){
        this.numero_hab=a;
    }
    
             
    public void setAlquiler_Hab(double f){
        this.alquiler =f;
    }
    
       
    public double getAlquiler_Hab(){
        return this.alquiler;
    }
    public int getNumero_Hab(){
        return this.numero_hab;
    }
    public int getNumero_Ocupantes(){
        return this.numero_ocupantes ;
    }
    
    
    
}
