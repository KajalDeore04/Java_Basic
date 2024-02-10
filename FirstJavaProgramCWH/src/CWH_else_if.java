import java.util.Scanner;
public class CWH_else_if {
    public static void main(String[] args) {
        System.out.println("please enter your age");
        Scanner cs= new Scanner(System.in);
        int age=cs.nextInt();

        if (age>56){
            System.out.println("you are old");
        }
        else if (age>46) {
            System.out.println("semi aged");
        }
        else if (age>36) {
            System.out.println("semi semi aged");
        }
        else{
            System.out.println("oh boy u r young");
        }
    }
}
