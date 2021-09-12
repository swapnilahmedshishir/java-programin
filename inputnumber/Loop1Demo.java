
package inputnumber;

import java.util.Scanner;


public class Loop1Demo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m ,n ;
        System.out.print("enter   start Number :");
        m= input.nextInt();
        System.out.print("enter   end Number :");
        n= input.nextInt();
        int sum = 0;
        for (int i = m; i<=n; i++) {
            sum = sum+i;
        }
        System.out.println("your total number " + sum);
    }

    
    }