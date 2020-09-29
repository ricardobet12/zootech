/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Felipe
 */
public class Aves extends Animales{
    
    private String tipoPluma;

    public Aves(String tipoPluma, String nombre, String color, boolean habla) {
        super(nombre, color, habla);
        this.tipoPluma = tipoPluma;
    }

   

    public String getTipoPluma() {
        return tipoPluma;
    }

    public void setTipoPluma(String tipoPluma) {
        this.tipoPluma = tipoPluma;
    }
    
}
