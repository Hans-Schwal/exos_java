// Ecrivez un programme qui affiche la somme des nombres inférieurs à N.
public class SommeEntiers {

    public static void main(String[] args) {
        int somme = 0;
        int n = 1;

        while (n <= 20) {
            somme  = somme + n;
            n = n + 1;
        }
        System.out.println(somme);
    }
}