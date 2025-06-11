import java.util.*;
public class day24 {
    public static int arm(int a){
    int temp = a;
    int sum =0,r;
    while(a > 0){
        r = a%10;
        a = a/10;
        sum = sum+r*r*r;
    }
      return sum;
   } 
public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int result = arm(a);
    if(a == result){
        System.out.println("It is arm strong");
    }
    else{
        System.out.println("It is not");               // Check if a number is an Armstrong number
    }
    System.out.println(result);
}
}
