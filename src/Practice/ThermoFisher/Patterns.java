package Practice.ThermoFisher;

public class Patterns
{
    public static void main(String[] args) {
//        for(int row = 0; row<4; row++)
//        {
//            for (int col = 0; col<=row; col++)
//            {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        for(int i=0; i<5; i++)
        {
            for(int j=0;j<5-i; j++)
            {
                System.out.print(" ");
            }
            for (int k=0; k<=i;k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=5;i>=1;i--){
            for(int k=5;k>i;k--)
                System.out.print(" ");
            for(int j=1;j<(i*2);j++)
                System.out.print("*");
            System.out.println();
        }

        for(int i=0; i<5; i++)
        {
            for(int j=0;j<i; j++)
                System.out.print(i+j+" ");
            System.out.println();
        }
        int i, j;

        for(i=0;i<5;i++){
            for(j=0;j<5-i;j++){
                System.out.print("*");
            }System.out.println();
        }System.out.println("---");
    }
}
