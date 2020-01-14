import java.util.HashMap;
	
public class Test {
    public static void main(String[] args) {

      HashMap<String, String> capitales = new HashMap<String, String>();
      
      capitales.put("Angleterre", "Londres");
      capitales.put("Allemagne", "Berlin");    
      capitales.put("France", "Paris");  
      capitales.put("USA", "Washington DC");

      System.out.println(capitales);
    } 
}