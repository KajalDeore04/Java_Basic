public class CWH_method_overloading {
    static void change(int a){
        a=98;
    }

    static void change2(int [] arr){
        arr[0] = 98;
    }
    static void tellJoke(){
        System.out.println("ant is big");
    }


    public static void main(String[] args) {
        tellJoke();


        //CHANGING THE ARRAY case 1
        int [] marks = {25,56,85,47};
        int x= 25;              //value doesnt change
        change(x);
        System.out.println("the value of x after change is :  " + x);

        //case2
        change2(marks);         //value gets changed
        System.out.println("the value of [0] is:  " + marks[0]);

    }
}
