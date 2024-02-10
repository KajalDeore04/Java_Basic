public class CWH_ps5 {
    public static void main(String[] args) {
/*
        int []marks={12,113,1,12,13,34};
        int sum=0;
        for (int elements:marks){
            sum=sum+elements;
        }
        System.out.println(sum);




        int []marks={34,43,45,56,67};
        int num=88;
        boolean IsInArray= false;
        for (int element:marks) {
            if (num == element) {
                IsInArray = true;
                break;
            }
        }
        if (IsInArray){
            System.out.println("present");
        }
        else {
            System.out.println("absent");
        }


        int []marks={12,113,1,12,13,34};
        int sum=0;
        for (int elements:marks){
            sum=sum+elements;
        }
        System.out.println(sum/marks.length);


 */

        int[][] mat1={{1,2,3},
                     {2,4,5}};
        int[][]mat2={{2,3,4},
                    {4,6,7}};
        int[][]result={{0,0,0},
                    {0,0,0}};

        for (int i=0;i< mat1.length;i++){
            for (int j=0;j<mat1[i].length;j++){
                result[i][j]=mat1[i][j]+mat2[i][j];
            }
        }
        for (int i=0;i< mat1.length;i++){
            for (int j=0;j<mat1[i].length;j++){
                System.out.print(result[i][j]+" ");
                result[i][j]=mat1[i][j]+mat2[i][j];
            }
            System.out.println("");
        }
    }
}