// En utilisant la formule C = (5/9)(F-32) écrire un programme qui lit une température exprimée en degrés Fahrenheit et affiche sa valeur en degrés Celsius.
public class Temperature
{
    public static void main( String args[] )	
    {	
        float temperature;

        System.out.println("Entrez une température en Fahrenheit: ");
        temperature = Console.lireF();
        temperature = ((temperature - 32)*5)/9;
        System.out.println("La température en Celsius est: " + temperature);
    }
}