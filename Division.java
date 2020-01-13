// Modifier le programme précédent pour effectuer une division.
public class Division
{
    public static void main( String args[] )	
    {	
        double n ;
        double n2 ;
        double division ;

        System.out.print("entrez un premier nombre: " ) ;	
        n = Console.lireI() ;	
        System.out.println(n) ;
        System.out.print("Entrez un second nombre: ") ;
        n2 = Console.lireI();
        System.out.println(n2) ;
        division = n / n2 ;
        System.out.print("Le résultat de la division de ces deux nombres est: ");
        System.out.println(division);
    }
}