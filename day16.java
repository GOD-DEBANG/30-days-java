import java.util.Scanner;
public class day16 {
   public static double  triangle(int base , int height){
    double value = 0.5;
    double area = value*(base*height);
    return area;
   }  
     public static void main(String[] args) {
        System.out.println("Enter the value of Base :");
         Scanner sc = new Scanner(System.in);
         int base = sc.nextInt();
         System.out.println("Enter the value of Height  :");
         int height = sc.nextInt();
         double result = triangle(base, height);
         System.out.println("The area of triangle is : "+result);
         sc.close();
     }                                           //Area of a Triangle: Calculate the area of a triangle given its base and height
}
