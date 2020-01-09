public class Moyenne
{
    public static void main( String args[] )	
    {	
        float devoirSurveille ;
        float devoirEcrit ;
        float travauxPrat ;
        float moyenne;

        System.out.println("Entrez la note du devoir surveillé: ");
        devoirSurveille = Console.lireF();
        System.out.println("Entrez la note du devoir écrit: ");
        devoirEcrit = Console.lireF();
        System.out.println("Entrez la note de travaux pratique: ");
        travauxPrat = Console.lireF();
        moyenne = ((devoirSurveille * 3) + (devoirEcrit * 2) + travauxPrat) / (3 + 2 + 1);
        System.out.println("La moyenne des notes est: " + moyenne);
    }
}