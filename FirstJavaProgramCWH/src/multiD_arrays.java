public class multiD_arrays {
    public static void main(String[] args) {

        int [][] flats = new int[2][3];
        flats[0][0]=100;
        flats[0][1]=101;
        flats[0][2]=102;
        flats[1][0]=110;
        flats[1][1]=111;
        flats[1][2]=112;

        System.out.println("printing using for loop");

        for (int i=0; i<flats.length; i++)
        {
            for (int j = 0; j < flats[i].length; j++)
            {
                System.out.print(flats[i][j]);
                System.out.print(" ");
            }
            System.out.println(" ");
        }
    }
}
