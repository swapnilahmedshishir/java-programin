
package inputnumber;

import java.util.Scanner;


public class FactoralDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x, fact = 1;
        System.out.print("Enter any positive Number ");
        x = input.nextInt();
        
        System.out.print(x+"! =");
        
        for (int i = x; i >= 1; i--) {
            fact = fact * i;
            System.out.print(i+"x");
        }
        
        System.out.println("");
        System.out.println("Total factorial number  " +  fact);
    }
}
