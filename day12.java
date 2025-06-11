import java.util.*;
public class day12 {
    public static int prime(int a){
    int count = 0;
    
    for(int i=1; i<=a; i++){
        if(a % i == 0){
            count ++;
        }
    }
    if(count == 2){
        System.out.println("Prime");
    }
    else{
        System.out.println("Not prime ");
    }
    return count;                                         //. Prime Number Check: Check if a number is prime
    }
    public static void main(String[] args) {
            System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int result = prime(num);
        System.out.println("The number is : "+result);
        sc.close();
    }
}

