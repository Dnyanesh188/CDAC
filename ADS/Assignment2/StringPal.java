import java.util.Scanner;

public class StringPal {

    
    public static boolean Palindrome(String str) {
        int n = str.length(); 

        
        for (int i = 0; i <= n / 2; i++) {
            if (str.charAt(i) != str.charAt(n - i - 1)) {
                return false; 
            }
        }
        return true; 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("String is :  ");
        String s = scanner.nextLine();

        
        if (Palindrome(s)) {
            System.out.println(s + " is a palindrome.");
        } else {
            System.out.println(s + " is not a palindrome.");
        }
    }
}