
import java.util.*;
public class day10 {
    public static int reverse(int a){       //Reverse a Number: Reverse the digits of a given integer
        int num = a;
        int r;
        int reversed =0;
        while(num > 0){
        r =  num % 10;
          reversed = reversed * 10 + r;
            num = num/10;
        }
        return reversed;
    }
    public static void main(String[] args) {
        System.out.println("Enter the number you want to reverse : ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int result = reverse(a);
        System.out.println("the reverse number for "+a+"is : "+result);
        sc.close();
    }
}
