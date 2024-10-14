import java.util.Scanner;

public class ReverseNumber {

    
    public static int reverseNumber(int num) {
        int reverse = 0;
        //int Negative = num < 0 ? -1 : 1; 
        
        while (num != 0) {
            int digit = num % 10;  
            reverse = reverse * 10 + digit;  
            num /= 10; 
        }
        
        return reverse ; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
       
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        
        int result = reverseNumber(num);
        
        
        System.out.println("Reversed Number: " + result);
        
        sc.close();
    }
}