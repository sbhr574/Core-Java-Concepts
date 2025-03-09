package Practice.SAS;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Find_Smaller_Than_Current_Number
{
    /**
     * Approach 1
     */

    private static void test(int[] ar)
    {
        int[] count = new int[102];

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

    /**
     * Approach 2
     * Another way to do it. This is easy and understandable
     */

    private static void getResult(int ar[])
    {
        int[] sorted_ar = ar.clone();
        Arrays.sort(sorted_ar);

        Map<Integer, Integer> mp = new HashMap<>();
        for(int i = 0; i<sorted_ar.length; i++)
        {
            mp.putIfAbsent(sorted_ar[i], i);
        }

        int[] result = new int[ar.length];
        for(int i=0; i<ar.length; i++)
        {
            result[i] = mp.get(ar[i]);
        }

        System.out.println(Arrays.toString(result));
    }

    public static void main(String[] args)
    {
        int[] th = {8,1,2,6,3, 5, 4};
        test(th);
        getResult(th);

    }
}
