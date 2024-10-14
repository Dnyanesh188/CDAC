import java.util.Scanner;

public class ReverseWord{

    public static void reverseWords(String s) {
        
        String[] w = s.split(" ");

        for (int i = w.length - 1; i >= 0; i--) {
            System.out.print(w[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        System.out.print("Enter a sentence: ");
        String s = sc.nextLine();
        
        
        reverseWords(s);
        
        sc.close();
    }
}