
package inputnumber;

import java.util.Scanner;


public class NestedForLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x , y;
        
        System.out.print("Enter Your Frist Number ");
        x = input.nextInt();//3
        
        System.out.print("Enter Your End Number ");
        y = input.nextInt();//5
        for (int i = x; i <=y; i++) {
            System.out.println("\n\n");
            
            for (int j = 1; j <=10; j++) {
                System.out.println(i+ " x " +j +" = "+i*j);
            }
        }
    }
}
