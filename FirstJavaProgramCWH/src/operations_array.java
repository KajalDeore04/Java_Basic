public class operations_array {
    public static void main(String[] args) {

        int [] marks={22,30,60,87};

        System.out.println("LENGTH: "+marks.length);

        System.out.println("ELEMENT AT INDEX 2: "+marks[2]);


        System.out.println("In forward direction : ");

        for (int i=0;i<marks.length;i++){
            System.out.println(marks[i]);
        }

        System.out.println("Using for each loop: ");

        for (int element:marks){
            System.out.println(element);
        }

        System.out.println("In reverse : ");

        for (int i= marks.length-1;i>-1;i--){
            System.out.println(marks[i]);
        }
    }
}
