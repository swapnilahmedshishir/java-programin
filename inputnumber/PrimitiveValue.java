
package inputnumber;

import java.util.Scanner;


public class PrimitiveValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x ;
        System.out.print("Enter any positive number ");
        x=input.nextInt();
       int count=0;
        for (int i = 2; i < x; i++) {
            if(x%2==0){
                count++;
                break;
            }
        }
        if(count==0){
            System.out.println("prime Number");
        }else{
            System.out.println("not prime number");
        }
    }
}
