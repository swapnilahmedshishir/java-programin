
package inputnumber;

import java.util.Scanner;


public class Series {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x ;
        System.out.print("enter your last number");
        x = input.nextInt();
       int y= 0;
        for (int i = 1; i <=x; i++) {
             y = y + i;
        }
      
        System.out.println("total value " + y);
    }
}
