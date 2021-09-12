
package inputnumber;

import java.util.Scanner;


class ch {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Enteer any capital or Small letter ");
        char ch = input.next().charAt(0);
        
        
        if(ch>='a' && ch<='z'){
           System.out.println("thish letter is a small");
        }else if(ch>='A' && ch<='Z'){
            System.out.println("this is letter capitall");
        }else{
            System.out.println("this is no letter ");
        }
    }
}
