
package inputnumber;

import java.util.Scanner;


public class Dhara {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x , sum= 1;
        System.out.print("Enter any Last Number = ");
        x = input.nextInt();
        
        for (int i = 1; i <=x;  i =i+2 ) {
            sum = sum * (i*i);
            System.out.print(i+"x"+i+" " );
        }
        System.out.println("...");
        System.out.println("Total mutipul  = " + sum);
    }
}
