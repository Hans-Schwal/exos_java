/* 
Ecrivez un programme qui demande l’année de naissance à l’utilisateur. 
En réponse votre programme doit afficher l’âge de l’utilisateur et indiquer si l’utilisateur est majeur ou mineur.
*/
public class Age
{
    public static void main( String args[] )	
    {	
        int age ;

        System.out.println("Entrez votre age: ");
        age = Console.lireI();
        if (age >= 18)
        {
            System.out.println("Vous avez " + age + " ans, vous êtes donc majeur.");
        }
        else
        {
            System.out.println("Vous avez " + age + " ans, vous êtes donc mineur.");
        }
    }
}