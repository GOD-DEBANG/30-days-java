import java.util.*;
public class day14 {
    public static double area(int radius){
        
        double area_of_circle = 0;
        double pi = 3.14;
        area_of_circle = pi*radius*radius;
       return area_of_circle;
    }                                                 //Area of a Circle: Calculate the area of a circle given its radius
    public static void main(String[] args) {
        System.out.println("Enter the value for radius :");
        Scanner sc = new Scanner(System.in);
        int radius = sc.nextInt();
        
        
        
         
        System.out.println(area(radius));
        sc.close();

    }
}
