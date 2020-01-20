/**
 * Exercice1
 */
public class FunctionCalcul {

    public static void main(String[] arg) {
        try {
            System.out.println(calcul('$', 4, 0));
        }
        catch(Exception er) {
            System.out.println(er.getMessage());
        }
    }

    static double calcul(char op, double nombre1, double nombre2) throws Exception {

        double resultat=0;
        if (op=='+') {
            resultat=  (nombre1 + nombre2);
        }
        else if (op=='-') {
            resultat=  (nombre1 - nombre2);
        }
        else if (op=='*') {
            resultat= (nombre1 * nombre2);
        }
        else if (op=='/') {
            if (nombre2==0) 
                throw new Exception("Impossible");
            else
            resultat= (nombre1 / nombre2);
        }
        else {
            throw new Exception("L'opérateur doit être + - * /");
        }
        return resultat;
    }
}