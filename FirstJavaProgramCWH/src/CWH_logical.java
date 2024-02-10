public class CWH_logical {
    public static void main(String[] args) {
        boolean a=true;
        boolean b=false;
        if(a && b){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
        if(a || b){
            System.out.println("y");
        }
        else{
            System.out.println("n");
        }
        System.out.println(!a);                     //inverter
        System.out.println(!b);
        }
}
