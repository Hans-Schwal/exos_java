/**
 * Premier
 */
public class Premier {

    public static void main(String[] args) {
        int nombre;
        boolean premier=true;

        System.out.println("Entrez un nobre");
        nombre = Console.lireI();


        for (int i = 2; i < nombre; i++) {
            //System.out.println(i);
            if (nombre % i == 0) {
                premier = false;
                break;
            }
        }

        if (premier && nombre>1)
            System.out.println("Le nombre est premier");
        else
            System.out.println("Le nombre n'est pas premier");
    }
}