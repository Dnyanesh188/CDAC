import java.util.Scanner;

class P3{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age : ");
        int Y = scanner.nextInt();

        if(Y < 18){
            System.out.println("You are not eligible to vote");
        }else{
            System.out.println("You are eligible to vote");
        }
    }
}