/**
 * SommeMoyenne
 */
public class MoyenneBoucle {

    public static void main(String[] args) {
        
        int nombre = 0, somme = 0, compteur = -1, mini=Integer.MAX_VALUE, maxi=Integer.MIN_VALUE;
        double moyenne ;

        do {
            System.out.println("Entrez un nombre");
            nombre = Console.lireI();
            if(nombre>maxi) maxi=nombre;
            if(nombre!=0 && nombre<mini) mini=nombre;
            somme += nombre;
            compteur++;
        } while (nombre!=0);

        moyenne = somme / (double)compteur;

        System.out.println(mini);
        System.out.println(maxi);
        System.out.println(moyenne);


    }
}