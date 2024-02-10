public class CWH_break_and_continue {
    public static void main(String[] args) {
    /*    for (int i=0;i<5;i++){
            System.out.println(i);
            if (i==2){
                System.out.println("end");
                break;
            }
        }

        int i=0;
        while(i<5){
            System.out.println(i);
            if (i==2){
                System.out.println("end");
                break;
            }
            i++;
        }
        System.out.println("finally ended");

     */

        for (int i=0;i<5;i++) {
            if (i == 2) {
                continue;
            }                                   //printing everything except 2
            System.out.println(i);
            System.out.println("finally ended");
        }
    }
}
