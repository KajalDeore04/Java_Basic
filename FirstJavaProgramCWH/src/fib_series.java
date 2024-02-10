public class fib_series {

    static int FibonacciSeries(int n)
    {
        if(n==0){
            return 0;
        }

        return n + FibonacciSeries(n - 1);
    }


    public static void main(String[] args) {

        System.out.println(FibonacciSeries(5));
    }
}
