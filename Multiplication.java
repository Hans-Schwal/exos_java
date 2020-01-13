/*
Ecrire un programme qui calcule les N premiers multiples d'un nombre entier X, N et X étant entrés au clavier.
Exemple pour N=5 et X=7
Il est demandé de choisir la structure répétitive (for, while, do...while) la mieux appropriée au problème.
On ne demande pas pour le moment de gérer les débordements (overflows) dus à des demandes de calcul dépassant la capacité de la machine.
 */
public class Multiplication {

    public static void main(String[] args) {
        int N, X;

        System.out.println("Entrez un nombre");
        N = Console.lireI();

        System.out.println("Entrez un nombre");
        X = Console.lireI();

        for (int i = 1; i < N+1; i++) {
            System.out.printf("%d x %d = %d",i, X, i*X);
            System.out.println();
        }
    }
}