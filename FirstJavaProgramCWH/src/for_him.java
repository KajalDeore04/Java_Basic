import java.util.Scanner;
public class for_him {
    public static void main(String[] args) {
            methods();
    }
    private static void methods() {
        int ch;
        Scanner cs=new Scanner(System.in);
        int a=cs.nextInt();
        int b=cs.nextInt();
        System.out.println("Choose 1 for add");
        System.out.println("Choose 2 for sub");
        System.out.println("Choose 3 for mul");
        System.out.println("Choose 4 for div");
        System.out.println("Choose 5 for exit");
        do{
        Scanner sc = new Scanner(System.in);
        ch = sc.nextInt();

            switch (ch) {
                case 1:
                    if (ch == 1) {
                        System.out.println(a + b);
                    }
                    break;
                case 2:
                    if (ch == 2) {
                        System.out.println(a - b);
                    }
                    break;
                case 3:
                    if (ch == 3) {
                        System.out.println(a * b);
                    }
                    break;
                case 4:
                    if (ch == 4) {
                        System.out.println(a / b);
                    }
                    break;


            }


    }while (ch<5);
    }
}
