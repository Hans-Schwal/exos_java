    public class Exemple2
    {	
        final static double PI=3.1416;	
	
        public static void main(String[] args)	
        {
            char versEtFoncProgramme;
            double rayon;
            double perimetre;
            double surface;
 
            System.out.println("**** Périmètre et surface du Cercle (V1.0, 09/01/20) ****"); 
            System.out.println("Entrer le rayon: ");
            rayon = Console.lireD();
            perimetre = 2 * PI * rayon;
            System.out.print("Le périmètre vaut: ");
            System.out.println(perimetre);
            surface = PI * (rayon * rayon);
            System.out.print("La surface vaut: ");
            System.out.println(surface);
        }	
    }