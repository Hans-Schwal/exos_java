// Reprendre le programme de calculette présenté dans le chapitre précédent, et le modifier pour intégrer des fonctions correspondant aux opérations effectuées.
public class CalculetteFonctions
{
    public static void main( String args[] )	
    {	
        int n ;
        char operateur ;
        int n2 ;
        //int resultat;
        
        System.out.println("Entrez un premier entier: ");
        n = Console.lireI();
        System.out.println("Entrez un opérateur: ");
        operateur = Console.lireC();
        System.out.println("Entrez un deuxième entier: ");
        n2 = Console.lireI();

        switch (operateur)
        {
            case '+':
                System.out.println("Le résultat est: " + (n + n2));
                break;
            case '-':
                System.out.println("Le résultat est: " + (n - n2));  
                break;
            case '/':
                if (n2 == 0)
                {
                    System.out.println("Impossible de diviser par zéro");
                    break;
                }
                System.out.println("Le résultat est: " + (n / n2));  
                break;
            case '*':
                System.out.println("Le résultat est: " + (n * n2));     
                break;
            default :
                System.out.println("Erreur!");  
        }
    }
}