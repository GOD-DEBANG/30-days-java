import java.util.Scanner;
public class day23 {
    public static int count(int num){    //Count the number of digits in a given number
        int count =0;
        while(num > 0){
            num = num/10;
            count ++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int result = count(num);
        System.out.println(result);
        sc.close();
    }
}
