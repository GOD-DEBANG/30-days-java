import java.util.Scanner;
public class day19 {
    public static double celcious(double f){
           
           double cel = (f - 32)*5/9;


           return cel;
                                              //. Fahrenheit to Celsius: Convert a temperature from Fahrenheit to Celsius.
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double f = sc.nextDouble();
        double result = celcious(f);
        System.out.println("The temperature is :  "+result);
        sc.close();
    }
    
}
