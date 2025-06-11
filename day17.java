import java.util.Scanner;
public class day17 {
    public static double temparature(double c ){
        
        

       double  f = (c * 9.0/5.0) + 32;
       
       return f;
                                 //Celsius to Fahrenheit: Convert a temperature from Celsius to Fahrenheit
     
    }
public static void main(String[] args) {
    System.out.println("Enter tebhthe value : ");
    Scanner sc = new Scanner(System.in);
    int f = sc.nextInt();
    System.out.println("The temperature is "+temparature(f));
    sc.close();
}
}
