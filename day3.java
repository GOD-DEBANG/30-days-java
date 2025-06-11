
import java.util.Scanner;  //: Find the maximum of two given numbers using an if statement

public class day3{
    public static int max(int a, int b){
        
         if(a>b){
            return a;
         }
            else{
                return b;
            }
         }
         public static void main(String[] args) {
             Scanner sc = new Scanner(System.in);
             System.out.println("Enter the First number");
             int a = sc.nextInt();
             System.out.println("Enter the Second number");
             int b = sc.nextInt();
             int result = max(a,b);
             System.out.println("The maximum onumber between two number  a and b is : "+result);
             sc.close();
         }
}