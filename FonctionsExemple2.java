/**
 * FonctionsExemple
 */
public class FonctionsExemple2 {

  

    public static void main(String[] args) {

        int var1=1,var2=2;
        int c = Calcul(var1, var2);
        System.out.println("a="+var1);
        System.out.println("b="+var2);
        System.out.println(c);
        
    }

    public static int Calcul(int a, int b) {
        int resultat;

        resultat = a+b;
        a=0;
        b=0;

        return resultat;
    }

    

    
}