/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author mdominlo10.alumnes
 */
public class Episodi {
    private String nom;
    private String duracio;
    private String idiomaOriginal;
    private String descripcio;
    private Date data;
    private int val;

    public Episodi() {
    }

    public Episodi(String nom, String duracio, String idiomaOriginal, String descripcio, Date data) {
        this.nom = nom;
        this.duracio = duracio;
        this.idiomaOriginal = idiomaOriginal;
        this.descripcio = descripcio;
        this.data = data;

    }
    
    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDuracio() {
        return duracio;
    }

    public void setDuracio(String duracio) {
        this.duracio = duracio;
    }

    public String getIdiomaOriginal() {
        return idiomaOriginal;
    }

    public void setIdiomaOriginal(String idiomaOriginal) {
        this.idiomaOriginal = idiomaOriginal;
    }

    public String getDescripcio() {
        return descripcio;
    }
           
    public void setDescripcio(String descripcio) {
        this.descripcio = descripcio;
    }

}
