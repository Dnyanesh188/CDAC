import java.util.*;

class P1{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Please enter the number");
        int Num = scanner.nextInt();

        if(Num % 400 == 0){
            System.out.println(Num + " is a leap  year");
        }
        else if(Num % 4 == 0  && Num % 100 != 0){
            System.out.println(Num + " is a leap year");
        }
        else{
            System.out.println(Num + " is not a leap year");
        }
    }
}