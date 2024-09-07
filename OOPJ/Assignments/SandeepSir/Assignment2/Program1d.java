import java.util.Scanner;

class Program1d{
    public static void main(String[] args){

        String strStatus = "0";

        //boolean value other than "true" will print false for both 1 and 0.
        boolean b = Boolean.parseBoolean(strStatus);

        System.out.println("After unboxing it is : "+ b);
    }
}