/**
 * Reprendre le programme de calculette présenté dans le chapitre précédent, et le modifier pour intégrer des fonctions correspondant aux opérations effectuées.
 */
public class FonctionsIntroduction {

    public static void main(String[] args) {
        System.out.println(additionner(0,0,' ')); 
    }

    public static int additionner(int a, int b, char operateur) {
        System.out.println("Entrez un premier entier");
        a = Console.lireI();
        System.out.println("Entrez un operateur");
        System.out.println("Entrez un deuxième entier");
        b = Console.lireI();

        int resultat = a + b;

        return resultat;
    }
}