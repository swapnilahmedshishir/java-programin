
package inputnumber;

import java.util.Scanner;

public class OdddOrEvent {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num1;
        System.out.print("Enter any positive number ");
        num1 = input.nextDouble();
        int num2 = (int) num1;
        
        if(num2%2==0){
            System.out.println("your input Number is odd");
        }else{
            System.out.println("Your Numbe is event");
        }
    }
    
}
