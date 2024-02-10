import java.util.Scanner;
public class CWH_recursion {
        //factorial 0=1
        //factorial n= n * n-1 * n-2....1
    static int factorial(int n) {
            if (n == 0) {
                return 1;
            } else {
                return n * factorial(n - 1);
            }
    }

    static int factorial_iterative(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            int product=1;
            for (int i=1;i<=n;i++){
                product*=i;
            }
            return product;
        }
    }

    public static void main(String[] args) {

            System.out.println("enter the number you want factorial of");
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            System.out.println("factorial of n is: " + factorial(n));

       // System.out.println(factorial_iterative(3));
    }
}
