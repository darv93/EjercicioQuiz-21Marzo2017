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
public class Alquiler {
    private Personas encargado;
    private Habitaciones habitacion;
    private int numero_ocupantes;
    private Personas[] grupo= new Personas[numero_ocupantes];
    private double costo;
    private Fecha f;
    
    public Alquiler(Habitaciones hab, Personas[] grupo, Fecha f){
        if(hab.getNumero_Ocupantes()<grupo.length){
            System.out.println("El grupo es muy grande para esta habitación, seleccione otra habitación o reduzca el grupo");
        }else{
        this.habitacion=hab;
        this.numero_ocupantes=hab.getNumero_Ocupantes();
        this.grupo=grupo;
        this.costo=hab.getAlquiler_Hab();
        hab.setAlquilar_Hab();
    }    
    
    }
    
    public void setEncargado(Personas p1){
        this.encargado=p1;
    }
    
    public Personas getEncargado(){
        return this.encargado;
    }
    
    public void setFecha_Alquiler(Fecha f){
        this.f =f;
    }
    
    
    public void setGrupo(Personas[] grupo){
        this.grupo=grupo;
    }
    
    public Fecha getFecha_Alquiler(){
        return this.f;
    }
    
    public double getCosto_Alquiler(){
        return this.costo;
    }
    
    
    
    
    
}
