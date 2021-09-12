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
public class Patten2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x ;
        System.out.println("Enter any line Number ");
        x = input.nextInt();
        
        for (int row = x; row >= 1; row--) {
            for (int col = 1; col <= row ; col++) {
                System.out.print(" "+col);
            }
            System.out.println();
        }
    }
}
