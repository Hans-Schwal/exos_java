import java.util.ArrayList;
import java.util.Collections;

/**
 * ArrayListExemple
 */
public class ArrayListExemple {

    public static void main(String[] args) {

        ArrayList<String> maliste = new ArrayList();

        maliste.add("Alexandre");
        maliste.add("Matthieu");
        maliste.add("Loic");
        maliste.add("Hans");
        maliste.add("Mihaela");

        Collections.sort(maliste);

        maliste.forEach( (prenom)-> { System.out.println(prenom); } ); 


    }
}