import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * TableauExo1
 */
public class ArrayListExo2 {

    public static void main(String[] args) {
        String prenom;
        ArrayList<String> maliste = new ArrayList<String>();

        maliste.add("Alexandre");
        maliste.add("Matthieu");
        maliste.add("Loic");
        maliste.add("Hans");
        maliste.add("Mihaela");
        maliste.add("Alex");
        maliste.add("François");

        System.out.println(maliste);

        System.out.println("Entrez le prénom à supprimer");
        prenom = Console.lireStr();

        maliste.remove(prenom);

        System.out.println(maliste);
        
    }
}