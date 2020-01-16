/**
 * DesCercles
 */
public class DesCercles extends Cercles{
    // Constructeur
    public DesCercles(double rayon, double PI) {
        super(rayon, PI);
    }

    public static void main(String[] args) {
        // Instanciation
        Cercles cercle1 = new Cercles(10.0, 3.1416);
        System.out.println("cercle 1:");
        // Appels des getters
        System.out.println("rayon: " + cercle1.getRayon());
        System.out.println("PI: " + cercle1.getPI());
        // Utilisation des méthodes de la classe Cercles
        System.out.println("surface: " + cercle1.calculSurface());
        System.out.println("ciconférence: " + cercle1.calculCirconference());
        Cercles cercle2 = new Cercles(45.0, 3.1416);
        System.out.println("cercle 2:");
        System.out.println("rayon: " + cercle2.getRayon());
        System.out.println("PI: " + cercle2.getPI());
        System.out.println("surface: " + cercle2.calculSurface());
        System.out.println("ciconférence: " + cercle2.calculCirconference());
    }
}