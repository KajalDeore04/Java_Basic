import java.util.Scanner;

public class CWH_switch_case {
    public static void main(String[] args) {
        System.out.println("please enter your age");
        Scanner cs= new Scanner(System.in);
        int age=cs.nextInt();                               //same for string and char


        switch (age) {
            case 18:
                System.out.println("not a teen anymore");
                break;
            case 21:
                System.out.println("gonna be an adult");
                break;
            case 55:
                System.out.println("get retired");
                break;
            case 100:
                System.out.println("die already");
                break;
            default:
                System.out.println("enjoy!");
                break;
        }
    }
}
