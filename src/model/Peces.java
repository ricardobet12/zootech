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
public class Peces extends Animales {

    private String tipoEscama;

    public Peces(String tipoEscama, String nombre, String color, boolean habla) {
        super(nombre, color, habla);
        this.tipoEscama = tipoEscama;
    }

    

    public String getTipoEscama() {
        return tipoEscama;
    }

    public void setTipoEscama(String tipoEscama) {
        this.tipoEscama = tipoEscama;
    }

}
