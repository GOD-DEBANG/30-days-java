import java.util.Scanner;
                               //: Find the minimum of three given numbers using nested if statements
public class day4 {
    public static int max(int a, int b, int c){
         if(a > b){
            return a;
         }
         if(b > c){
            return b;
         }
         else{
            return c;
         }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First number : ");
        int a = sc.nextInt();
        System.out.println("Enter Second number : ");
        int b = sc.nextInt();
        System.out.println("Enter Third number : ");
        int c = sc.nextInt();
        int result = max(a,b,c);
        System.out.println("The largest of three number between a,b,c : "+result);
        sc.close();
        
    }
}
