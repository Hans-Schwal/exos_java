import java.util.Arrays;

/*
Cette classe comporte 2 données membres : 1 tableau de types entiers et la taille du tableau.
Cette classe contient 3 méthodes (fonctions membres) :
    Fonction saisie () qui crée le tableau suivant la taille de ce dernier et qui demande à l’utilisateur de remplir le tableau de nombres.
    Fonction tri() qui trie le tableau.
    Fonction affiche() qui affiche le tableau.
Créer un second fichier comme application qui crée 2 tableaux de tailles différentes, qui les trie et qui les affiche.
*/

public class TriNombres {

    int [] tab;
    int taille;

    public void saisie() {
        System.out.println("Entrez la taille du tableau");
        this.taille = Console.lireI();
        this.tab = new int[this.taille];

        for (int i = 0; i < tab.length; i++) {
            System.out.println("Entrez une valeur pour la case " + i);
            this.tab[i] = Console.lireI();
        }
    }

    public void tri() {
        Arrays.sort(this.tab);
    }

    public void affiche() {
        System.out.println("Contenu du tableau");
        for (int i : tab) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

}