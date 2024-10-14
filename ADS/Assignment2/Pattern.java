import java.util.Scanner;

public class Pattern{
    public void print(){
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number  : ");
        int n = sc.nextInt();
        
        for(int i = 1; i <= n; i++){

            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        
    }

    public static void main(String[] args) {
        Pattern p = new Pattern();
        p.print();
    }
}