/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inputnumber;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class SumOfDigitRiverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0, num,r,tram;
        System.out.println("Enter any digit of number ");
        num= input.nextInt();
        
        tram = num;
        
        while(tram!=0){
            r= tram%10;
            sum= r +sum*10;/*this line is diffeant sum digit*/
            tram= tram/10;
        }
        System.out.println("sum = "+sum);
    }
}
