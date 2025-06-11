import java.util.*;
public class day6{
    public static int num(int a ){
        if(a > 0){
            System.out.println("Positive");
            return +1;
        }
        else if(a < 0 ){
            System.out.println("Negative");        //Check if a number is positive, negative, or zero..
            return -1;
        }
        else{
            System.out.println("zero");
            return 0;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int result = num(a);
        System.out.println(result);
        sc.close();
    }
}                                                  