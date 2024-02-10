public class CWH_10_incr_decr {
    public static void main(String[] args) {
        int i=5;

        //INCREMENT

        //int b=i++;                  first value of i is assigned to b then incremented (5)
        //int b=++i;                  first incremented then value assigned (6)
        System.out.println(i++);
        System.out.println(i);
        System.out.println(++i);
        System.out.println(i);

        //DECREMENT

        //int a=i--;
        //int a=--i;
        System.out.println(i--);
        System.out.println(i);
        System.out.println(--i);
        System.out.println(i);


        char a='B';
        System.out.println(a++);
        System.out.println(++a);
        System.out.println(a--);
        System.out.println(--a);
    }
}
