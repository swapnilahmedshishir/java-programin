
package inputnumber;

import java.util.Scanner;


public class IncreementDecriment {
    
    
    public static void main(String[] args){
      Scanner input= new Scanner(System.in);
      int num1 ;
      System.out.print("Enter any  Integer number ");
      num1= input.nextInt();
      if(num1 >0){
          System.out.println("This Numer is Positive");
      }else if(num1<0){
          System.out.println("This Number is Negetive ");
          
      }else{
          System.out.println("This Number is Zero");
      }
      
    }
    
    
}
