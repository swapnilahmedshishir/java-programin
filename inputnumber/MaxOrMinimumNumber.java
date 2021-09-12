
package inputnumber;

import java.util.Scanner;


public class MaxOrMinimumNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x, y, sum;
        System.out.print("Enter any two Numbeer : ");
        x =input.nextInt();
        y=input.nextInt();
        
        sum = (x>y)? x:y;
        System.out.println("Large NUmber = " +sum);
        
    }
}
