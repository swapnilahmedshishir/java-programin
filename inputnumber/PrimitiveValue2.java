
package inputnumber;

import java.util.Scanner;


public class PrimitiveValue2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x,y,count=0,totalPrime=0;
        
        System.out.println("Enter your frist Number ");
        x = input.nextInt();
        
        System.out.println("Enter your frist Number ");
        y = input.nextInt();
        
        for (int i =x ; i <= y; i++) {
            for (int j = 2; j <=i-1; j++) {
                if(i%j==0){
                    count++;
                    break;
                }
            }
            if(count==0){
                System.out.println(i);
                totalPrime++;
            }
            count=0;
        }
        System.out.println("totalPrime Number = "+totalPrime);
    }
}
