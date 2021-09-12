
package inputnumber;

import java.util.Scanner;


public class PalindormeNmber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0, num,r,trap;
        System.out.print("Enter any Mutiple  Number ");
        num = input.nextInt();
        
        trap=num;
        
        while(trap!=0){
            r = trap % 10;
            sum = sum *10 + r;
            trap = trap / 10;
        }
        if(num==sum){
            System.out.println("This is palindome number ");
        }
        else{
            System.out.println("This is not palindome Number ");
        }
    }
}
