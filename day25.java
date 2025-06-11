import java.util.Scanner;

public class day25 {
    public static int check(int a){
        int sum =0;
        int i = 0;
        while(a > 0){
            sum = sum+a%10;
             a = a/10;                      //Check if a number is a perfect number.
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int result = check(a);
        if(a == result){
            System.out.println("perfect");
        }
        else{
            System.out.println("Not perfect");
        }
        sc.close();
    }
}
