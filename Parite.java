/* 
Ecrivez un programme qui demande un nombre à l’utilisateur puis qui test si cenombre est pair.
Le programme doit afficher le résultat « nombre pair » ou « nombre impair ».
Vous devez utiliser l’opérateur modulo « % » qui donne le reste d’une division.
a%2 donne le reste de la division de a par 2, si ce reste est égale à zéro, a est divisible par 2.
*/
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