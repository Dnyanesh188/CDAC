import java.util.Scanner;

public class removeSpaces {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.println("Enter a string:");
        String input = scanner.nextLine();
        
        
        String result = remove(input);
        
        
        System.out.println("Output: " + result);
        
        
        scanner.close();
    }

   
    public static String remove(String str) {
        StringBuilder s = new StringBuilder(); 

        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            
            if (ch != ' ') {
                s.append(ch);
            }
        }

        return s.toString(); 
    }
}