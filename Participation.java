/* 
Un patron décide de calculer le montant de sa participation au prix du repas de ses employés de la façon suivante :
    si il est célibataire participation de 20%
    si il est marié participation de 25%
    si il a des enfants participation de 10% supplémentaires par enfant
    La participation est plafonnée à 50%
Si le salaire mensuel est inférieur à 1200 € la participation est majorée de 10%
Ecrire le programme qui lit les informations au clavier et affiche pour chaque salarié, la participation à laquelle il a droit.
*/
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