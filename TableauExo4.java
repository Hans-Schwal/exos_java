/**
 * TableauExo4
 */
import java.util.Arrays; 

public class TableauExo4 {

    public static void main(String[] args) {
        int[] tableau = {56, 12, 32, 88, 7, 23, 99, 34, 1};

        Arrays.sort(tableau);

        for (int p : tableau) {
            System.out.print(p + " ");
        }
    }
}