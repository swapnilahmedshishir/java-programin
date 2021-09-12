
package inputnumber;

import java.util.Scanner;


class num1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2;
        
        System.out.print("plaese now conform your frist Number");
        num1 = input.nextInt();
        
        System.out.print("plaese noew conform your second Number ");
        num2 = input.nextInt();
        if(num1>num2){
            System.out.println("your frist number is maximum ");
            System.out.println("your second number is minimum");
        }else if(num1<num2){
            System.out.println("your second number is maximum ");
            System.out.println("your frist number is minimum");
        }else{
            System.out.println("your frist and Second Number is equal");
        }
    }
}
