import java.util.Scanner;
import java.lang.Math;

public class MathFunctions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2;

        System.out.print("Enter the first number: ");
        num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        num2 = scanner.nextDouble();

        System.out.println("Math Functions Menu:");
        System.out.println("1. Square Root");
        System.out.println("2. Power");
        System.out.println("3. Absolute Value");
        System.out.println("4. Cube root");
        System.out.println("5. Max value");
        System.out.println("6. Min value");
        System.out.println("7. Interchange sign");
        System.out.println("8. Exponential");
        System.out.println("9. log");
        System.out.println("10. log10");
        System.out.println("11. Sin");
        System.out.println("12. Cos");
        System.out.println("13. Tan");
        System.out.println("14. Sinh");
        System.out.println("15. Cosh");
        System.out.println("16. Tanh");

        do {
            System.out.print("Enter your choice (1-16): ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Square Root of num1: " + Math.sqrt(num1));
                    System.out.println("Square Root of num2: " + Math.sqrt(num2));
                    break;
                case 2:
                    System.out.print("Enter the exponent: ");
                    double exponent = scanner.nextDouble();
                    System.out.println("Result: " + Math.pow(num1, exponent));
                    System.out.println("Result: " + Math.pow(num2, exponent));
                    break;
                case 3:
                    System.out.println("Absolute Value of num1: " + Math.abs(num1));
                    System.out.println("Absolute Value of num2: " + Math.abs(num2));
                    break;
                case 4:
                    System.out.println("Cube Root of num1: " + Math.cbrt(num1));
                    System.out.println("Cube Root of num2: " + Math.cbrt(num2));
                    break;
                case 5:
                    System.out.println("Max Value between num1 and num2: " + Math.max(num1, num2));
                    break;
                case 6:
                    System.out.println("Min Value between num1 and num2: " + Math.min(num1, num2));
                    break;
                case 7:
                    System.out.println("Interchanged Sign of num1: " + (-num1));
                    System.out.println("Interchanged Sign of num2: " + (-num2));
                    break;
                case 8:
                    System.out.println("Exponential of num1: " + Math.exp(num1));
                    System.out.println("Exponential of num2: " + Math.exp(num2));
                    break;
                case 9:
                    System.out.println("Natural Logarithm (base e) of num1: " + Math.log(num1));
                    System.out.println("Natural Logarithm (base e) of num2: " + Math.log(num2));
                    break;
                case 10:
                    System.out.println("Base 10 Logarithm of num1: " + Math.log10(num1));
                    System.out.println("Base 10 Logarithm of num2: " + Math.log10(num2));
                    break;
                case 11:
                    System.out.println("Sine of num1: " + Math.sin(num1));
                    System.out.println("Sine of num2: " + Math.sin(num2));
                    break;
                case 12:
                    System.out.println("Cosine of num1: " + Math.cos(num1));
                    System.out.println("Cosine of num2: " + Math.cos(num2));
                    break;
                case 13:
                    System.out.println("Tangent of num1: " + Math.tan(num1));
                    System.out.println("Tangent of num2: " + Math.tan(num2));
                    break;
                case 14:
                    System.out.println("Hyperbolic Sine of num1: " + Math.sinh(num1));
                    System.out.println("Hyperbolic Sine of num2: " + Math.sinh(num2));
                    break;
                case 15:
                    System.out.println("Hyperbolic Cosine of num1: " + Math.cosh(num1));
                    System.out.println("Hyperbolic Cosine of num2: " + Math.cosh(num2));
                    break;
                case 16:
                    System.out.println("Hyperbolic Tangent of num1: " + Math.tanh(num1));
                    System.out.println("Hyperbolic Tangent of num2: " + Math.tanh(num2));
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }while (1>0);

    }

}

