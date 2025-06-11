import java.util.Scanner;
public class day1 {
    public static  int sum(int a, int b){
        int total = 0;
        total = a+b;
        return total;
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the value of First number : ");
       int a = sc.nextInt(); 
       System.out.println("Enter the value of Second number : ");
       int b = sc.nextInt();
       int add = sum(a,b);
       System.out.println("The sum of two number is "+add);
       
       sc.close();

    }
}
