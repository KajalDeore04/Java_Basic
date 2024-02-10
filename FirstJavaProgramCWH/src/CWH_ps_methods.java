public class CWH_ps_methods {

    static int multitable(int a) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(a * i);
        }
        return 0;
    }


    static void stars(int n) {
        for (int i =0; i <= n; i++) {
            for (int j =0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


    static int sum(int a){
        if(a==0){
            return 0;
        }
            return a+sum(a-1);

    }


    static void reversed_stars(int n) {
        for (int i =n; i >= 0; i--) {
            for (int j =0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


    static int fib_series(int f){
        if(f==0){
            return 0;
        } else if (f==1) {
            return 1;

        }
        return fib_series(f-1) + fib_series(f-2);
    }

    static int average(int...arr){
        int total=0;
        for(int a : arr){
            total+=a;
        }
        int avg=total/arr.length;
        return avg;
    }

    public static void main(String[] args) {
        multitable(3);
        stars(4);
        int c=sum(4);
        System.out.println(c);
        reversed_stars(4);
        int a= fib_series(2);  //0,1,1,2,3,5,8,13,21,34 this is printing number at that point
        System.out.println(a);
        int x =average(30,20,40,10);
        System.out.println(x);
    }
}




