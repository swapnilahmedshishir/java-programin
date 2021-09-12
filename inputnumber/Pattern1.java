
package inputnumber;

import java.util.Scanner;


public class Pattern1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x;
        System.out.println("ENTER ANY LINE NUMBER ");
        x = input.nextInt();
        
        for (int row = 0; row <= x; row++) {
            for (int col = 0; col <= row; col++) {
                System.out.print(" A ");
            }
            System.out.println();
        }
        
    }     
}
