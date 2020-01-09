public class Addition
{
    public static void main( String args[] )	
    {	
        int n ;
        int n2 ;
        int addition ;

        System.out.print("entrez un premier nombre: " ) ;	
        n = Console.lireI() ;	
        System.out.println(n) ;
        System.out.print("Entrez un second nombre: ") ;
        n2 = Console.lireI();
        System.out.println(n2) ;
        addition = n + n2 ;
        System.out.print("Le résultat de l'addition de ces deux nombres est: ");
        System.out.println(addition);
        }
}