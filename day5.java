
import java.util.Scanner;

public class day5 {
    public static void check(int a) {
        if (a % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }                                   //Check if a given number is even or odd
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int a = sc.nextInt();
        check(a); // No return value needed
        sc.close();
    }
}
