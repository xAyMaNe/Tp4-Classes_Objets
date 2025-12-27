package ex3;

public class Categorie {
    private static int compteur = 0;
    private int id;
    private String libelle;
    private String code;

    public Categorie(String libelle, String code) {
        this.id = ++compteur;
        this.libelle = libelle;
        this.code = code;
    }

    public int getId() { return id; }
    public String getLibelle() { return libelle; }
    public void setLibelle(String libelle) { this.libelle = libelle; }
    public String getCode() { return code; }
    public void setCode(String code) { this.code = code; }

    @Override
    public String toString() {
        return String.format("Categorie{id=%d, libelle='%s', code='%s'}", id, libelle, code);
    }
}
