/**
 * Ecrire une fonction qui affiche le nombre de mots d’une phrase
 */
public class FonctionsStr {

    public static void main(String[] args) {
        System.out.println("Il y a " + (nombreStr()+1) + " mots");
    }

    public static int nombreStr(){
        String str;
        int spaceCount = 0;
        System.out.println("Ecrivez une phrase");
        str = Console.lireStr();

        for (char c : str.toCharArray()) {
            if (c == ' ') {
                spaceCount++;
            }
        }
        return spaceCount;
    }
}