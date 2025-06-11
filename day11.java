import java.util.*;
public class day11 {
    public static int pallin(int a){
        int reverse =0;
        int r;
        int normal = a;
        int pallindrom;
        while(a != 0){
            r = a % 10;            //. Palindrome Check (Number): Check if a number is a palindrome. 
            reverse = reverse*10+r;
            a = a/10;
        } 
        
            if(normal == reverse){
                System.out.println("Pllindeom");
               
            }
            else{
                System.out.println("Not pallindrom");
                
            }
            return reverse;
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            int result = pallin(num);
            System.out.println(result);
            sc.close();
        }
          
    }

