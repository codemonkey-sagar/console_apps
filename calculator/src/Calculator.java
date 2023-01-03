import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. get input from user
        System.out.print("Enter the 1st number: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter the 2nd number: ");
        double num2 = sc.nextDouble();

        System.out.print("Choose Operation (+, -, /, *, %): ");
        char operator = sc.next().charAt(0);

        // 2. logic
        switch(operator) {
            case '+':
                System.out.print(num1 + " + " + num2 + " = " + (num1 + num2));
                break;

            case '-':
                System.out.print(num1 + " - " + num2 + " = " + (num1 - num2));
                break;

            case '/':
                System.out.print(num1 + " / " + num2 + " = " + (num1 / num2));
                break;

            case '*':
                System.out.print(num1 + " * " + num2 + " = " + (num1 * num2));
                break;

            case '%':
                System.out.print(num1 + " % " + num2 + " = " + (num1 % num2));
                break;

            default:
                System.out.println("Invalid Operator");
        }
    }
}
