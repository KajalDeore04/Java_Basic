public class CWH_varagrs {
    /*
    static int sum(int a,int b){
        return a+b;
    }
    static int sum(int a,int b, int c){
        return a+b+c;
    }

     */
    static int sum(int...arr){                       // available as int []a
        int result=0;
        for(int a: arr){
            result+=a;
        }
        return result;
    }

    static int rule(int x,int...arr){                // as we provide x it will be must to take one element compulsory
        int result=0;
        for(int a: arr){
            result+=a;
        }
        return result;
    
    }


        public static void main(String[] args) {
        System.out.println(sum(4,5));
        System.out.println(sum(1,2,1));
        System.out.println(sum());
    }
}
