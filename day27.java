
import java.util.Arrays;
import java.util.Scanner;
public class day27 {
    public static void swap(int arr[],int start,int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        

        
    }
    public static void main(String[] args) {
                                                    //swaping of two number

        Scanner sc = new Scanner(System.in);
         int arr[] = {1,2,3,4,5,6,7,8,9};
         System.out.println("Enter first number to swap");
         int start = sc.nextInt();
         System.out.println("Second first number to swap");
         int end = sc.nextInt();

        swap(arr, start, end);
        int array = arr.length;
        if (start >= 0 && start < arr.length && end >= 0 && end < arr.length){

            System.out.println("Swaping can be done ");
        }
        else{
            System.out.println("Swapping cant be done ");
        }
        
        for(int i=0; i<array; i++){
         
            
            System.out.println(Arrays.toString(arr));
        }
        sc.close();
    }
}
