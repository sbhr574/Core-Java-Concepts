package Practice;

import java.util.Arrays;

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
