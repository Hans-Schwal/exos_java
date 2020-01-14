/**
 * FonctionsExemple
 */
public class FonctionsExemple {

  

    public static void main(String[] args) {
        Affiche("Toto", 4);
        Affiche("Tutu", 2);
        Affiche("Titi", 1);

        int c = Calcul(3, 4);
        System.out.println(c);
        
    }

    public static int Calcul(int a, int b) {
        int resultat;

        resultat = a+b;

        return resultat;
    }

    public static void Affiche(String m, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("Message=");
            System.out.println(m);
        }
    }

    
}