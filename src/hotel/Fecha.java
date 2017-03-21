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
public class Fecha {
    
    private int dia;
    private String mes;
    private int año;
    
    public Fecha(int dia, String mes, int año){
        this.dia=dia;
        this.mes=mes;
        this.año=año;
    }
    
    public void setDia(int dia){
        this.dia=dia;
    }
    
    public void setMes(String mes){
        this.mes=mes;
    }
    public void setAñoa(int año){
        this.año=año;
    }
}
