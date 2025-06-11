import java.util.*;
public class day8 {
    public static int fact(int n){
         int facto = 1;
        for(int i= 1; i<=n; i++){
           
         facto = facto*i;
        }
        return facto;             //Factorial of a Number: Calculate the factorial of a given number
    } 
        public static void main(String[] args) {
        System.out.println("Enter a number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = fact(n);
        System.out.println("The factorial of a number is : "+result);
        sc.close();
    }
}
