/*
On recherche dans un tableau contenant 20 prénoms, un prénom saisi au clavier.
Lorsque cet élément est trouvé, on l’élimine du tableau en décalant les cases qui le suivent, et en mettant à blanc la dernière case
*/
public class TableauExo2 {

     public static void main(String[] args) {
        String prenom;
        String[] tableau = {"Alexandre", "Matthieu", "Loic", "Hans", "Mihaela", "Alex", "François"};
        int position = -1;

        System.out.println("Entrez le prénom à supprimer");
        prenom = Console.lireStr();

        for (int i = 0; i < tableau.length; i++) {
            if (tableau[i].equalsIgnoreCase(prenom)) {
                position = i;
            }
        }

        if (position!=-1) {
            System.out.println("Le prénom est trouvé à la position " + position);
            for (int i = position; i < tableau.length-1; i++) {
                tableau[i] = tableau[i+1];
            }
            tableau[tableau.length-1] = "";
        }
        else {
            System.out.println("Le prénom na pas été trouvé");
        }


        for (String p : tableau) {
            System.out.println(p);
        }
    }
}