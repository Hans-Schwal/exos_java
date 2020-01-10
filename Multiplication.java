/**
 * Multiplication
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