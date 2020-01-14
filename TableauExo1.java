/*Ecrivez un programme permettant de créer un tableau, dont la taille est saisie au clavier.
Ensuite l'utilisateur doit rentrer les différentes valeurs du tableau.
Puis votre programme doit afficher le contenu du tableau.
*/
public class TableauExo1 {

    public static void main(String[] args) {
        int taille;
        int[] tableau;

        System.out.println("Entrez la taille du tableau");
        taille = Console.lireI();
        tableau = new int[taille];

        for (int i = 0; i < tableau.length; i++) {
            System.out.println("Entrez une valeur pour la case " + i);
            tableau[i] = Console.lireI();
        }

        for (int v : tableau) {
            System.out.print(v + " ");
        }
    }
}