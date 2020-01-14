/**
 * Ecrire un programme qui permet de trier un tableau en utilisant le tri à bulles.
 */
public class TableauExo3 {

    public static void main(String[] args) {
        int[] tableau = {56, 12, 32, 88, 7, 23, 99, 34, 1};

        for (int j = 0; j < tableau.length; j++) {
            for (int i = 0; i < tableau.length-1; i++) {
                if (tableau[i] < tableau[i+1]) {
                    int tmp = tableau[i];
                    tableau[i] = tableau[i+1];
                    tableau[i+1] = tmp;
                }
            }
        }


        for (int p : tableau) {
            System.out.print(p + " ");
        }
    }    
}