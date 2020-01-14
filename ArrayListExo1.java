import java.util.ArrayList;
import java.util.List;

/**
 * TableauExo1
 */
public class ArrayListExo1 {

    public static void main(String[] args) {
        int taille;
        List<Integer> tableau = new ArrayList<Integer>();;

        System.out.println("Entrez la taille du tableau");
        taille = Console.lireI();

        for (int i = 0; i < taille; i++) {
            System.out.println("Entrez une valeur pour la case " + i);
            tableau.add(Console.lireI());
        }

        for (int v : tableau) {
            System.out.print(v + " ");
        }
    }
}