
package inputnumber;


public class BitwiseOperator {
    public static void main(String[] args) {
        int x= 32, y=12;
        int c;
        c = x>>3;
        System.out.println("X>>Y = " +c);
        
        c = y>>3;
        System.out.println("X>>Y = " +c);
        
        c = x<<3;
        System.out.println("X<<Y = " +c);
        
        c = y<<3;
        System.out.print("X<<Y = " +c);
    }
}
