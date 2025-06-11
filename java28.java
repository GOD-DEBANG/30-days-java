import java.util.Scanner;
public class java28 {
    public static int gcds(int num1, int num2){
        int gcd = 1;
        for(int i=1; i<=num1 && i<=num2; i++){
            
            if(num1%i == 0 && num2%i ==0){
                gcd = i;                                 //Greatest Common Divisor (GCD): Find the GCD of two numbers.
                 }
        }
        return gcd;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number : ");
        int num2 = sc.nextInt();
        int result = gcds(num1, num2);
        System.out.println("The greatest betewwn two number is : "+result);
        sc.close();
    }
}
