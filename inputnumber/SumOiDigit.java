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
public class SumOiDigit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num,sum=0,r ;
        
        System.out.print("Enter any mutipul digit ");
        num = input.nextInt();
        
        int trem= num;
        while(trem!=0){
           r=trem%10;
           sum=sum+r;
           trem= trem/10;
        }
        System.out.println("sum = "+sum);
                
        
    }
}
