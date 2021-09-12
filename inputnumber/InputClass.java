

package inputnumber;

import java.util.Scanner;
public class InputClass {
  static void checkAge(int age){
      if(age<18){
          System.out.println("you are a young");
      }else
          System.out.println("you are old");
  }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter your age:");
         int x = input.nextInt();
    checkAge(x);
      
  
   
        
        
        
        
        
        
        
        
        



         
    
    }
 
}
