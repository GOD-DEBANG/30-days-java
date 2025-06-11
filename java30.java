import java.util.Scanner;

public class java30 {
    public static int power(int exponent , int base){
        int result = 1;
        for(int i=0; i<exponent; i++){
            result = result*base;
        }                                         // Calculate the power of a number (x^y).
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the  Exponent number");
        int exponent = sc.nextInt();
        System.out.print("Enter the Base  number");
        int base = sc.nextInt();
        int result = power(exponent, base);
        System.out.println(result);
        sc.close();
    }
}
