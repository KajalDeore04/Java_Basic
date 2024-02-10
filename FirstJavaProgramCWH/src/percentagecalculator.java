import java.util.Scanner;

public class percentagecalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] subjects = {"science", "Maths", "English"};
        int[] marks = new int[3];
        int totalMarks = 0;

        for (int i = 0; i < subjects.length; i++)
        {
            System.out.println(subjects[i] + " marks");
            marks[i] = sc.nextInt();
            totalMarks += marks[i];
        }

        int percentage = totalMarks / 3;

        System.out.println(percentage + "%");
    }
}









        /*Scanner sc = new Scanner(System.in);
        System.out.println("science marks");
        int a= sc.nextInt();
        System.out.println("maths marks");
        int b= sc.nextInt();
        System.out.println("english marks");
        int c= sc.nextInt();
        System.out.println("hindi marks");
        int d= sc.nextInt();
        System.out.println("history marks");
        int e= sc.nextInt();

        int percentage = (a+b+c+d+e)/5;

        System.out.println("the percentage obtained is=");
        System.out.print(percentage);


    }

}*/
