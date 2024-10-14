import java.util.Arrays;
import java.util.Scanner;
public class LeftRotate{

     public static int[] rotateLeft(int[] arr, int d){

        int n = arr.length;
        int [] rotatedArr = new int[n];

        for(int i = 0; i < n; i++){
          
            int j = (i - d + n) % n;
            rotatedArr[j] = arr[i];
        }
        return rotatedArr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        System.out.println("Enter the size of array : ");
        int n = sc.nextInt();

        int[] arr = new int [n];
        System.out.println("Enter the elements of an array : ");
        for(int i = 0; i < n; i++){

            arr[i] = sc.nextInt(); 
        }

        System.out.print("Enter the key of array : ");
        int d = sc.nextInt();

        int[] rotatedArr = rotateLeft(arr,d);

        System.out.println("Rotated Array : " + Arrays.toString(rotatedArr));
    }
}