
package inputnumber;

import java.util.Scanner;


public class CapitalSmall {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
    char x;
    System.out.print ("Enter any character ");
    x = input.next().charAt(0);
    
    if(x=='a' ||x=='e' ||x=='i' ||x=='o' ||x=='u'){
    System.out.println("vowel");
}else{
        System.out.println("consonel");
    }
    }
    
    
}
