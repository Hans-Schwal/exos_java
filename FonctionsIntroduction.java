/**
 * Reprendre le programme de calculette présenté dans le chapitre précédent, et le modifier pour intégrer des fonctions correspondant aux opérations effectuées.
 */
public class FonctionsIntroduction {

    public static void main(String[] args) {
        System.out.println(calcul('/', 2, 0));
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
}