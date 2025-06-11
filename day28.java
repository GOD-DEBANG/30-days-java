import java.util.Scanner;

public class day28 {
    public static void multiplication(int num ){
              for(int i=1; i<11; i++){
            int multiply = i*num;
            System.out.print(" "+multiply);
        }
        
    }                                                  // multiplication table.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int i = sc.nextInt();
        int num =0;
        multiplication(i);
        sc.close();
    }
}
