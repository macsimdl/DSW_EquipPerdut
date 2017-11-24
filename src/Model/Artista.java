package Model;

public class Artista {
    protected String nom;
    protected String Nacionalitat;

    public Artista() {
    }

    public Artista(String nom, String Nacionalitat) {
        this.nom = nom;
        this.Nacionalitat = Nacionalitat;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNacionalitat() {
        return Nacionalitat;
    }

    public void setNacionalitat(String Nacionalitat) {
        this.Nacionalitat = Nacionalitat;
    }
}
