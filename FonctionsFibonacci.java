/**
 * Ecrire un programme qui affiche les premiers termes de la suite de Fibonacci. Les nombres de Fibonacci obéissent à la formule de récurrence suivante :

F(n) = F(n-1) + F(n-2)
avec 
    F(0) = 0 
    F(1) = 1
 */
public class FonctionsFibonacci {

    static int n1= 0, n2= 1, n3= 0;    
    static void printFibonacci(int count){    
        if(count>0){    
            n3 = n1 + n2;    
            n1 = n2;    
            n2 = n3;    
            System.out.print(" "+n3);   
            printFibonacci(count-1);    
        }    
    }    
    public static void main(String args[]){    
    int count=10;    
    System.out.print(n1+" "+n2);   
    printFibonacci(count-2);
 }  
}