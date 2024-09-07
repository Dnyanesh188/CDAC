import java.util.Scanner;

class Program1f{
    public static void main(String[] args){
        int i  = 1;
        
        // Int cannot be converted to boolean directly. Int cannot be converted to String.
        Boolean b = Boolean.valueOf(i);

        System.out.println("After using valueOf it is : "+b);
    }
}