import java.util.Scanner;

public class RemoveDuplicate {
    public static int removeDuplicates(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }

        int j = 0; 

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[j]) {
                i++; 
                arr[j] = arr[i]; 
            }
        }

        return j + 1; 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        
        int[] arr = new int[size];
        System.out.println("Enter the elements of the sorted array:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        
        int newLength = removeDuplicates(arr);

        
        System.out.println("Length: " + newLength);
        System.out.println("Array with unique elements:");
        for (int i = 0; i < newLength; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}