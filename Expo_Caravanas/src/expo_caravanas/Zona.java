/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expo_caravanas;

/**
 *
 * @author sergi
 */
public class Zona {
    private int entradas;

    public Zona() {
    }

    public Zona(int entradas) {
        this.entradas = entradas;
    }

    public int getEntradas() {
        return entradas;
    }

    public void setEntradas(int entradas) {
        this.entradas = entradas;
    }
    
    
    public void verificar(){
    if (entradas > 0){
        System.out.println("Quedan: "+ entradas + " entradas");
    } else { 
        System.out.println("No hay entradas");
        boolean b = true;
    }
    
    }
}
