/**
 * FonctionsExemple
 */
public class FonctionsExemple4 {
    public static void main(String[] args) {

        int c = Calcul(20);
        System.out.println(c);
        
    }

    public static int Calcul(int a) {
        if (a>0) return  a + Calcul(a-1);
        else return 0;
    }    
}