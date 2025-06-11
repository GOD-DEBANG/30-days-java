import java.util.Scanner;
public class day22 {
    public static int sum(int num){
        int sum = 0;
        while(num > 0){
            sum = sum+num%10;
            num = num/10;
        }
        return sum;
    }
public static void main(String[] args) {                 // Calculate the sum of the digits of a given number
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int result = sum(num);
    System.out.println(result);
    sc.close();
}
}
