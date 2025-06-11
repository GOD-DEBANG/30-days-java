import java.util.*;
public class day18 {
    public static int prime(int a){
        int count = 0;
        for(int i=0; i<=a; i++){
            if(i%a == 0){
                count++;
            }
            if(count == 2){
                System.out.println("prime");
            }
            else{
                System.out.println("not prime");
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int result = prime(num);
        System.out.println(result);
        sc.close();
    }
}
