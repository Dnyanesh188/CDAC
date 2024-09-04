import java.util.Scanner;

public class P5{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select a shape ");
        String shape = scanner.nextLine().toLowerCase();

        double area;

        switch (shape) {
            case "circle":
                System.out.print("Enter the radius of the circle: ");
                double radius = scanner.nextDouble();
                area = Math.PI * radius * radius;
                System.out.printf("The area of the circle is: %.2f\n", area);
                break;

            case "square":
                System.out.print("Enter the side length of the square: ");
                double side = scanner.nextDouble();
                area = side * side;
                System.out.printf("The area of the square is: %.2f\n", area);
                break;

            case "rectangle":
                System.out.print("Enter the width of the rectangle: ");
                double width = scanner.nextDouble();
                System.out.print("Enter the height of the rectangle: ");
                double height = scanner.nextDouble();
                area = width * height;
                System.out.printf("The area of the rectangle is: %.2f\n", area);
                break;

            case "triangle":
                System.out.print("Enter the base of the triangle: ");
                double base = scanner.nextDouble();
                System.out.print("Enter the height of the triangle: ");
                double triangleHeight = scanner.nextDouble();
                area = 0.5 * base * triangleHeight;
                System.out.printf("The area of the triangle is: %.2f\n", area);
                break;

            default:
                System.out.println("Invalid shape");
                break;
        }

    }
}