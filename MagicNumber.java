
/**
 * MagicNumber
 */
public class MagicNumber {

    public static void main(String[] args) {
        int reponse;
        
        int magic = (int)(Math.random()*100);
        //System.out.println(magic);

        do {
            System.out.println("Entrez un nombre");
            reponse = Console.lireI();

            if (reponse<magic) System.out.println("Trop petit");
            if (reponse>magic) System.out.println("Trop grand");
        } while (reponse!=magic);

        System.out.println("Bravo");

    }
}