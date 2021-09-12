
package inputnumber;

import java.util.Scanner;


public class ForLoop {
    public static void main(String[] args) {
        String name;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any sentences ");
        name = input.nextLine();
        int i ;
        for(i=0;i<100;i++){
            System.out.println(i+" " +name);
        }
    }
}
