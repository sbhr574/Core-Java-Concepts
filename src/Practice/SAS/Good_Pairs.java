package Practice.SAS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Good_Pairs
{
    public static int numIdenticalPairs(int[] nums) {

        //Calculating the frequency of each number
        int[] count = new int[101];
        int totalCount = 0;
//        for(int num : nums)
//        {
//            count[num]++;
//        }

//        System.out.println(Arrays.toString(count));
//
//        for(int i: count)
//        {
//            totalCount += ((i) * (i-1))/2;
//        }

        for(int num : nums)
        {
            System.out.println(num +" - "+ Arrays.toString(count));
            totalCount+=count[num]++; //using the fact that count[num]++ is updated after assignment
            System.out.println(num +" - "+ Arrays.toString(count));
        }
        return totalCount;
    }

    private static void find_duplicate(int ar[])
    {
        int[] count = new int[101];


        for(int num : ar)
        {
            count[num]++;
            if(count[num] > 1)
            {
                if((count[num] < 3))
                    System.out.println(num);
            }
        }
    }

    public static void main(String[] args)
    {
        int[] th = {1,2,3,1,1,3};
        int[] ar = {1,1,1,1};
        int[] ar2 = {1,2,3,4};
//        System.out.println(numIdenticalPairs(ar));
//        System.out.println(numIdenticalPairs(ar2));

        find_duplicate(th);
    }
}
