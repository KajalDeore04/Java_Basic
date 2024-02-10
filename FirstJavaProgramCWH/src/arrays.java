public class arrays {
    public static void main(String[] args) {

        //1st way
        int [] fruits ;
        fruits = new int[3];
                fruits[0]=4;
                fruits[1]=3;
                fruits[2]=5;

        //System.out.println(fruits[1]);
        for(int value: fruits){
            System.out.println(value);
        }

        //2nd way
        int[] marks = new int[5];
                marks[0]=100;
                marks[1]=45;
                marks[2]=75;
                marks[3]=65;
                marks[4]=90;

        //System.out.println(marks[1]);

        //3rd way
        int[] flowers={1,2,69,565};

        //System.out.println(flowers[2]);
    }
}






