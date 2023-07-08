 /*Ques 9)Write a program called Arithmetic that takes three command-line arguments: two integers followed by an arithmetic operator (+, -, * or /). The program shall perform the corresponding operation on the two integers*/
public class Arithmetic {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Invalid number of arguments!");
            System.out.println("Usage: java Arithmetic <operand1> <operator> <operand2>");
            System.exit(1);
        }

        int operand1 = Integer.parseInt(args[0]);
        String operator = args[1];
        int operand2 = Integer.parseInt(args[2]);

        int result;

        switch (operator) {
            case "+":
                result = operand1 + operand2;
                System.out.println("Result: " + result);
                break;
            case "-":
                result = operand1 - operand2;
                System.out.println("Result: " + result);
                break;
            case "*":
                result = operand1 * operand2;
                System.out.println("Result: " + result);
                break;
            case "/":
                if (operand2 != 0) {
                    result = operand1 / operand2;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid operator!");
                break;
        }
    }
}

