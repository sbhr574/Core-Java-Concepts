package Practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Two_pointer_Algo
{
    /**
     *
     * Two pointers means need to take two variable start and end which will
     * indicate two side first and last index
     */
    public static void main(String[] args)
    {
        int[] c = {-1,8, -3, 2, -5,6,9,4};
        Arrays.sort(c); //O(n log n)
        System.out.println(Arrays.toString(c));

        System.out.println(twoSum(c, 3, 0));

        System.out.println("Finding three number in array is sum equal to zero or not : "+findTripleSumZero(c));

        int arr[] = {3, 2,4};
        twoSum(arr, 6);


    }

    public static boolean twoSum(int[] a, int target, int startPoint)
    {
        int start = startPoint;
        int end = a.length - 1;
        while (start < end)
        {
            int sum = a[start] + a[end];

            if(sum == target)
            {
                System.out.println(start);
                System.out.println(end);
                return true;
            }
            else
                if(sum < target)
                {
                    start++;
                }
                else
                {
                    end--;
                }
        }

        return false;
    }

    public static int[] twoSum(int[] nums, int target)
    {
        Map<Integer, Integer> mp = new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            int num = target - nums[i];
            if(mp.containsKey(num))
            {
                return new int[]{mp.get(num), i};
            }
            mp.put(nums[i], i);
        }
        return new int[]{0,0};
    }

    private static boolean findTripleSumZero(int[] b)
    {
        for(int i=0; i< b.length - 2; i++)
        {
            if(twoSum(b, -b[i], i+1))
            {
                System.out.println("Found zero: "+ i);
                return true;
            }
        }
        return false;
    }
}
