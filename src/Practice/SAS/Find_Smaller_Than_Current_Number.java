package Practice.SAS;

import java.util.Arrays;

public class Find_Smaller_Than_Current_Number
{
    private static void test(int[] ar)
    {
        int[] count = new int[20];

        for(int num : ar)
        {
            count[num]++;
        }

        for(int i=1; i<count.length; i++)
        {
            System.out.println(Arrays.toString(count));
            System.out.println(count[i] +"<->"+ count[i - 1]);
            System.out.println(count[i] + count[i - 1]);
            count[i] += count[i - 1]; //count[i] + count[i - 1] , means (current value + previous value)
            System.out.println(Arrays.toString(count));
        }

        int[] result = new int[ar.length];
        for(int i = 0; i< result.length; i++)
        {
            if(ar[i] == 0)
            {
                result[i] = 0;
            }
            else
            {
                result[i] = count[ar[i] - 1];
            }
        }
        System.out.println(Arrays.toString(result));

    }

    public static void main(String[] args)
    {
        int[] th = {8,1,2,2,3, 0, 0};
        test(th);

    }
}
