import java.util.*;
public class day2 {     // Write a function to calculate the average of three given  numbers 
    public static int avg(int a, int b, int c){
        int average =0;
        average = (a+b+c)/3;
        return average;
    }
    public static void main(String[] args) {
        
    
    Scanner sc = new Scanner(System.in);
    System.out.println("enter 1st number ");
    int a = sc.nextInt();
    System.out.println("enter 2nd number");
   int b = sc.nextInt();
   System.out.println("Enter 3rd number");
   int c = sc.nextInt();
   int total = avg(a,b,c);
   
   System.out.println("The average of two number is : "+total);
    
   sc.close(); 
}
}
