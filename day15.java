import java.util.Scanner;
public class day15 {
    public static int rectangle(int length, int breath){
        
        
        int perimeter =length*breath;
        return perimeter;
    }
public static void main(String[] args) {          //Area of a Rectangle: Calculate the area of a rectangle given its length and width
    System.out.println("Enter the value of length : ");
    Scanner sc = new Scanner(System.in);
    int length = sc.nextInt();
    System.out.println("Enter the value of width : ");
    int breath = sc.nextInt();
    int result = rectangle(length, breath);
    System.out.println("Perimeter of rectangle is : "+result);
    sc.close();
}
}
