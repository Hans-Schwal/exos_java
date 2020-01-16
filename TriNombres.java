/*
Cette classe comporte 2 données membres : 1 tableau de types entiers et la taille du tableau.
Cette classe contient 3 méthodes (fonctions membres) :
    Fonction saisie () qui crée le tableau suivant la taille de ce dernier et qui demande à l’utilisateur de remplir le tableau de nombres.
    Fonction tri() qui trie le tableau.
    Fonction affiche() qui affiche le tableau.
Créer un second fichier comme application qui crée 2 tableaux de tailles différentes, qui les trie et qui les affiche.
*/
public class TriNombres {
    // Attributs
    int taille;
    int tableau[] = new int[5];

    // Constructeur
    public TriNombres(int taille) {
        this.taille = taille;
    }

    // Méthodes
    public String saisie(int taille, String donnees) {
        System.out.println("Entrez la taille du tableau");
        taille = Console.lireI();
        tableau = new int[taille];

        for (int i = 0; i < tableau.length; i++) {
            System.out.println("Entrez une valeur pour la case " + i);
            tableau[i] = Console.lireI();
        }

        for (int v : tableau) {
            System.out.print(v + " ");
        }

        return taille + donnees;
    }

    public void tri() {
        for (int j = 0; j < tableau.length; j++) {
            for (int i = 0; i < tableau.length - 1; i++) {
                if (tableau[i] < tableau[i + 1]) {
                    int tmp = tableau[i];
                    tableau[i] = tableau[i + 1];
                    tableau[i + 1] = tmp;
                }
            }
        }

        for (int p : tableau) {
            System.out.print(p + " ");
        }
    }
}