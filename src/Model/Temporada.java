package Model;

import java.util.ArrayList;
public class Temporada {
     private int numero;
    private ArrayList<Episodi> episodis;

    public Temporada() {
        episodis = new ArrayList();
    }

    public Temporada(int numero, ArrayList<Episodi> episodis) {
        this.numero = numero;
        this.episodis = episodis;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public ArrayList<Episodi> getEpisodis() {
        return episodis;
    }

    public void addEpisodis(Episodi ep) {
        this.episodis.add(ep);
    }
}
