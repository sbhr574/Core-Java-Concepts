package Practice.Oracle;

public class Patterns_Prac
{
    public static void main(String[] args) {
//        int num = 20;
//        int n = (num/2);	 // for row
//        int count_No = 1;
//        for(int row=n; row>1; row--)
//        {
//            for(int col = 1; col<row; col++)
//            {
//                System.out.print(count_No + " ");
//                count_No++;
//            }
//            System.out.println();
//        }


//        int count = 1;
//        int rowCol = 6;
//        for(int row=1; row<rowCol; row++)
//        {
//            for (int gap = 1;gap<row;gap++)
//            {
//                System.out.print(" ");
//            }
//            for (int col = 1;col<rowCol-row;col++)
//            {
//                System.out.print(" "+count);
//                count++;
//            }
//            System.out.println();
//        }

//        for(int i=1;i<=5;i++) {
//
//            for (int k = 1; k <= 5 - i; k++) {
//                System.out.print(" ");
//            }
//            for (int j = 1; j <= i; j++) {
//                System.out.print(" *");
//            }
//            System.out.println();
//        }


        int num = 10;
        int n = (num/2);	 // for row
        int count_No = 1;
        for(int row=1; row<n; row++)
        {

            for(int col = n-row; col>0; col--)
            {
                System.out.print(count_No + " ");
                count_No++;
            }
            //for space
            for (int k2 = 1; k2<row; k2++) {
                System.out.print(" ");
            }
            System.out.println();
        }

    }
}
