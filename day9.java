import java.util.Scanner;
public class day9 {
    public static int sum(int a){
        int add = 0;
        for(int i=1; i<=a; i++){           //. Sum of Numbers from 1 to N: Calculate the sum of numbers from 1 to a given N.
            add = add+i;
        }
        return add;
    }
    public static void main(String[] args) {
        System.out.println("Enter the value for a : ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int result = sum(a);
        System.out.println("The sum of a is : "+result);
        sc.close();
    }
}
