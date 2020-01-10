/**
 * Comptage
 */
public class Comptage {

    public static void main(String[] args) {
        int age, jeunes=0, moyens=0, vieux=0;


        do {
            System.out.println("Entrez un âge");
            age = Console.lireI();
            if (age<20) 
                jeunes++;
            else if (age<=40)
                moyens++;
            else
                vieux++;
            
        } while (age<100);

        System.out.println(jeunes);
        System.out.println(moyens);
        System.out.println(vieux);
    }
}