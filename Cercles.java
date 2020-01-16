/**
Cercles
Dans un fichier nommé Cercles.java, créer la classe de même nom avec 1 variable rayon comme donnée membre.
Créer 2 fonctions membres calculSurface() et calculCirconference() qui retournent le résultat sous forme de double.
Créer un second fichier DesCercles.java comme application qui crée 2 objets Cercles de 10 et 45 cm de rayon et qui affiche leur Surface et leur Circonférence.
*/
public class Cercles {
    // Attributs
    private double rayon;
    private double PI;
    // Constructeur
    public Cercles(double rayon, double PI) {
        this.rayon = rayon;
        this.PI = PI;
    }
    // Méthodes
    // Getter
    public double getRayon(){
        return rayon;
    }
    // Setter
    public void setRayon(double rayon){
        this.rayon = rayon;
    }
    // Getter
    public double getPI(){
        return PI;
    }
    // Setter
    public void setPI(double PI){
        this.PI = PI;
    }
    // Fonction pour le calcul de la surface
	public double calculSurface() {
        double surface;
        surface = PI * (rayon * rayon);
        return surface;
    }
    // Fonction pour le calcul de la circonférence
    public double calculCirconference(){
        double circonference;
        circonference = 2 * PI * rayon;
        return circonference;
    }
}