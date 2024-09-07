import java.util.Scanner;

class Program1c{
    public static void main(String[] args){
        String strStatus = "true";

        boolean b = Boolean.parseBoolean(strStatus);

        System.out.println("After unboxing it is : "+ b);    
    }
}