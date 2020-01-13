// II s'agit pour un nombre de secondes entré au clavier d'en déduire, son expression en nombre d'heures de minutes et de secondes.
public class ConversionSecondes
{
    public static void main( String args[] )	
    {	
        int secondesEntrees;
        int heures;
        int minutes;
        int secondes;

        System.out.println("Entrez un nombre de secondes: ");
        secondesEntrees = Console.lireI();
        heures = (secondesEntrees / 3600);
        minutes = ((secondesEntrees % 3600) / 60);
        secondes = (((secondesEntrees % 3600) % 60));
        System.out.println(heures + ":" + minutes + ":" + secondes);
    }
}