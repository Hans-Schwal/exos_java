public class Participation {

    public static void main(String[] args) {
        int enfants, participation;
        double salaire;
        boolean celibataire;

        System.out.println("Entrez le nombre d'enfants");
        enfants = Console.lireI();
        System.out.println("Entrez le salaire");
        salaire = Console.lireD();
        System.out.println("Entrez le statut (m/c)");
        celibataire = Console.lireC()=='c';

        if (celibataire)
            participation = 20;
        else 
            participation = 25;

        participation += enfants*10;
        
        if (salaire<1200)
            participation +=10;

        if (participation>50)
            participation=50;


        System.out.println(participation);
    }
}