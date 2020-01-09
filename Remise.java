public class Remise
{
    public static void main(String[] args)
    {
        double prix;
        int qte;
        double remise = 0;
        double port = 0;
        double prixtotal;

        System.out.println("Entrer le prix unitaire: ");
        prix = Console.lireD();
        System.out.println("Entrer la quantite commandee: ");
        qte = Console.lireI();

        double total = prix*qte;

        if(total <= 500) {
            double port2 = total*0.02;
            /*
            on verifie que la valeur de port2 est supérieure à 6.
            Si tel est le cas, on exécute bien l'opération "total*0.02" soit 2% du prix total.
            Sinon, on attribue une nouvelle valeur, à savoir 6.
            */
            port = (port2 > 6) ? port2 : 6;
        }
        /*
        On éxécute une condition pour appliquer une remise de 5% si le prix total est compris entre 100€ et 200€.
        Au delà de ce barême, on applique une remise de 10%.
        */
        if((total > 100) && (total <200)){
            remise = total*0.05;
        } else if(total > 200) {
            remise = total*0.1;
        }

        prixtotal = total + port - remise;
        System.out.print("Prix a payer: ");
        System.out.print(prixtotal);
    }
}