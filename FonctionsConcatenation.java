/**
 * Ecrire une fonction de concaténation de chaînes
 */
public class FonctionsConcatenation {

    public static void main( String args[] ) {
        System.out.println(concatener("",  "", ""));
    }

    public static String concatener(String mot, String mot2, String resultat) {
        System.out.println("Entrez un mot");
        mot = Console.lireStr();
        System.out.println("Entrez un autre mot");
        mot2 = Console.lireStr();
        return resultat = "La fonction donne donc: " + mot + ' ' + mot2;
    }
}