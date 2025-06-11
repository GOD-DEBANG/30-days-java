import java.util.*;
public class day20 {
    public static int sp(int p , int r , int t){
        int simple_intrest = (p*r*t/100);
        return simple_intrest;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int r = sc.nextInt();            // Simple Interest Calculation: Calculate simple interest given principal, rate, and time
        int t = sc.nextInt();
        int result = sp(p, r, t);
        System.out.println("Simple intrest is "+result);
        sc.close();
    }
}
 