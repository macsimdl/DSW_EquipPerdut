/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

public class Serie {
    private String titol;
    private String descripcio;
    private Productora productora;
    private ArrayList<Temporada> temporades;
    private ArrayList<Artista> artistes;

    public Serie() {
        temporades = new ArrayList();
        artistes = new ArrayList();
    }

    public Serie(String titol, String descripcio, Productora productora, ArrayList<Temporada> temporades, ArrayList<Artista> artistes) {
        this.titol = titol;
        this.descripcio = descripcio;
        this.productora = productora;
        this.temporades = temporades;
        this.artistes = artistes;
    }

    public Productora getProductora() {
        return productora;
    }

    public void setProductora(Productora productora) {
        this.productora = productora;
    }
    
    public String getTitol() {
        return titol;
    }

    public void setTitol(String titol) {
        this.titol = titol;
    }

    public String getDescripcio() {
        return descripcio;
    }

    public void setDescripcio(String descripcio) {
        this.descripcio = descripcio;
    }

    public ArrayList<Temporada> getTemporades() {
        return temporades;
    }

    public void addTemporades(Temporada t) {
        this.temporades.add(t);
    }
    
}
