import java.util.Random;
import java.util.Scanner;

public class CWh_rock_paper_scissor {
    public static void main(String[] args) {
        Random ran=new Random();
        Scanner sc=new Scanner(System.in);

        System.out.println("0-rock\n1-paper\n2-scissor");
        System.out.println("choose any");

        int user_input=sc.nextInt();
        System.out.println("you chose "+ user_input);

        int comp_choice= ran.nextInt(3);
        System.out.println("computer chose "+ comp_choice);

        if (user_input==comp_choice){
            System.out.println("DRAW");
        }
        else if (comp_choice==0) {
            if (user_input==1){
                System.out.println("YOU WON!!!!!!!!");
            } else if (user_input==2) {
                System.out.println("LOST");
            }
        } else if (comp_choice==1) {
            if (user_input==2){
                System.out.println("YOU WON!!!!!!");
            } else if (user_input==0) {
                System.out.println("LOST");
            }
        } else if (comp_choice==2) {
            if (user_input==0){
                System.out.println("YOU WON!!!!!!!!");
            } else if (user_input==1) {
                System.out.println("LOST");
            }
        }
    }
}
