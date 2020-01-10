/**
 * Voyelles
 */
public class Voyelles {

    public static void main(String[] args) {
        int compteur = 0;

        System.out.println("Entrez un mot");
        String mot  = Console.lireStr();

        for (int i = 0; i < mot.length(); i++) {
            
            String lettre = mot.substring(i, i+1);
            System.out.println("["+lettre+"]");
            if (lettre.equals("a") || lettre.equals("e") || lettre.equals("i") || lettre.equals("o") || lettre.equals("u") || lettre.equals("y")) {
                compteur++;
            }
        }

        System.out.println(compteur);

    }
}