import java.io.PrintStream;

/**
 * Fonctions
 */
public class Fonctions {

    public static void main(String[] args) {
        
        System.out.println(calcul('/', 2, 0));

        System.out.println(concat("Bonjour", " toi!"));

        System.out.println(compteMot("Il            fait   beau à Amiens"));


        System.out.println(fib(24));

        multiplication(7);

        System.out.println(compteLettres("Bonne journée", 'n'));

 
        System.out.println(strtok("15/01/2020", "/", 2));
    }

    public static double calcul(char operateur, double val1, double val2) {
 
        double resultat = 0;

        if (operateur=='+') 
            resultat = val1+val2;
        else if (operateur=='-') 
            resultat = val1-val2;
        else if (operateur=='*') 
            resultat = val1*val2;
        else if (operateur=='/') {
            if (val2==0) {
                System.out.println("Opération impossible");
            }
            resultat = val1/val2;
        }
        else 
            System.out.println("L'opérateur doit être + - * /");
        return resultat;
    }

    public static String concat(String chaine1, String chaine2) {
 
        return chaine1 + chaine2;
    }


    public static int compteMot(String phrase) {
        int compteur = 0;

        String[] tab = phrase.split("\\s+");

        return tab.length;
    }

    public static int fib(int n) {
        int resultat = 0;
        int fib0 = 0;
        int fib1 = 1;

        for (int i = 1; i < n; i++) {
            resultat = fib0 + fib1;
            fib0 = fib1;
            fib1 = resultat;
        }
        return resultat;
    }

    public static int fib_rec(int n) {
        
        if (n==0)
            return 0;
        else if (n==1)
            return 1;
        else 
            return fib_rec(n-1) + fib_rec(n-2);
    }


    public static void multiplication(int n) {

        for (int i = 0; i < 11; i++) {
            System.out.println(i + " x " + n + " = " + (i*n));
        }
        
    }


    public static int compteLettres(String phrase, char lettre) {
        int compteur = 0;
        
        for (int i = 0; i < phrase.length(); i++) {
            if(phrase.charAt(i) == lettre)
                compteur++;
        }

        return compteur;
    }

    public static String strtok(String chaine, String separateur, int index) {
        String resultat = "";

        String[] tab = chaine.split(separateur);

        resultat = tab[index];

        return resultat;
    }
}