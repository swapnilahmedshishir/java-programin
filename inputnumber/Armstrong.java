
package inputnumber;

import java.util.Scanner;


public class Armstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum= 0, num, r, team;
        System.out.println("Enter any multiple Number ");
        num = input.nextInt();
        
        team= num;
        while(team!=0){
            r = team % 10;
            sum = sum  + r*r*r;
            team = team / 10;
        }
        
        if(num==sum){
            System.out.println("This is amstrong Number ");
        }
        else{
            System.out.println("This is not amstrong Number ");
        }
    }
}
