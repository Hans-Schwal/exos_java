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