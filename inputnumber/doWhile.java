
package inputnumber;

import java.util.Scanner;

public class doWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x ,y;
        System.out.print("Enter inesital number ");
        x = input.nextInt();
        
         System.out.print("Enter Final Number ");
        y = input.nextInt();
        
         int sum =0;
        
        for (int i = x; i <=y; i++) {
            
            if(i%2==0)
                sum = sum + i;
                
            
         
           
            
        }
         System.out.print("total number " +sum); 
        
    }
}
