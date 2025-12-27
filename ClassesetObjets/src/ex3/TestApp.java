package ex3;

import ex3.Article;
import ex3.Categorie;

public class TestApp {
    public static void main(String[] args) {
        // Créer 2 catégories
        Categorie[] categories = new Categorie[2];
        categories[0] = new Categorie("Ordinateur Portable", "O PR");
        categories[1] = new Categorie("Ordinateur Poste", "O PO");

        // Créer 4 articles
        Article[] articles = new Article[4];
        articles[0] = new Article(14, "DELL INSPIRON", categories[0]);
        articles[1] = new Article(4, "SONY VAIO", categories[0]);
        articles[2] = new Article(74, "TERRA", categories[1]);
        articles[3] = new Article(785, "HP Compaq", categories[1]);

        // Afficher les articles par catégorie (boucles imbriquées)
        for (int i = 0; i < categories.length; i++) {
            Categorie categorie = categories[i];
            System.out.println(categorie.getLibelle() + " :");
            
            for (int j = 0; j < articles.length; j++) {
                if (articles[j].getCategorie().getId() == categorie.getId()) {
                    System.out.println("  - " + articles[j].toString());
                }
            }
            System.out.println(); // Ligne vide entre catégories
        }
    }
}
