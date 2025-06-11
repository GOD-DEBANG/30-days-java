import java.util.*;
public class day13 {
    public static int leap(int a){
        if(a % 4 == 0){
            System.out.println(" leap year : ");
        }
        else{
            System.out.println("not leap year");            //Leap Year Check: Check if a given year is a leap year.

        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        int result = leap(a);
        System.out.println("The year is "+result);
        sc.close();
    }
}
