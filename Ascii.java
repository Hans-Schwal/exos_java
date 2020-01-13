/*
Ecrire un programme qui saisit un code Unicode en décimal et affiche le caractère correspondant.
Exemple: la saisie de l’entier 65 donne le caractère « A ».
*/
public class Ascii
{
    public static void main( String args[] )	
    {	
        float unicode;
        char caractere;

        System.out.println("Veuillez entrer un Unicode en décimal: ");
        unicode = Console.lireF();
        caractere = (char) unicode;
        System.out.print("La conversion en caratère est: " + caractere);
    }
}