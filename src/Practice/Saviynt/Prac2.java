package Practice.Saviynt;

import java.util.Arrays;

public class Prac2 {

    public static void test(int ar[])
    {
        int[] ret = new int[ar.length];
        int j = 0;
        for(int i=0;i<ar.length - 1;i++)
        {
            if(!(ar[i]==ar[i+1]))
            {
                ret[j] = ar[i];
                j++;
            }
            else
            {
                i = (i+1);
                if(i == ar.length) break;
            }
        }
        System.out.println(Arrays.toString(ret));
    }

    public static void main(String[] args)
    {
        int[] numbers = new int[]{2,3,3,4,1,2,4,2,0};
        test(numbers);
    }
}
