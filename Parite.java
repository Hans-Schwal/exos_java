public class Parite
{
    public static void main( String args[] )	
    {	
        int nombre ;

        System.out.println("Entrez un nombre: ");
        nombre = Console.lireI();
        if (nombre % 2 == 0)
        {
            System.out.println("Vous avez entré un nombre pair");
        }
        else
        {
            System.out.println("Vous avez entré un nombre impair");
        }
    }
}