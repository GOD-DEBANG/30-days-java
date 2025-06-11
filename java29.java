import java.util.Scanner;

public class java29 {
    public static int gcd(int num1 , int num2){
        int gcd = 1;
        for(int i=1; i<= num1 && i<= num2; i++){
            if(num1%i == 0 && num2%i == 0){
                gcd = i;
            }
        }
        return gcd;
    }
    public static int lcd(int num1, int num2){
        int gcd = gcd(num1, num2);                         // LCM of two numbers
        
       int lcm = (num1*num2) / gcd;
        return lcm;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number :");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number : ");
        int num2 = sc.nextInt();
        int result = lcd(num1, num2);
        System.out.println("The LCM of two numbers is : "+result);
        sc.close();
    }
}
