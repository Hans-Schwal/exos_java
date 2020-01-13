/*
Ecrire le programme qui compte le nombre de voyelles d’un mot saisi au clavier, en utilisant :
    length() qui rend le nombre de lettres d’une chaîne donnée (documentation).
    substring(p,n) qui extrait d’une chaîne donnée une sous chaîne de n caractères à partir de la position p (documentation).
    IndexOf(schaîne) qui restitue le rang de la première occurrence de schaîne dans chaîne donnée (si non trouvé : -1) (documentation).
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