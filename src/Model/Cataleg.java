/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author mdominlo10.alumnes
 */
public class Cataleg {
     private ArrayList<Serie> series;

    public Cataleg() {
        series = new ArrayList();
    }

    public ArrayList<Serie> getSeries() {
        return series;
    }

    public void setSeries(ArrayList<Serie> series) {
        this.series = series;
    }
    
    public void addSerie(Serie s) {
        this.series.add(s);
    }
    
    public Serie getSerie(int i) {
        return series.get(i);
    }
}
