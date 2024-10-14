import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {

    
    public static void reverseArray(int[] arr) {
        int l= 0;
        int r = arr.length - 1;
        
        while (l < r) {
            
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            
            
            l++;
            r--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        
       
        int[] arr = new int[n];
        
        
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        
        System.out.println("Original Array: " + Arrays.toString(arr));
        
       
        reverseArray(arr);
        
        
        System.out.println("Reversed Array: " + Arrays.toString(arr));
        
        sc.close();
    }
}