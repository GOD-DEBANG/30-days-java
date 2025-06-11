
 import java.util.Scanner;

public class day26 {
    public static int fibo(int a){
        int nextnum = 0;
        int firstnum =0;
        int secondnum = 1;
        for(int i=1; i<=a; i++){
           System.out.print(i+",");
            nextnum = firstnum+secondnum;
            firstnum=secondnum;
            secondnum=nextnum;
        }
        return firstnum;           //Generate the Fibonacci series up to a given number of term
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int result = fibo(a);
        System.out.print(result);
        sc.close();
    }
}
