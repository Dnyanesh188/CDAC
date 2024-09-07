class Program10  {
    public static void main(String[] args) {
        
        if (args.length != 3) {
            System.out.println("Usage: java ArithmeticOperations <num1> <operator> <num2>");
            return;
        }

        
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[2]);
        char operator = args[1].charAt(0);  

        
        int result = 0;
        boolean validOperator = true;  

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                    return;
                }
                break;
            default:
                System.out.println("Error: Invalid operator. Use +, -, *, or /.");
                validOperator = false;
        }

        
        if (validOperator) {
            System.out.println("Result: " + num1 + " " + operator + " " + num2 + " = " + result);
        }
    }
}