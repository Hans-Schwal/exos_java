/*
Ecrire un programme qui met en œuvre le jeu du nombre magique :
L’ordinateur choisit un nombre aléatoire (à l’aide de la classe Random) et l’utilisateur doit trouver ce nombre.
A chaque fois que l’utilisateur saisit une valeur, il reçoit une indication lui indiquant « plus petit » ou « plus grand ».
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