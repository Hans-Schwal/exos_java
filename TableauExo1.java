/*Ecrivez un programme permettant de créer un tableau, dont la taille est saisie au clavier.
Ensuite l'utilisateur doit rentrer les différentes valeurs du tableau.
Puis votre programme doit afficher le contenu du tableau.
*/
import java.util.ArrayList;

public class TableauExo1 {

    public static void main(String[] args) {
        ArrayList<Integer> montableau = new ArrayList<Integer>();

        montableau.add(12);
        montableau.add(15);
        montableau.add(9);
        montableau.add(8);

        System.out.println(montableau);
    }
}