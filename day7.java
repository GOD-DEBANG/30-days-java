import java.util.Scanner;
public class day7{
public static double add(double a, double b){
      return a+b;
}            
public static double sub(double a, double b){
    return a-b;
}
public static double mul(double a, double b){
    return a*b;
}
public static double div(double a, double b){
    if(b == 0){
       System.out.println("Invalid ");//Simple Calculator: Implement functions for addition, subtraction, multiplication, and division.

       return 0;
    }
    return a/b;
}

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Choices could be upto 4 from 1 ");
    System.out.println("Enter your choice : ");
    int output = sc.nextInt();
   System.out.println("The choice you enterd is : "+output);
if(output >= 1 && output <= 4 ){
    System.out.println("Choises are valid , please ;proceed");
}
else{
    System.out.println("Invalid choice cant be proceeded further");
}
System.out.println("Enter the first number :  ");

double a = sc.nextDouble();
System.out.println("Enter the second number :  ");
double b = sc.nextDouble();
double result = 0;
switch (output){
    case 1: 
    result = add(a, b);
    break;
    case 2:
    result = sub(a, b);
    break;
    case 3:
    result = mul(a, b);
    break;
    case 4:
    result = div(a, b);
    break;
    default:
    break;
}
System.out.println("The value of numner "+a+ "number" +b+ "is :" + result);
sc.close();
}

}