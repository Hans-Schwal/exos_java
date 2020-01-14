/**
 * FonctionsExemple
 */
public class FonctionsExemple3 {

  

    public static void main(String[] args) {

        int[] tab={ 2, 3, 4, 6};

        for (int i : tab) {
            System.out.print(i + " ");
        }
        System.out.println();

        int resultat = Somme(tab);

        for (int i : tab) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println(resultat);
        
    }

    public static int Somme(int[] t) {
        int resultat = 0;

        for (int i = 0; i < t.length; i++) {
            resultat += t[i];
            t[i] = 0;
        }

        return resultat;
    }

    

    
}