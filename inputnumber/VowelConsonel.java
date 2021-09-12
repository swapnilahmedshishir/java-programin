
package inputnumber;

import java.util.Scanner;


public class VowelConsonel {
    
    public static void main(String[] args) {
       // int i = 0;
    Scanner input = new Scanner(System.in);
    char ch;
    System.out.print("Enter your charecter : ");
    ch = input.next().charAt(0);
    
    switch(ch){
        case 'a':
        case 'e':
        case 'o':
        case 'u':
        case 'i':
        case 'A':
        case 'E':
        case 'I':
        case 'O':
        case 'U':
            ch++;
                
    }
    if(ch==1){
        System.out.println(ch+" is vowel");
    }else if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z')) {
    System.out.println(ch+" is consolen" );
    }else{
    System.out.println("it is not a alphabet");
    }
        
    
    } 
}
