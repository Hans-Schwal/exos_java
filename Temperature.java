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