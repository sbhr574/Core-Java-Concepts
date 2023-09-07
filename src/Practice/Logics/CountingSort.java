package Practice.Logics;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 *      It will take the count of each number
 *      dosn't matter its sorted array or not
 *      best time to use when we know the range of array integer
 */
public class CountingSort
{

    private static int[] takeCount(int ar[])
    {
        int[] count = new int[102];
        for(int num : ar)
        {
            count[num]++;
        }
        return count;
    }

    public static void main(String[] args) {
        int nums[] = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(Arrays.toString(takeCount(nums)));
    }
}
