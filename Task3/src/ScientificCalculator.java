import java.util.Scanner;

public class ScientificCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Scientific Calculator!");
        System.out.println("Available operations:");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");
        System.out.println("5. Square Root (√)");
        System.out.println("6. Exponentiation (x^y)");
        System.out.println("7. Sine (sin)");
        System.out.println("8. Cosine (cos)");
        System.out.println("9. Tangent (tan)");
        System.out.println("10. Natural Logarithm (ln)");
        System.out.println("11. Logarithm (log)");

        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                performAddition(scanner);
                break;
            case 2:
                performSubtraction(scanner);
                break;
            case 3:
                performMultiplication(scanner);
                break;
            case 4:
                performDivision(scanner);
                break;
            case 5:
                performSquareRoot(scanner);
                break;
            case 6:
                performExponentiation(scanner);
                break;
            case 7:
                performSine(scanner);
                break;
            case 8:
                performCosine(scanner);
                break;
            case 9:
                performTangent(scanner);
                break;
            case 10:
                performNaturalLogarithm(scanner);
                break;
            case 11:
                performLogarithm(scanner);
                break;
            default:
                System.out.println("Invalid choice!");
        }

        scanner.close();
    }

    private static void performAddition(Scanner scanner) {
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        double result = num1 + num2;
        System.out.println("Result: " + result);
    }

    private static void performSubtraction(Scanner scanner) {
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        double result = num1 - num2;
        System.out.println("Result: " + result);
    }

    private static void performMultiplication(Scanner scanner) {
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        double result = num1 * num2;
        System.out.println("Result: " + result);
    }

    private static void performDivision(Scanner scanner) {
        System.out.print("Enter dividend: ");
        double dividend = scanner.nextDouble();
        System.out.print("Enter divisor: ");
        double divisor = scanner.nextDouble();
        if (divisor != 0) {
            double result = dividend / divisor;
            System.out.println("Result: " + result);
        } else {
            System.out.println("Error: Division by zero!");
        }
    }

    private static void performSquareRoot(Scanner scanner) {
        System.out.print("Enter a number: ");
        double num = scanner.nextDouble();
        if (num >= 0) {
            double result = Math.sqrt(num);
            System.out.println("Result: " + result);
        } else {
            System.out.println("Error: Square root of a negative number!");
        }
    }

    private static void performExponentiation(Scanner scanner) {
        System.out.print("Enter base: ");
        double base = scanner.nextDouble();
        System.out.print("Enter exponent: ");
        double exponent = scanner.nextDouble();
        double result = Math.pow(base, exponent);
        System.out.println("Result: " + result);
    }

    private static void performSine(Scanner scanner) {
        System.out.print("Enter angle in degrees: ");
        double angle = Math.toRadians(scanner.nextDouble());
        double result = Math.sin(angle);
        System.out.println("Result: " + result);
    }

    private static void performCosine(Scanner scanner) {
        System.out.print("Enter angle in degrees: ");
        double angle = Math.toRadians(scanner.nextDouble());
        double result = Math.cos(angle);
        System.out.println("Result: " + result);
    }

    private static void performTangent(Scanner scanner) {
        System.out.print("Enter angle in degrees: ");
        double angle = Math.toRadians(scanner.nextDouble());
        double result = Math.tan(angle);
        System.out.println("Result: " + result);
    }

    private static void performNaturalLogarithm(Scanner scanner) {
        System.out.print("Enter a number: ");
        double num = scanner.nextDouble();
        if (num > 0) {
            double result = Math.log(num);
            System.out.println("Result: " + result);
        } else {
            System.out.println("Error: Natural logarithm of non-positive number!");
        }
    }

    private static void performLogarithm(Scanner scanner) {
        System.out.print("Enter base: ");
        double base = scanner.nextDouble();
        System.out.print("Enter number: ");
        double num = scanner.nextDouble();
        if (base > 0 && base != 1 && num > 0) {
            double result = Math.log(num) / Math.log(base);
            System.out.println("Result: " + result);
        } else {
            System.out.println("Error: Logarithm with non-positive base or non-positive number!");
        }
    }
}
