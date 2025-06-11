import java.util.Scanner;
public class day21 {
public static  double intrest(double p, double t, double r){
        double cp = p * Math.pow(1 + r / 100,t);
        return cp-p;
    }
    public static void main(String[] args) {             //Compound Interest Calculation: Calculate compound interest
        Scanner sc = new Scanner(System.in);
        double p = sc.nextDouble();
        double r = sc.nextDouble();
        double t =sc.nextDouble();
        double result = intrest(p, t, r);
        System.out.println("The compound intrest is : "+result);
        sc.close();
    }
}


