
package inputnumber;

import java.util.Scanner;


public class TimeTableDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum;
        System.out.println("Namoter value = ");
        sum = input.nextInt();
        
        for (int i = 1; i <=10; i++) {
            System.out.println(sum + " x "+i+" = "+sum*i);
        }
    
    
    }
}
