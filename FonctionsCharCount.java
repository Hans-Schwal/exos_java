/*
Ecrivez une fonction qui prend deux paramètres :
phrase de type string et lettre de type string
La fonction compte le nombre de fois ou lettre apparait dans phrase
La fonction pourrait s’utiliser de la façon suivante :

int nombre = CompteLettre("combien de fois", "o");	
System.out.println(nombre);

Cet exemple devrait afficher

2
 */
public class FonctionsCharCount {

    public static void main(String[] args) {
        String phrase;
        char lettre;

        System.out.println("Entrez une phrase");
        phrase = Console.lireStr();
        System.out.println("Entrez le caractère à compter");
        lettre = Console.lireC();
        System.out.println(CompteLettre(phrase, lettre));
    }


    public static int CompteLettre(String phrase, char lettre) {
        int compteur = 0;                  
        for (int i = 0; i < phrase.length(); i++) 
        if (phrase.charAt(i) == lettre)             
        compteur++;                         
  	return compteur;   
    }
}