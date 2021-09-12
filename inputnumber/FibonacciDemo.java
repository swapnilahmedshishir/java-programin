
package inputnumber;

import java.util.Scanner;

public class FibonacciDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter any number ");
        int x= input.nextInt();
        
        int frist=0;
        int second= 1;
        int faco;
        
        System.out.print(frist+" "+second);
        
        for (int i = 3; i <=x; i++) {
            faco = frist + second;
            System.out.print(" "+faco);
           frist= second;
           second= faco;
        }
    }

    
}
