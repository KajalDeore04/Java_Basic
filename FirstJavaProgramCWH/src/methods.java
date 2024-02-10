
   public class methods {

    static void tellJoke(){
        System.out.println("hello");
    }

    static int logic(int x , int y){
        if (x>y){
            x=x+y;
        }
        else {
            x=(x+y)*5;
        }
        return x;
    }

    public static void main(String[] args) {
        System.out.println(logic(2,1));
        tellJoke();
    }
   }



