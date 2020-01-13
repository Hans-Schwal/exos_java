// Ecrivez un programme qui saisit deux nombres n1 et n2 et qui calcul ensuite la somme des entiers de n1 à n2.
public class SommeIntervalle {

    public static void main(String[] args) {
        int n1 = 1;
        int n2 = 5;
        int somme = 0;

        while (n1 <= n2) {
            somme = somme + n1;
            n1 = n1 + 1;
        }
        System.out.println(somme);
    }
}